package de.sebastianbenz.task.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.impl.Linker;

import de.sebastianbenz.task.taskPaper.Content;
import de.sebastianbenz.task.taskPaper.Project;
import de.sebastianbenz.task.taskPaper.Todo;

public class RestructuringLinker extends Linker {

	@Override
	protected void afterModelLinked(EObject model,
			IDiagnosticConsumer diagnosticsConsumer) {
		if (model instanceof Todo) {
			restructure((Todo)model);
		}
	}

	public void restructure(Todo model) {
		Project project = null;
		for (Content content : model.getContents()) {
			if (content instanceof Project) {
			}
		}
	}
	
}
