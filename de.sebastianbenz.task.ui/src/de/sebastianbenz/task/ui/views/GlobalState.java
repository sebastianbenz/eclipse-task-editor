package de.sebastianbenz.task.ui.views;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

import com.google.inject.Inject;

import de.sebastianbenz.task.TaskPackage;

public class GlobalState {

	public class Root {

		private final IResourceDescriptions descriptions2;

		public Root(IResourceDescriptions descriptions) {
			descriptions2 = descriptions;
		}
		
	}
	
	@Inject
	private IResourceDescriptions descriptions;

	public Iterable<IEObjectDescription> getChildren() {
		return descriptions.getExportedObjectsByType(TaskPackage.eINSTANCE.getContent());
	}
	
	
}
