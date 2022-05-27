package org.eclipse.glsp.example.model;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.example.tasklist.model.Task;
import org.eclipse.glsp.example.tasklist.model.TaskList;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.notation.EMFNotationGModelFactory;

public class MyGLSPGModelFactory extends EMFNotationGModelFactory {

	@Override
	protected void fillRootElement(EObject semanticModel, Diagram notationModel, GModelRoot newRoot) {
		// TODO Auto-generated method stub
		TaskList taskList = TaskList.class.cast(semanticModel);
		GGraph graph = GGraph.class.cast(newRoot);

		if (notationModel.getSemanticElement() != null
				&& notationModel.getSemanticElement().getResolvedSemanticElement() != null) {
			for (Iterator<Task> iterator = taskList.getTasks().iterator(); iterator.hasNext();) {
				Task task = (Task) iterator.next();
				GNodeBuilder builder = new GNodeBuilder(DefaultTypes.NODE).size(60, 20)
						.id(idGenerator.getOrCreateId(task)).addCssClass("minimal-node")
						.add(new GLabelBuilder(DefaultTypes.LABEL).text(task.getName()).build());

				applyShapeData(task, builder);
				graph.getChildren().add(builder.build());
			}
		}
	}
}
