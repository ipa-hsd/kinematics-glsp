package org.eclipse.glsp.example.javaemf.handler;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import com.google.inject.Inject;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.example.javaemf.TaskListModelTypes;
import org.eclipse.glsp.example.tasklist.model.ModelFactory;
import org.eclipse.glsp.example.tasklist.model.ModelPackage;
import org.eclipse.glsp.example.tasklist.model.Task;
import org.eclipse.glsp.example.tasklist.model.TaskList;
import org.eclipse.glsp.example.tasklist.model.Transition;
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

		TaskList taskList = modelState.getSemanticModel(TaskList.class).orElseThrow();
		Diagram diagram = modelState.getNotationModel();
		EditingDomain editingDomain = modelState.getEditingDomain();

		String sourceId = operation.getSourceElementId();
		String targetId = operation.getTargetElementId();

		Task sourceTask = findTaskById(taskList.getTasks(), sourceId);
		Task targetTask = findTaskById(taskList.getTasks(), targetId);

		Transition newTransition = createTransition(sourceTask, targetTask);
		Command transitionCommand = AddCommand.create(editingDomain, taskList,
			ModelPackage.Literals.TASK_LIST__TRANSITIONS, newTransition);

		Edge newEdge = createEdge(idGenerator.getOrCreateId(newTransition));
		Command edgeCommand = AddCommand.create(editingDomain, diagram, NotationPackage.Literals.DIAGRAM__ELEMENTS,
			newEdge);

		CompoundCommand compoundCommand = new CompoundCommand();
		compoundCommand.append(transitionCommand);
		compoundCommand.append(edgeCommand);
		return Optional.of(compoundCommand);
	}

	@Override
	public String getLabel() { return "Transition"; }

	protected Task findTaskById(EList<Task> tasks, String elementId) {
		return tasks.stream().filter(task -> elementId.equals(task.getId())).findFirst().orElse(null);
	}

	protected NotationElement findGNodeById(EList<NotationElement> eList, String elementId) {
		return eList.stream().filter(node -> elementId.equals(node.getSemanticElement().getElementId())).findFirst()
			.orElse(null);
	}

	protected void setInitialName(final Transition transition) {
		Function<Integer, String> nameProvider = i -> "New" + transition.eClass().getName() + i;
		int edgeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GEDGE, nameProvider);
		transition.setName(nameProvider.apply(edgeCounter));
	}

	protected Transition createTransition(Task sourceTask, Task targetTask) {
		Transition newTransition = ModelFactory.eINSTANCE.createTransition();
		newTransition.setId(UUID.randomUUID().toString());
		setInitialName(newTransition);
		newTransition.setSource(sourceTask);
		newTransition.setTarget(targetTask);
		return newTransition;
	}

	protected Edge createEdge(final String elementId) {
		Edge newEdge = NotationFactory.eINSTANCE.createEdge();
		SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
		reference.setElementId(elementId);
		newEdge.setSemanticElement(reference);
		return newEdge;
	}
}
