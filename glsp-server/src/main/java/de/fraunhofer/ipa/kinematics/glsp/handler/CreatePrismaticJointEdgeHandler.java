package de.fraunhofer.ipa.kinematics.glsp.handler;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.server.emf.AbstractEMFCreateEdgeOperationHandler;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.model.notation.Edge;
import org.eclipse.glsp.server.emf.model.notation.NotationElement;
import org.eclipse.glsp.server.emf.model.notation.NotationFactory;
import org.eclipse.glsp.server.emf.model.notation.NotationPackage;
import org.eclipse.glsp.server.emf.model.notation.SemanticElementReference;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.CreateEdgeOperation;

import com.google.inject.Inject;

import de.fraunhofer.ipa.kinematics.glsp.KinematicsModelTypes;
import kinematics.Axis;
import kinematics.Joint;
import kinematics.JointType;
import kinematics.KinematicsFactory;
import kinematics.KinematicsPackage;
import kinematics.Limit;
import kinematics.Link;
import kinematics.Pose;
import kinematics.Robot;

public class CreatePrismaticJointEdgeHandler extends AbstractEMFCreateEdgeOperationHandler {

   @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreatePrismaticJointEdgeHandler() {
      super(KinematicsModelTypes.PRISMATIC_JOINT);
   }

   @Override
   public Optional<Command> createCommand(final CreateEdgeOperation operation) {
      // TODO Auto-generated method stub

      Robot robot = modelState.getSemanticModel(Robot.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      String parentId = operation.getSourceElementId();
      String childId = operation.getTargetElementId();

      Link parentLink = findLinkById(robot.getLinks(), parentId);
      Link childLink = findLinkById(robot.getLinks(), childId);

      Joint newJoint = createJoint(parentLink, childLink);
      Command jointCommand = AddCommand.create(editingDomain, robot,
         KinematicsPackage.Literals.ROBOT__JOINTS, newJoint);

      Edge newEdge = createEdge(idGenerator.getOrCreateId(newJoint));
      Command edgeCommand = AddCommand.create(editingDomain, diagram, NotationPackage.Literals.DIAGRAM__ELEMENTS,
         newEdge);

      CompoundCommand compoundCommand = new CompoundCommand();
      compoundCommand.append(jointCommand);
      compoundCommand.append(edgeCommand);
      return Optional.of(compoundCommand);
   }

   @Override
   public String getLabel() { return "Prismatic Joint"; }

   protected Link findLinkById(final EList<Link> links, final String elementId) {
      return links.stream().filter(link -> elementId.equals(link.getId())).findFirst().orElse(null);
   }

   protected NotationElement findGNodeById(final EList<NotationElement> eList, final String elementId) {
      return eList.stream().filter(node -> elementId.equals(node.getSemanticElement().getElementId())).findFirst()
         .orElse(null);
   }

   protected void setInitialName(final Joint joint) {
      Function<Integer, String> nameProvider = i -> "New" + joint.eClass().getName() + i;
      int edgeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GEDGE, nameProvider);
      joint.setName(nameProvider.apply(edgeCounter));
   }

   protected Joint createJoint(final Link sourceLink, final Link targetLink) {
      Joint newJoint = KinematicsFactory.eINSTANCE.createJoint();
      newJoint.setId(UUID.randomUUID().toString());
      setInitialName(newJoint);
      newJoint.setParent(sourceLink);
      newJoint.setChild(targetLink);

      Pose origin = KinematicsFactory.eINSTANCE.createPose();
      origin.setX(0);
      origin.setY(0);
      origin.setZ(0);
      origin.setRoll(0);
      origin.setPitch(0);
      origin.setYaw(0);
      newJoint.setOrigin(origin);

      newJoint.setType(JointType.PRISMATIC);

      Limit limit = KinematicsFactory.eINSTANCE.createLimit();
      newJoint.setLimit(limit);

      Axis axis = KinematicsFactory.eINSTANCE.createAxis();
      newJoint.setAxis(axis);

      return newJoint;
   }

   protected Edge createEdge(final String elementId) {
      Edge newEdge = NotationFactory.eINSTANCE.createEdge();
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newEdge.setSemanticElement(reference);
      return newEdge;
   }
}
