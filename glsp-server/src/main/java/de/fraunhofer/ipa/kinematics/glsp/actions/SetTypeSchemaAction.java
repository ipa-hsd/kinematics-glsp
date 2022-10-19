package de.fraunhofer.ipa.kinematics.glsp.actions;

import org.eclipse.glsp.server.actions.ResponseAction;

public class SetTypeSchemaAction extends ResponseAction {

    private String typeSchema;

    public SetTypeSchemaAction() {
        super(ActionKind.SET_SCHEMA);
    }

    public SetTypeSchemaAction(String typeSchema) {
        this();
        this.typeSchema = typeSchema;
    }

    public String getSchema() { return typeSchema; }

    public void setSchema(String typeSchema) { this.typeSchema = typeSchema; }
}
