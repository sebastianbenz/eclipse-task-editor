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
/*
 * generated by Xtext
 */
package de.sebastianbenz.task.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

import com.google.inject.Binder;

import de.sebastianbenz.task.ui.contentassist.TaskTemplateProvider;
import de.sebastianbenz.task.ui.editor.AutoEditStrategyProvider;
import de.sebastianbenz.task.ui.editor.FoldingRegionProvider;
import de.sebastianbenz.task.ui.editor.SourceViewerConfiguration;
import de.sebastianbenz.task.ui.editor.TaskEditor;
import de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration;
import de.sebastianbenz.task.ui.highlighting.SemanticHighlightingCalculator;
import de.sebastianbenz.task.ui.highlighting.TokenHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
public class TaskUiModule extends de.sebastianbenz.task.ui.AbstractTaskUiModule {
	public TaskUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(XtextEditor.class).to(TaskEditor.class);
		binder.bind(IFoldingRegionProvider.class).to(FoldingRegionProvider.class);
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return SemanticHighlightingCalculator.class;
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return HighlightingConfiguration.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return TokenHighlightingConfiguration.class;
	}

	@Override
	public Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
		return AutoEditStrategyProvider.class;
	}
	
	public Class<? extends XtextSourceViewerConfiguration> bindXtextSourceViewerConfiguration(){
		return SourceViewerConfiguration.class;
	}
	
	@Override
	public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
		return TaskTemplateProvider.class;
	}
	
	
}
