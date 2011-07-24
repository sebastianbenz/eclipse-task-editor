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
package de.sebastianbenz.task.ui.views;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;

import com.google.inject.Inject;

import de.sebastianbenz.task.ui.labeling.TaskLabelProvider;

public class TodoViewLabelProvider extends DelegatingStyledCellLabelProvider
		implements ILabelProvider {

	private final TaskLabelProvider labelProvider;

	@Inject
	public TodoViewLabelProvider(TaskLabelProvider labelProvider) {
		super(labelProvider);
		this.labelProvider = labelProvider;
	}

	public String getText(Object element) {
		return labelProvider.getStyledText(element).getString();
	}

}
