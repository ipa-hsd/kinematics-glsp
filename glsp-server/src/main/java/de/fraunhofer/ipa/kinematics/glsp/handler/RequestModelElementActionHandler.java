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
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;

import de.fraunhofer.ipa.kinematics.glsp.actions.RequestModelElementAction;
import de.fraunhofer.ipa.kinematics.glsp.actions.SetModelElementAction;
import kinematics.Joint;

public class RequestModelElementActionHandler extends AbstractActionHandler<RequestModelElementAction> {

   @Inject
   protected EMFNotationModelState modelState;

   @Override
   protected List<Action> executeAction(final RequestModelElementAction action) {
      List<Action> actionList = new ArrayList<>();

      // TODO: move this to a utils class
      ObjectMapper mapper = new ObjectMapper();
      EMFModule module = new EMFModule();
      mapper.registerModule(module);

      EMFNotationModelIndex modelIndex = modelState.getIndex();
      Optional<EObject> semanticElement = modelIndex.getEObject(action.getSemanticUri());
      JsonNode json = mapper.valueToTree(semanticElement.get());

      if (semanticElement.get() instanceof Joint) {
         ((ObjectNode) json).remove("parent");
         ((ObjectNode) json).remove("child");

         if (((ObjectNode) json).has("limit")) {
            ((ObjectNode) json).remove("limit");
         }
      }

      actionList.add(
         new SetModelElementAction(json.toString()));
      return actionList.isEmpty() ? none() : actionList;
   }
}
