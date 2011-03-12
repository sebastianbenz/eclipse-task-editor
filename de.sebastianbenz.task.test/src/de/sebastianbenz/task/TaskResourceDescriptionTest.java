package de.sebastianbenz.task;

import static com.google.common.collect.Iterables.transform;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.inject.Inject;

public class TaskResourceDescriptionTest extends AbstractTest{

	@Inject
	IResourceDescription.Manager fixture;
	
	@Test
	public void shouldExportProjectsAndTasks() throws IOException {
		String input = "project:\n" +
						"- task \n" +
						"- task2 \n" +
						"note\n";
		assertThat(resourceDescription(input), is("project, task, task2"));
	}
	
	@Test
	public void shouldExportTags() throws Exception {
		String input = 	"- task2 @done\n";
		assertThat(resourceDescription(input), is("done, task2"));
	}

	protected String resourceDescription(String input) throws IOException {
		Resource resource = resource(input);
		IResourceDescription resourceDescription = fixture.getResourceDescription(resource);
		return Joiner.on(", ").join(transform(resourceDescription.getExportedObjects(), new Function<IEObjectDescription, String>() {

			public String apply(IEObjectDescription description) {
				return description.getName().toString();
			}
		}));
	}

}
