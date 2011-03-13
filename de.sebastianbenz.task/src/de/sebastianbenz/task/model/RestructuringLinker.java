package de.sebastianbenz.task.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.impl.Linker;

import de.sebastianbenz.task.Container;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.TaskModel;

public class RestructuringLinker extends Linker {

	@Override
	protected void afterModelLinked(EObject model,
			IDiagnosticConsumer diagnosticsConsumer) {
		if (model instanceof TaskModel) {
			((Container)model).getChildren(); // initialize the references
		}else if (model instanceof Content) {
			Content content = (Content) model;
			content.getParent(); // initialize the parent
		}
	}

	
}
