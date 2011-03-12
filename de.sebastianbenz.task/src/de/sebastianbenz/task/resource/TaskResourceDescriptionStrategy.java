package de.sebastianbenz.task.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.util.TaskSwitch;

public class TaskResourceDescriptionStrategy extends
		DefaultResourceDescriptionStrategy {

	
	public class Implementation extends TaskSwitch<Boolean> {

		private final IAcceptor<IEObjectDescription> acceptor;

		public Implementation(IAcceptor<IEObjectDescription> acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Boolean caseProject(Project object) {
			return createContentDescription(object);
		}

		@Override
		public Boolean caseTask(Task object) {
			for (Tag tag : object.getTags()) {
				createContentDescription(tag);
			}
			return createContentDescription(object);
		}
		
		
		protected Boolean createContentDescription(EObject object) {
			QualifiedName name = getQualifiedNameProvider().apply(object);
			if(name != null){
				acceptor.accept(EObjectDescription.create(name , object));
			}
			return Boolean.TRUE;
		}

		@Override
		public Boolean defaultCase(EObject object) {
			return Boolean.TRUE;
		}
	}

	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		if(eObject == null){
			return false;
		}
		return new Implementation(acceptor).doSwitch(eObject);
	}
}
