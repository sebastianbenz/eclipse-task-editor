/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
package de.sebastianbenz.task;

import static com.google.common.collect.Iterables.transform;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.inject.Inject;

import de.sebastianbenz.task.resource.Descriptions;
import de.sebastianbenz.task.util.AbstractTest;

public class TaskResourceDescriptionTest extends AbstractTest{

	@Inject
	IResourceDescription.Manager fixture;
	
	
	@Test
	public void shouldExportProjectsAndTasks() throws IOException {
		String input = "project:\n" +
						"- task \n" +
						"- task2 \n" +
						"note\n";
		assertThat(resourceDescription(input), is("project, task, task2, note"));
	}
	
	@Test
	public void shouldExportTags() throws Exception {
		String input = 	"- task2 @done\n";
		assertThat(resourceDescription(input), is("done, task2"));
	}
	
	@Test
	public void shouldStoreTagsInTaskUserData() throws Exception {
		String input = 	"- task2 @done\n";
		assertThat(userDataOf(input, "task2"), is("done"));
	}

	private String userDataOf(String input, String name) {
		IResourceDescription resourceDescription = createResourceDescription(input);
		QualifiedName qualifiedName = QualifiedName.create(name);
		Iterable<IEObjectDescription> exportedObjects = resourceDescription.getExportedObjects(TaskPackage.Literals.TASK, qualifiedName , false);
		return exportedObjects.iterator().next().getUserData(Descriptions.TAG_KEY);
	}

	protected String resourceDescription(String input) throws IOException {
		IResourceDescription resourceDescription = createResourceDescription(input);
		return Joiner.on(", ").join(transform(resourceDescription.getExportedObjects(), new Function<IEObjectDescription, String>() {

			public String apply(IEObjectDescription description) {
				return description.getName().toString();
			}
		}));
	}

	protected IResourceDescription createResourceDescription(String input) {
		Resource resource = taskResource(input);
		IResourceDescription resourceDescription = fixture.getResourceDescription(resource);
		return resourceDescription;
	}

}
