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
package org.eclipse.glsp.example.javaemf.handler;

import java.util.Optional;
import java.util.function.Function;

import com.google.inject.Inject;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.example.javaemf.TaskListModelTypes;
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

import xacro.Link;
import xacro.Robot;
import xacro.XacroFactory;
import xacro.XacroPackage;

public class CreateTaskNodeHandler extends AbstractEMFCreateNodeOperationHandler {

    @Inject
    protected EMFNotationModelState modelState;

    @Inject
    protected EMFIdGenerator idGenerator;

    public CreateTaskNodeHandler() {
        super(TaskListModelTypes.TASK);
    }

    @Override
    public Optional<Command> createCommand(final CreateNodeOperation operation) {
        GModelElement container = modelState.getIndex().get(operation.getContainerId()).orElseGet(modelState::getRoot);
        Optional<GPoint> absoluteLocation = getLocation(operation);
        Optional<GPoint> relativeLocation = getRelativeLocation(operation, absoluteLocation, container);

        return Optional.of(createTaskAndShape(relativeLocation));
    }

    @Override
    public String getLabel() { return "Link"; }

    protected Command createTaskAndShape(final Optional<GPoint> relativeLocation) {
        Robot robot = modelState.getSemanticModel(Robot.class).orElseThrow();
        Diagram diagram = modelState.getNotationModel();
        EditingDomain editingDomain = modelState.getEditingDomain();

        Link newLink = createTask();
        Command taskCommand = AddCommand.create(editingDomain, robot.getBody(),
            XacroPackage.Literals.BODY__LINK, newLink);

        Shape shape = createShape(newLink.getResolved(), relativeLocation);
        Command shapeCommand = AddCommand.create(editingDomain, diagram,
            NotationPackage.Literals.DIAGRAM__ELEMENTS, shape);

        CompoundCommand compoundCommand = new CompoundCommand();
        compoundCommand.append(taskCommand);
        compoundCommand.append(shapeCommand);
        return compoundCommand;
    }

    protected void setInitialName(final Link link) {
        Function<Integer, String> nameProvider = i -> "New" + link.eClass().getName() + i;
        int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
        link.setResolved(nameProvider.apply(nodeCounter));
    }

    protected Link createTask() {
        Link newLink = XacroFactory.eINSTANCE.createLink();
        setInitialName(newLink);
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