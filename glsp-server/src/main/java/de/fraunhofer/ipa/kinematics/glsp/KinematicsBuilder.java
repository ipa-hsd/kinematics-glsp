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

   public static class JointEdgeBuilder extends AbstractGEdgeBuilder<JointEdge, JointEdgeBuilder> {

      private Pose origin;

      public JointEdgeBuilder() {
         super(KinematicsModelTypes.REVOLUTE_JOINT);
         // TODO Auto-generated constructor stub
      }

      public JointEdgeBuilder setOrigin(final Pose origin) {
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
      protected JointEdgeBuilder self() {
         // TODO Auto-generated method stub
         return this;
      }

   }

}
