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
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.graph.util.GraphUtil;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.model.notation.Edge;
import org.eclipse.glsp.server.emf.notation.EMFNotationGModelFactory;

import de.fraunhofer.ipa.kinematics.glsp.KinematicsBuilder.FixedJointEdgeBuilder;
import de.fraunhofer.ipa.kinematics.glsp.KinematicsBuilder.PrismaticJointEdgeBuilder;
import de.fraunhofer.ipa.kinematics.glsp.KinematicsBuilder.RevoluteJointEdgeBuilder;
import de.fraunhofer.ipa.kinematics.glsp.KinematicsModelTypes;
import kinematics.Joint;
import kinematics.Link;
import kinematics.Robot;
import kinematicsgraph.Axis;
import kinematicsgraph.KinematicsgraphFactory;
import kinematicsgraph.Limit;
import kinematicsgraph.Pose;

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

   protected Limit getJointLimit(final Joint joint) {
      Limit limit = KinematicsgraphFactory.eINSTANCE.createLimit();
      limit.setEffort(joint.getLimit().getEffort());
      limit.setVelocity(joint.getLimit().getVelocity());
      limit.setLower(joint.getLimit().getLower());
      limit.setUpper(joint.getLimit().getUpper());

      return limit;
   }

   protected Axis getJointAxis(final Joint joint) {
      Axis axis = KinematicsgraphFactory.eINSTANCE.createAxis();
      axis.setX(joint.getAxis().getX());
      axis.setY(joint.getAxis().getY());
      axis.setZ(joint.getAxis().getZ());

      return axis;
   }

   protected Pose getJointOrigin(final Joint joint) {
      Pose origin = KinematicsgraphFactory.eINSTANCE.createPose();
      origin.setX(joint.getOrigin().getX());
      origin.setY(joint.getOrigin().getY());
      origin.setZ(joint.getOrigin().getZ());
      origin.setRoll(joint.getOrigin().getRoll());
      origin.setPitch(joint.getOrigin().getPitch());
      origin.setYaw(joint.getOrigin().getYaw());

      return origin;
   }

   protected GEdge createTransitionEdge(final Joint joint, final GGraph graph) {
      String parentId = joint.getParent().getId();
      String childId = joint.getChild().getId();

      GModelElement parentNode = findGNodeById(graph.getChildren(), parentId);
      GModelElement childNode = findGNodeById(graph.getChildren(), childId);

      Pose origin = getJointOrigin(joint);

      switch (joint.getType()) {
         case FIXED:
            FixedJointEdgeBuilder fixedJointEdgeBuilder = new FixedJointEdgeBuilder().source(parentNode)
               .target(childNode)
               .setOrigin(origin)
               .id(idGenerator.getOrCreateId(joint));
            applyEdgeData(joint, fixedJointEdgeBuilder);
            return fixedJointEdgeBuilder.build();
         case REVOLUTE:
            Limit limitRevolute = getJointLimit(joint);
            Axis axisRevolute = getJointAxis(joint);
            RevoluteJointEdgeBuilder revoluteJointEdgeBuilder = new RevoluteJointEdgeBuilder().source(parentNode)
               .target(childNode)
               .setOrigin(origin)
               .setLimit(limitRevolute)
               .setAxis(axisRevolute)
               .id(idGenerator.getOrCreateId(joint))
               .addCssClass("minimal-edge-revolute");
            applyEdgeData(joint, revoluteJointEdgeBuilder);
            return revoluteJointEdgeBuilder.build();
         case PRISMATIC:
            Limit limitPrismatic = getJointLimit(joint);
            Axis axisPrismatic = getJointAxis(joint);
            PrismaticJointEdgeBuilder prismaticJointEdgeBuilder = new PrismaticJointEdgeBuilder().source(parentNode)
               .target(childNode)
               .setOrigin(origin)
               .setLimit(limitPrismatic)
               .setAxis(axisPrismatic)
               .id(idGenerator.getOrCreateId(joint))
               .addCssClass("minimal-edge-prismatic");
            applyEdgeData(joint, prismaticJointEdgeBuilder);
            System.out.println(prismaticJointEdgeBuilder.build());
            return prismaticJointEdgeBuilder.build();
         default:
            break;
      }

      return null;
   }

   private FixedJointEdgeBuilder applyEdgeData(final EObject edgeElement, final FixedJointEdgeBuilder builder) {
      // TODO Auto-generated method stub
      modelState.getIndex().getNotation(edgeElement, Edge.class)
         .ifPresent(edge -> applyEdgeData(edge, builder));
      return builder;
   }

   private static FixedJointEdgeBuilder applyEdgeData(final Edge edge, final FixedJointEdgeBuilder builder) {
      if (edge.getBendPoints() != null) {
         edge.getBendPoints().stream().map(GraphUtil::copy).forEachOrdered(builder::addRoutingPoint);
      }
      return builder;
   }

   private RevoluteJointEdgeBuilder applyEdgeData(final EObject edgeElement, final RevoluteJointEdgeBuilder builder) {
      // TODO Auto-generated method stub
      modelState.getIndex().getNotation(edgeElement, Edge.class)
         .ifPresent(edge -> applyEdgeData(edge, builder));
      return builder;
   }

   private static RevoluteJointEdgeBuilder applyEdgeData(final Edge edge, final RevoluteJointEdgeBuilder builder) {
      if (edge.getBendPoints() != null) {
         edge.getBendPoints().stream().map(GraphUtil::copy).forEachOrdered(builder::addRoutingPoint);
      }
      return builder;
   }

   private PrismaticJointEdgeBuilder applyEdgeData(final EObject edgeElement, final PrismaticJointEdgeBuilder builder) {
      // TODO Auto-generated method stub
      modelState.getIndex().getNotation(edgeElement, Edge.class)
         .ifPresent(edge -> applyEdgeData(edge, builder));
      return builder;
   }

   private static PrismaticJointEdgeBuilder applyEdgeData(final Edge edge, final PrismaticJointEdgeBuilder builder) {
      if (edge.getBendPoints() != null) {
         edge.getBendPoints().stream().map(GraphUtil::copy).forEachOrdered(builder::addRoutingPoint);
      }
      return builder;
   }
}
