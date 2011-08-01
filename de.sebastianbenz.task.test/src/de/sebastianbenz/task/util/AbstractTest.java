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
package de.sebastianbenz.task.util;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterators.filter;
import static com.google.common.collect.Lists.newArrayList;
import static java.lang.String.format;
import static org.eclipse.emf.common.util.URI.createURI;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import junit.framework.Assert;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.internal.matchers.TypeSafeMatcher;
import org.junit.runner.RunWith;

import com.google.common.base.Joiner;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.TaskInjectorProvider;
import de.sebastianbenz.task.TaskModel;
import de.sebastianbenz.task.TaskPackage;
import de.sebastianbenz.task.query.QueryPackage;

@SuppressWarnings("restriction")
@RunWith(XtextRunner.class)
@InjectWith(TaskInjectorProvider.class)
public abstract class AbstractTest {

	static{
		TaskPackage.eINSTANCE.getClass();
		QueryPackage.eINSTANCE.getClass();
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

	protected EList<Content> parse(String input) {
		return taskModel(input).getContents();
	}
	
	protected TaskModel taskModel(String input) {
		Resource resource = resource(input, fileExtension);
		return (TaskModel)resource.getContents().get(0);
	}

	protected Resource taskResource(String input){
		return resource(input, fileExtension);
	}
	
	
	protected Resource resource(String input, String extension)  {
		Resource resource = resourceSet.createResource(createURI(format("TaskTest" + resourceSet.getResources().size() + "." + extension)));
		try {
			resource.load(new StringInputStream(input), null);
			EcoreUtil.resolveAll(resource);
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		assertNoErrors(resource);
		return resource;
	}

	protected void assertNoErrors(Resource resource) {
		EList<Diagnostic> errors = resource.getErrors();
		assertTrue(Joiner.on("\n ").join(errors), errors.isEmpty());
	}
	
	public XtextResourceSet getResourceSet() {
		return resourceSet;
	}
	
	protected <T> Iterable<T>  allInstancesOf(Class<T> type) {
		return newArrayList(filter(resourceSet.getAllContents(), type));
	}

}
