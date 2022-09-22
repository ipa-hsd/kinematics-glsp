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
package de.fraunhofer.ipa.kinematics.glsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.glsp.server.diagram.BaseDiagramConfiguration;
import org.eclipse.glsp.server.types.EdgeTypeHint;
import org.eclipse.glsp.server.types.ShapeTypeHint;

public class KinematicsDiagramConfiguration extends BaseDiagramConfiguration {

   @Override
   public List<ShapeTypeHint> getShapeTypeHints() {
      // tasks can be moved, deleted and resized
      return List.of(new ShapeTypeHint(KinematicsModelTypes.LINK, true, true, true, false));
   }

   @Override
   public List<EdgeTypeHint> getEdgeTypeHints() {
      List<EdgeTypeHint> edgeHints = new ArrayList<>();
      edgeHints.add(createDefaultEdgeTypeHint(KinematicsModelTypes.FIXED_JOINT));
      edgeHints.add(createDefaultEdgeTypeHint(KinematicsModelTypes.REVOLUTE_JOINT));
      edgeHints.add(createDefaultEdgeTypeHint(KinematicsModelTypes.PRISMATIC_JOINT));

      return edgeHints;
   }

   @Override
   public EdgeTypeHint createDefaultEdgeTypeHint(final String elementId) {
      EdgeTypeHint hint = super.createDefaultEdgeTypeHint(elementId);
      hint.setSourceElementTypeIds(
         Arrays.asList(KinematicsModelTypes.LINK));
      hint.setTargetElementTypeIds(
         Arrays.asList(KinematicsModelTypes.LINK));
      return hint;
   }

}
