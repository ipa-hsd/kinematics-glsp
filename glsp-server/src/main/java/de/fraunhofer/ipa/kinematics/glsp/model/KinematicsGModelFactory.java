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
package de.fraunhofer.ipa.kinematics.glsp.model;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.impl.GEdgeBuilder;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.notation.EMFNotationGModelFactory;

import de.fraunhofer.ipa.kinematics.glsp.KinematicsModelTypes;
import kinematics.Joint;
import kinematics.Link;
import kinematics.Robot;

public class KinematicsGModelFactory extends EMFNotationGModelFactory {

   @Override
   protected void fillRootElement(final EObject semanticModel, final Diagram notationModel, final GModelRoot newRoot) {
      Robot robot = Robot.class.cast(semanticModel);
      GGraph graph = GGraph.class.cast(newRoot);

      if (notationModel.getSemanticElement() != null
         && notationModel.getSemanticElement().getResolvedSemanticElement() != null) {
         robot.getLinks().stream()
            .map(this::createLinkNode)
            .forEachOrdered(graph.getChildren()::add);

         robot.getJoints().stream()
            .map(joint -> createTransitionEdge(joint, graph))
            .forEachOrdered(graph.getChildren()::add);
      }
   }

   protected GNode createLinkNode(final Link link) {
      GNodeBuilder linkNodeBuilder = new GNodeBuilder(KinematicsModelTypes.LINK)
         .id(idGenerator.getOrCreateId(link))
         .addCssClass("minimal-node")
         .add(new GLabelBuilder(DefaultTypes.LABEL).text(link.getName()).addCssClass("minimal-label").build())
         .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5));

      applyShapeData(link, linkNodeBuilder);
      return linkNodeBuilder.build();
   }

   protected GModelElement findGNodeById(final EList<GModelElement> eList, final String elementId) {
      return eList.stream().filter(node -> elementId.equals(node.getId())).findFirst().orElse(null);
   }

   protected GEdge createTransitionEdge(final Joint joint, final GGraph graph) {
      String parentId = joint.getParent().getId();
      String childId = joint.getChild().getId();

      GModelElement parentNode = findGNodeById(graph.getChildren(), parentId);
      GModelElement childNode = findGNodeById(graph.getChildren(), childId);

      GEdgeBuilder jointEdgeBuilder = new GEdgeBuilder(KinematicsModelTypes.JOINT).source(parentNode)
         .target(childNode)
         .id(idGenerator.getOrCreateId(joint));
      applyEdgeData(joint, jointEdgeBuilder);
      return jointEdgeBuilder.build();
   }
}
