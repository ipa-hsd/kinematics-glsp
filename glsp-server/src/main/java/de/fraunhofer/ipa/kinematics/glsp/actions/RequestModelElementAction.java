package de.fraunhofer.ipa.kinematics.glsp.actions;

import org.eclipse.glsp.server.actions.RequestAction;

public class RequestModelElementAction extends RequestAction<SetModelElementAction> {

    private String semanticUri;

    public RequestModelElementAction() {
        super(ActionKind.REQUEST_MODEL_ELEMENT);
    }

    public RequestModelElementAction(final String semanticUri) {
        this();
        this.semanticUri = semanticUri;
    }

    public String getSemanticUri() { return semanticUri; }

    public void setSemanticUri(final String semanticUri) { this.semanticUri = semanticUri; }

}
