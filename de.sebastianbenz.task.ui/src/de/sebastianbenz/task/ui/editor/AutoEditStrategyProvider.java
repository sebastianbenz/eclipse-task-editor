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
package de.sebastianbenz.task.ui.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;
import org.eclipse.xtext.ui.editor.autoedit.ShortCutEditStrategy;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class AutoEditStrategyProvider extends DefaultAutoEditStrategyProvider{

	@Inject
	protected Provider<ShortCutEditStrategy> shortCut;
	
	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.accept(shortCut.get().configure("-", "- "),IDocument.DEFAULT_CONTENT_TYPE);
	}
	
}
