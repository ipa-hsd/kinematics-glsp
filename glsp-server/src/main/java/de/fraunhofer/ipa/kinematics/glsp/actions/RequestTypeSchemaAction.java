package de.fraunhofer.ipa.kinematics.glsp.actions;

import org.eclipse.glsp.server.actions.RequestAction;

public class RequestTypeSchemaAction extends RequestAction<SetTypeSchemaAction> {

    private String modelUri;

    public RequestTypeSchemaAction() {
        super(ActionKind.REQUEST_SCHEMA);
    }

    public RequestTypeSchemaAction(final String modelUri) {
        this();
        this.modelUri = modelUri;
    }

    public String getModelUri() { return modelUri; }

    public void setModelUri(String modelUri) { this.modelUri = modelUri; }
}
