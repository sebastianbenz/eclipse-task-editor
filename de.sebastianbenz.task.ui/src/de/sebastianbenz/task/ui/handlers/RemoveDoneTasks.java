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
package de.sebastianbenz.task.ui.handlers;

import static com.google.common.collect.Iterators.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

import com.google.common.base.Predicate;

import de.sebastianbenz.task.Task;

public class RemoveDoneTasks extends AbstractEditorHandler {
	
	private static final Logger LOG = Logger.getLogger(RemoveDoneTasks.class);

	private List<Task> allDoneTasks(XtextResource state) {
		Iterator<Task> allTasks = filter(state.getAllContents(), Task.class);
		return newArrayList(filter(allTasks,
				new Predicate<Task>() {
					public boolean apply(Task task) {
						return task.isDone();
					}
				}));
	}

	private void deleteLine(final IXtextDocument document, Task task)
			throws BadLocationException {
		EcoreUtil.delete(task);
	}

	@Override
	protected void doExecute(XtextEditor xtextEditor, XtextResource resource) {
		List<Task> doneTasks = allDoneTasks(resource);
		for (Task task : doneTasks) {
			try {
				deleteLine(xtextEditor.getDocument(), task);
			} catch (BadLocationException e) {
				LOG.error(e.getMessage(), e);
			}
		}
	}
}
