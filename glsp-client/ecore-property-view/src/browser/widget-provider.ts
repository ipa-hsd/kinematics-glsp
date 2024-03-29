/********************************************************************************
 * Copyright (c) 2021 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
import { JsonFormsPropertyViewWidgetProvider } from '@eclipse-emfcloud/jsonforms-property-view';
import { isGlspSelection } from '@eclipse-glsp/theia-integration/lib/browser/diagram';
import { injectable } from 'inversify';

@injectable()
export class EcoreGlspPropertyViewWidgetProvider extends JsonFormsPropertyViewWidgetProvider {

    canHandle(selection: Record<string, unknown> | undefined): number {
        return isGlspSelection(selection) ? 100 : 0;
    }

}
