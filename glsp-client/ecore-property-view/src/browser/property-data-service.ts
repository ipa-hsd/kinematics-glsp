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
import { JsonFormsPropertyDataService } from '@eclipse-emfcloud/jsonforms-property-view';
import { DiagramWidget } from '@eclipse-glsp/theia-integration';
import { GlspSelection, isGlspSelection } from '@eclipse-glsp/theia-integration/lib/browser/diagram';
import { JsonSchema, UISchemaElement } from '@jsonforms/core';
import { ApplicationShell } from '@theia/core/lib/browser';
import URI from "@theia/core/lib/common/uri";
import { inject, injectable } from 'inversify';
import { isSetModelElementAction, isSetUISchemaAction, RequestModelElementAction, RequestUISchemaAction, SetModelElementAction } from './action-definitions';

@injectable()
export class EcoreGlspPropertyDataService implements JsonFormsPropertyDataService {

    readonly id = 'ecore-property-data-service';
    readonly label = 'EcoreGlspPropertyDataService';

    @inject(ApplicationShell)
    protected readonly shell: ApplicationShell;

    canHandleSelection(selection: any): number {
        return isGlspSelection(selection) ? 1 : 0;
    }

    protected getElementId(selection: GlspSelection): string {
        return selection.selectedElementsIDs[0] || '';
    }

    protected getSelectionData(selection: GlspSelection): any {
        if (selection.additionalSelectionData) {
            return selection.additionalSelectionData.selectionDataMap.get(this.getElementId(selection));
        }
    }

    async providePropertyData(selection: string | undefined): Promise<any | undefined> {
        if (selection && isGlspSelection(selection) && selection.selectedElementsIDs) {
            const selectionData = this.getSelectionData(selection);

            return new Promise(resolve => {
                const widget = this.shell.currentWidget as DiagramWidget;
                widget.actionDispatcher.request(new RequestModelElementAction(selectionData.semanticUri)).then(response => {
                    if (isSetModelElementAction(response)) {
                        const obj = JSON.parse((response as SetModelElementAction).modelElement);
                        resolve(obj);
                    }
                });
            });
        }
        return undefined;
    }

    getSchema(selection: any, properties?: any): Promise<JsonSchema | undefined> {
        // if (selection && isGlspSelection(selection) && selection.selectedElementsIDs) {
        //     const selectionData = this.getSelectionData(selection);

        //     return new Promise(resolve => {
        //         const widget = this.shell.currentWidget as DiagramWidget;
        //         widget.actionDispatcher.request(new RequestSchemaAction(selectionData.modelUri)).then(response => {
        //             if (isSetSchemaAction(response)) {
        //                 resolve((response.typeSchema as JsonSchema));
        //             }
        //         });
        //     });
        // }
        return Promise.resolve(undefined);
    }

    getUiSchema(selection: any, properties?: any): Promise<UISchemaElement | undefined> {
        if (properties) {
            const eClassName = this.getSelectionData(selection).eClass || new URI(properties.eClass).fragment.substring(2);
            return new Promise(resolve => {
                const widget = this.shell.currentWidget as DiagramWidget;
                widget.actionDispatcher.request(new RequestUISchemaAction(eClassName.toLowerCase())).then(response => {
                    if (isSetUISchemaAction(response)) {
                        const json = JSON.parse(response.uiSchema);
                        resolve(json as UISchemaElement);
                    }
                });
            });
        }
        return Promise.resolve(undefined);
    }
}
