package de.fraunhofer.ipa.kinematics.glsp.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.server.actions.AbstractActionHandler;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelIndex;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;

import com.google.inject.Inject;

import de.fraunhofer.ipa.kinematics.glsp.actions.RequestSemanticUriAction;
import de.fraunhofer.ipa.kinematics.glsp.actions.SetSemanticUriAction;

public class RequestSemanticUriActionHandler extends AbstractActionHandler<RequestSemanticUriAction> {

    @Inject
    protected EMFNotationModelState modelState;

    @Override
    protected List<Action> executeAction(RequestSemanticUriAction action) {
        List<Action> actionList = new ArrayList<>();

        Registry registry = modelState.getSemanticModel().eResource().getResourceSet().getPackageRegistry();
        String key = registry.keySet().iterator().next();
        EPackage ePackage = registry.getEPackage(key);
        String modelUri = ePackage.eResource().getURI().toString();

        EMFNotationModelIndex modelIndex = modelState.getIndex();
        Optional<GModelElement> element = modelIndex.findElementByClass(action.getGraphicElementId(),
            GModelElement.class);
        if (element.isPresent()) {
            Optional<EObject> semanticElement = modelIndex.getEObject(element.get());

            String fragment = semanticElement.get().eResource().getURIFragment(semanticElement.get());
            actionList.add(
                new SetSemanticUriAction(modelUri, fragment, semanticElement.get().eClass().getName()));
        }
        return actionList.isEmpty() ? none() : actionList;
    }

}
