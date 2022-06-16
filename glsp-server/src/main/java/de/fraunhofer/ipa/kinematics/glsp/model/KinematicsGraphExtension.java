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
package de.fraunhofer.ipa.kinematics.glsp.model;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.glsp.graph.GraphExtension;

import kinematicsgraph.KinematicsgraphFactory;
import kinematicsgraph.KinematicsgraphPackage;

public class KinematicsGraphExtension implements GraphExtension {

   @Override
   public EPackage getEPackage() { // TODO Auto-generated method stub
      return KinematicsgraphPackage.eINSTANCE;
   }

   @Override
   public EFactory getEFactory() { // TODO Auto-generated method stub
      return KinematicsgraphFactory.eINSTANCE;
   }
}
