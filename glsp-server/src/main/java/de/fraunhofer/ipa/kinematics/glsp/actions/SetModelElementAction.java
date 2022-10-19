package de.fraunhofer.ipa.kinematics.glsp.actions;

import org.eclipse.glsp.server.actions.ResponseAction;

public class SetModelElementAction extends ResponseAction {

    private String modelElement;

    public SetModelElementAction() {
        super(ActionKind.SET_MODEL_ELEMENT);
    }

    public SetModelElementAction(final String modelElement) {
        this();
        this.modelElement = modelElement;
    }

    public String getJsonObject() { return modelElement; }

    public void setJsonObject(String modelElement) { this.modelElement = modelElement; }

}
