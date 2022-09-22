/********************************************************************************
 * Copyright (c) 2020 EclipseSource and others.
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
package de.fraunhofer.ipa.kinematics.glsp;

import org.eclipse.glsp.graph.builder.AbstractGEdgeBuilder;

import kinematicsgraph.JointEdge;
import kinematicsgraph.KinematicsgraphFactory;
import kinematicsgraph.Pose;

public final class KinematicsBuilder {

   public static class FixedJointEdgeBuilder extends AbstractGEdgeBuilder<JointEdge, FixedJointEdgeBuilder> {

      private Pose origin;

      public FixedJointEdgeBuilder() {
         super(KinematicsModelTypes.FIXED_JOINT);
         // TODO Auto-generated constructor stub
      }

      public FixedJointEdgeBuilder setOrigin(final Pose origin) {
         this.origin = origin;
         return self();
      }

      @Override
      protected void setProperties(final JointEdge edge) {
         // TODO Auto-generated method stub
         super.setProperties(edge);
         edge.setOrigin(origin);
      }

      @Override
      protected JointEdge instantiate() {
         // TODO Auto-generated method stub
         return KinematicsgraphFactory.eINSTANCE.createJointEdge();
      }

      @Override
      protected FixedJointEdgeBuilder self() {
         // TODO Auto-generated method stub
         return this;
      }

   }

   public static class RevoluteJointEdgeBuilder extends AbstractGEdgeBuilder<JointEdge, RevoluteJointEdgeBuilder> {

      private Pose origin;

      public RevoluteJointEdgeBuilder() {
         super(KinematicsModelTypes.REVOLUTE_JOINT);
         // TODO Auto-generated constructor stub
      }

      public RevoluteJointEdgeBuilder setOrigin(final Pose origin) {
         this.origin = origin;
         return self();
      }

      @Override
      protected void setProperties(final JointEdge edge) {
         // TODO Auto-generated method stub
         super.setProperties(edge);
         edge.setOrigin(origin);
      }

      @Override
      protected JointEdge instantiate() {
         // TODO Auto-generated method stub
         return KinematicsgraphFactory.eINSTANCE.createJointEdge();
      }

      @Override
      protected RevoluteJointEdgeBuilder self() {
         // TODO Auto-generated method stub
         return this;
      }

   }

}
