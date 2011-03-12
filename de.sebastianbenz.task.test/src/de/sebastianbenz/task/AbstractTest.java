/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package de.sebastianbenz.task;

import static com.google.common.collect.Iterables.filter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.BeforeClass;
import org.junit.internal.matchers.TypeSafeMatcher;
import org.junit.runner.RunWith;

import com.google.common.base.Joiner;
import com.google.inject.Inject;
import com.google.inject.name.Named;

@SuppressWarnings("restriction")
@RunWith(XtextRunner.class)
@InjectWith(TaskInjectorProvider.class)
public abstract class AbstractTest {

	static{
		TaskPackage.eINSTANCE.getClass();
	}
	
	@Inject
	private XtextResourceSet resourceSet;
	private String fileExtension;

	@Inject
	protected void setExtensions(@Named(Constants.FILE_EXTENSIONS) String extensions) {
		this.fileExtension = extensions.split(",")[0];
	}

	protected String tagsOf(Task task) {
		return Joiner.on(", ").join(task.getTags());
	}

	protected Task firstTask(EList<Content> contents) {
		return filter(contents, Task.class).iterator().next();
	}

	protected Matcher<EList<Content>> are(final Class<?>... types) {
		return new TypeSafeMatcher<EList<Content>>() {
	
			public void describeTo(Description description) {
				description.appendValueList("", ", ", "", types);
			}
	
			@Override
			public boolean matchesSafely(EList<Content> item) {
				int i = 0;
				for (Class<?> expectedType : types) {
					if(!expectedType.isInstance(item.get(i))){
						return false;
					}
					i++;
				}
				assertEquals(types.length, item.size());
				return true;
			}
		};
	}

	protected EList<Content> parse(String input) throws IOException {
		return root(input).getContents();
	}
	
	protected TaskModel root(String input) throws IOException{
		Resource resource = resource(input);
		return (TaskModel)resource.getContents().get(0);
	}

	protected Resource resource(String input) throws IOException {
		Resource resource = resourceSet.createResource(URI.createURI(String.format("TaskTest.%s",fileExtension)));
		resource.load(new StringInputStream(input), null);
		assertNoErrors(resource);
		return resource;
	}

	protected void assertNoErrors(Resource resource) {
		EList<Diagnostic> errors = resource.getErrors();
		assertTrue(Joiner.on("\n ").join(errors), errors.isEmpty());
	}

}