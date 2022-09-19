package de.fraunhofer.ipa.kinematics.glsp.actions;

import org.eclipse.glsp.server.actions.ResponseAction;

public class SetUISchemaAction extends ResponseAction {

    private String uiSchema;

    public SetUISchemaAction() {
        super(ActionKind.REQUEST_UI_SCHEMA);
    }

    public SetUISchemaAction(final String uiSchema) {
        this();
        this.uiSchema = uiSchema;
    }

    public String getUISchema() { return uiSchema; }

    public void setUISchema(String uiSchema) { this.uiSchema = uiSchema; }
}
