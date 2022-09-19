package de.fraunhofer.ipa.kinematics.glsp.actions;

import org.eclipse.glsp.server.actions.RequestAction;

public class RequestSemanticUriAction extends RequestAction<SetSemanticUriAction> {

    private String graphicElementId;

    public RequestSemanticUriAction() {
        super(ActionKind.REQUEST_SEMANTIC_URI);
    }

    public RequestSemanticUriAction(final String graphicElementId) {
        this();
        this.graphicElementId = graphicElementId;
    }

    public String getGraphicElementId() { return graphicElementId; }

    public void setGraphicElementId(final String graphicElementId) { this.graphicElementId = graphicElementId; }

}
