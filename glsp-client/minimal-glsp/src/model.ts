/********************************************************************************
 * Copyright (c) 2020-2021 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/

import { SEdge } from '@eclipse-glsp/client';

export class Axis {
    x?: number;
    y?: number;
    z?: number;
}

export class Limit {
    lower?: number;
    upper?: number;
    effort?: number;
    velocity?: number;
}

export class Pose {
    x?: number;
    y?: number;
    z?: number;
    roll?: number;
    pitch?: number;
    yaw?: number;
}

export class FixedJointEdge extends SEdge {
    origin?: Pose;
}

export class RevoluteJointEdge extends SEdge {
    origin?: Pose;
    limit?: Limit;
    axis?: Axis;
}

export class PrismaticJointEdge extends SEdge {
    origin?: Pose;
    limit?: Limit;
    axis?: Axis;
}
