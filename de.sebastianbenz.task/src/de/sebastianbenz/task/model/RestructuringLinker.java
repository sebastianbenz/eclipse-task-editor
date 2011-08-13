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
package de.sebastianbenz.task.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.impl.Linker;

import de.sebastianbenz.task.Container;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Task;
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
		}else if(model instanceof Task){
			((Task) model).getTags();
		}
	}

	
}
