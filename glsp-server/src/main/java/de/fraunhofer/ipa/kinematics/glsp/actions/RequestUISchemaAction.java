package de.fraunhofer.ipa.kinematics.glsp.actions;

import org.eclipse.glsp.server.actions.RequestAction;

public class RequestUISchemaAction extends RequestAction<SetUISchemaAction> {

    private String modelUri;

    public RequestUISchemaAction() {
        super(ActionKind.SET_UI_SCHEMA);
    }

    public RequestUISchemaAction(final String modelUri) {
        this();
        this.modelUri = modelUri;
    }

    public String getModelUri() { return modelUri; }

    public void setModelUri(String modelUri) { this.modelUri = modelUri; }
}
