package de.fraunhofer.ipa.kinematics.glsp.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emfcloud.jackson.module.EMFModule;
import org.eclipse.glsp.server.actions.AbstractActionHandler;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelIndex;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;

import de.fraunhofer.ipa.kinematics.glsp.actions.RequestModelElementAction;
import de.fraunhofer.ipa.kinematics.glsp.actions.SetModelElementAction;

public class RequestModelElementActionHandler extends AbstractActionHandler<RequestModelElementAction> {

    @Inject
    protected EMFNotationModelState modelState;

    @Override
    protected List<Action> executeAction(RequestModelElementAction action) {
        List<Action> actionList = new ArrayList<>();

        // TODO: move this to a utils class
        ObjectMapper mapper = new ObjectMapper();
        EMFModule module = new EMFModule();
        mapper.registerModule(module);

        EMFNotationModelIndex modelIndex = modelState.getIndex();
        Optional<EObject> semanticElement = modelIndex.getEObject(action.getSemanticUri());
        JsonNode json = mapper.valueToTree(semanticElement.get());

        // Registry registry = modelState.getSemanticModel().eResource().getResourceSet().getPackageRegistry();
        // String key = registry.keySet().iterator().next();
        // EPackage ePackage = registry.getEPackage(key);
        // EObject schema = ePackage.eResource().getContents().get(0);
        // System.out.println(ePackage.eResource().getURI().devicePath());
        // System.out.println(mapper.valueToTree(schema).toPrettyString());
        System.out.println(json);
        // String jsonStr = "{'links': [{'name':'NewLink0','id':'95e0cf3b-5e34-4f5d-9a4d-b6a21c6b9af0'}]}";

        actionList.add(
            new SetModelElementAction(json.toString()));
        return actionList.isEmpty() ? none() : actionList;
    }
}
