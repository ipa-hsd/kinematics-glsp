package org.eclipse.glsp.example.javaemf.handler;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.example.javaemf.TaskListModelTypes;
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

import kinematics.Joint;
import kinematics.KinematicsFactory;
import kinematics.KinematicsPackage;
import kinematics.Link;
import kinematics.Robot;

public class CreateTransitionEdgeHandler extends AbstractEMFCreateEdgeOperationHandler {

    @Inject
    protected EMFNotationModelState modelState;

    @Inject
    protected EMFIdGenerator idGenerator;

    public CreateTransitionEdgeHandler() {
        super(TaskListModelTypes.TRANSITION);
    }

    @Override
    public Optional<Command> createCommand(CreateEdgeOperation operation) {
        // TODO Auto-generated method stub

        Robot robot = modelState.getSemanticModel(Robot.class).orElseThrow();
        Diagram diagram = modelState.getNotationModel();
        EditingDomain editingDomain = modelState.getEditingDomain();

        String sourceId = operation.getSourceElementId();
        String targetId = operation.getTargetElementId();

        Link sourceLink = findLinkById(robot.getLinks(), sourceId);
        Link targetLink = findLinkById(robot.getLinks(), targetId);

        Joint newJoint = createTransition(sourceLink, targetLink);
        Command transitionCommand = AddCommand.create(editingDomain, robot,
            KinematicsPackage.Literals.ROBOT__JOINTS, newJoint);

        Edge newEdge = createEdge(idGenerator.getOrCreateId(newJoint));
        Command edgeCommand = AddCommand.create(editingDomain, diagram, NotationPackage.Literals.DIAGRAM__ELEMENTS,
            newEdge);

        CompoundCommand compoundCommand = new CompoundCommand();
        compoundCommand.append(transitionCommand);
        compoundCommand.append(edgeCommand);
        return Optional.of(compoundCommand);
    }

    @Override
    public String getLabel() { return "Transition"; }

    protected Link findLinkById(EList<Link> links, String elementId) {
        return links.stream().filter(link -> elementId.equals(link.getId())).findFirst().orElse(null);
    }

    protected NotationElement findGNodeById(EList<NotationElement> eList, String elementId) {
        return eList.stream().filter(node -> elementId.equals(node.getSemanticElement().getElementId())).findFirst()
            .orElse(null);
    }

    protected void setInitialName(final Joint joint) {
        Function<Integer, String> nameProvider = i -> "New" + joint.eClass().getName() + i;
        int edgeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GEDGE, nameProvider);
        joint.setName(nameProvider.apply(edgeCounter));
    }

    protected Joint createTransition(Link sourceLink, Link targetLink) {
        Joint newJoint = KinematicsFactory.eINSTANCE.createJoint();
        newJoint.setId(UUID.randomUUID().toString());
        setInitialName(newJoint);
        newJoint.setParent(sourceLink);
        newJoint.setChild(targetLink);
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
