/********************************************************************************
 * Copyright (c) 2020 EclipseSource and others.
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
import { Action, generateRequestId, RequestAction, ResponseAction } from '@eclipse-glsp/client';

/**
 * Request Ecore Properties
 */

export class RequestSemanticUriAction implements RequestAction<SetSemanticUriAction> {
    static readonly KIND = 'requestSemanticUri';
    kind = RequestSemanticUriAction.KIND;
    constructor(
        public readonly graphicElementId: string,
        public readonly requestId: string = generateRequestId()) { }
}

export class SetSemanticUriAction implements ResponseAction {
    static readonly KIND = 'setSemanticUri';
    kind = SetSemanticUriAction.KIND;
    constructor(
        public readonly modelUri: string,
        public readonly semanticUri: string,
        public readonly elementEClass: string,
        public readonly responseId: string = '') { }
}

export function isSetSemanticUriAction(action: Action): action is SetSemanticUriAction {
    return action !== undefined && (action.kind === SetSemanticUriAction.KIND)
        && (action as SetSemanticUriAction).modelUri !== undefined
        && (action as SetSemanticUriAction).semanticUri !== undefined
        && (action as SetSemanticUriAction).elementEClass !== undefined;
}

export class RequestModelElementAction implements RequestAction<SetModelElementAction> {
    static readonly KIND = 'requestModelElement';
    kind = RequestModelElementAction.KIND;
    constructor(
        public readonly semanticUri: string,
        public readonly requestId: string = generateRequestId()) { }
}

export class SetModelElementAction implements ResponseAction {
    static readonly KIND = 'setModelElement';
    kind = SetModelElementAction.KIND;
    constructor(
        public readonly modelElement: string,
        public readonly responseId: string = '') { }
}

export function isSetModelElementAction(action: Action): action is SetModelElementAction {
    return action !== undefined && (action.kind === SetModelElementAction.KIND)
        && (action as SetModelElementAction).modelElement !== undefined;
}

export class RequestSchemaAction implements RequestAction<SetModelElementAction> {
    static readonly KIND = 'requestSchema';
    kind = RequestSchemaAction.KIND;
    constructor(
        public readonly modelUri: string,
        public readonly requestId: string = generateRequestId()) { }
}

export class SetSchemaAction implements ResponseAction {
    static readonly KIND = 'setSchema';
    kind = SetSchemaAction.KIND;
    constructor(
        public readonly typeSchema: string,
        public readonly responseId: string = '') { }
}

export function isSetSchemaAction(action: Action): action is SetSchemaAction {
    return action !== undefined && (action.kind === SetSchemaAction.KIND)
        && (action as SetSchemaAction).typeSchema !== undefined;
}

export class RequestUISchemaAction implements RequestAction<SetUISchemaAction> {
    static readonly KIND = 'requestUISchema';
    kind = RequestUISchemaAction.KIND;
    constructor(
        public readonly modelUri: string,
        public readonly requestId: string = generateRequestId()) { }
}

export class SetUISchemaAction implements ResponseAction {
    static readonly KIND = 'setUISchema';
    kind = SetUISchemaAction.KIND;
    constructor(
        public readonly uiSchema: string,
        public readonly responseId: string = '') { }
}

export function isSetUISchemaAction(action: Action): action is SetUISchemaAction {
    return action !== undefined && (action.kind === SetUISchemaAction.KIND)
        && (action as SetUISchemaAction).uiSchema !== undefined;
}
