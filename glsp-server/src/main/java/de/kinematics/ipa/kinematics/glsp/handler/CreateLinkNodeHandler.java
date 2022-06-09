/********************************************************************************
 * Copyright (c) 2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
package de.kinematics.ipa.kinematics.glsp.handler;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.graph.util.GraphUtil;
import org.eclipse.glsp.server.emf.AbstractEMFCreateNodeOperationHandler;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.model.notation.NotationFactory;
import org.eclipse.glsp.server.emf.model.notation.NotationPackage;
import org.eclipse.glsp.server.emf.model.notation.SemanticElementReference;
import org.eclipse.glsp.server.emf.model.notation.Shape;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.CreateNodeOperation;

import com.google.inject.Inject;

import de.kinematics.ipa.kinematics.glsp.KinematicsModelTypes;
import kinematics.KinematicsFactory;
import kinematics.KinematicsPackage;
import kinematics.Link;
import kinematics.Robot;

public class CreateLinkNodeHandler extends AbstractEMFCreateNodeOperationHandler {

   @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreateLinkNodeHandler() {
      super(KinematicsModelTypes.LINK);
   }

   @Override
   public Optional<Command> createCommand(final CreateNodeOperation operation) {
      GModelElement container = modelState.getIndex().get(operation.getContainerId()).orElseGet(modelState::getRoot);
      Optional<GPoint> absoluteLocation = getLocation(operation);
      Optional<GPoint> relativeLocation = getRelativeLocation(operation, absoluteLocation, container);

      return Optional.of(createLinkAndShape(relativeLocation));
   }

   @Override
   public String getLabel() { return "Link"; }

   protected Command createLinkAndShape(final Optional<GPoint> relativeLocation) {
      Robot robot = modelState.getSemanticModel(Robot.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      Link newLink = createLink();
      Command linkCommand = AddCommand.create(editingDomain, robot,
         KinematicsPackage.Literals.ROBOT__LINKS, newLink);

      Shape shape = createShape(idGenerator.getOrCreateId(newLink), relativeLocation);
      Command shapeCommand = AddCommand.create(editingDomain, diagram,
         NotationPackage.Literals.DIAGRAM__ELEMENTS, shape);

      CompoundCommand compoundCommand = new CompoundCommand();
      compoundCommand.append(linkCommand);
      compoundCommand.append(shapeCommand);
      return compoundCommand;
   }

   protected void setInitialName(final Link link) {
      Function<Integer, String> nameProvider = i -> "New" + link.eClass().getName() + i;
      int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
      link.setName(nameProvider.apply(nodeCounter));
   }

   protected Link createLink() {
      Link newLink = KinematicsFactory.eINSTANCE.createLink();
      setInitialName(newLink);
      newLink.setId(UUID.randomUUID().toString());
      return newLink;
   }

   protected Shape createShape(final String elementId, final Optional<GPoint> relativeLocation) {
      Shape newLink = NotationFactory.eINSTANCE.createShape();
      newLink.setPosition(relativeLocation.orElse(GraphUtil.point(0, 0)));
      newLink.setSize(GraphUtil.dimension(60, 25));
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newLink.setSemanticElement(reference);
      return newLink;
   }
}
