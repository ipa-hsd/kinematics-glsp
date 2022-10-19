/********************************************************************************
 * Copyright (c) 2019-2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
import { RequestModelElementAction, RequestSemanticUriAction } from '@eclipse-emfcloud/ecore-property-view/lib/browser/action-definitions';
import { ActionHandlerRegistry } from '@eclipse-glsp/client/lib';
import { GLSPTheiaDiagramServer } from '@eclipse-glsp/theia-integration/lib/browser';
import { injectable } from 'inversify';
import { RequestSchemaAction, RequestUISchemaAction } from './action-definitions';

@injectable()
export class EcoreGLSPTheiaDiagramServer extends GLSPTheiaDiagramServer {
    initialize(registry: ActionHandlerRegistry): void {
        super.initialize(registry);

        registry.register(RequestSemanticUriAction.KIND, this);
        registry.register(RequestModelElementAction.KIND, this);
        registry.register(RequestSchemaAction.KIND, this);
        registry.register(RequestUISchemaAction.KIND, this);
    }
}
