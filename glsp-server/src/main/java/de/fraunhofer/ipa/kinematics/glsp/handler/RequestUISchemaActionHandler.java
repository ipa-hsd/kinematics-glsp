package de.fraunhofer.ipa.kinematics.glsp.handler;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emfcloud.jackson.module.EMFModule;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;
import org.eclipse.glsp.server.actions.AbstractActionHandler;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;

import de.fraunhofer.ipa.kinematics.glsp.actions.RequestUISchemaAction;
import de.fraunhofer.ipa.kinematics.glsp.actions.SetUISchemaAction;

public class RequestUISchemaActionHandler extends AbstractActionHandler<RequestUISchemaAction> {

   @Inject
   protected EMFNotationModelState modelState;

   @Override
   protected List<Action> executeAction(final RequestUISchemaAction action) {
      System.out.println("requesting ui schema");

      List<Action> actionList = new ArrayList<>();

      // TODO: move this to a utils class
      ObjectMapper mapper = new ObjectMapper();
      EMFModule module = new EMFModule();
      mapper.registerModule(module);

      ResourceSet rset = modelState.getSemanticModel().eResource().getResourceSet();
      rset.getResourceFactoryRegistry()
         .getExtensionToFactoryMap()
         .put("json", new JsonResourceFactory());

      // TODO: use relative path
      URI uri = URI.createFileURI(
         "/home/ipa-hsd/projects/kogrob2/urdf/glsp_tests/my_glsp_test/kinematics-glsp/glsp-server/model/JointView.json");

      JsonNode jsonNode;
      try {
         jsonNode = mapper.readValue(Paths.get(uri.toFileString()).toFile(), JsonNode.class);
         actionList.add(
            new SetUISchemaAction(jsonNode.toString()));
         System.out.println(jsonNode);

      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      return actionList.isEmpty() ? none() : actionList;
   }

}
