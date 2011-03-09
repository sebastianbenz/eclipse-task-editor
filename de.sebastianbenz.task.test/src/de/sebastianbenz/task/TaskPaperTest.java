/*
* generated by Xtext
*/
package de.sebastianbenz.task;

import static junit.framework.Assert.assertNotNull;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.google.inject.name.Named;

@RunWith(XtextRunner.class)
@InjectWith(TaskPaperInjectorProvider.class)
public class TaskPaperTest {
	
	@Inject
	private XtextResourceSet resourceSet;
	
	private String fileExtension;
	
	@Inject
	protected void setExtensions(@Named(Constants.FILE_EXTENSIONS) String extensions) {
		this.fileExtension = extensions.split(",")[0];
	}

	@Test
	public void loadModel() throws Exception {
		Resource resource = resourceSet.createResource(URI.createURI(String.format("TaskPaperTest.%s",fileExtension)));
		resource.load(new StringInputStream("Hello Xtext!"), null);
		assertNotNull(resource.getEObject("/"));
	}
}