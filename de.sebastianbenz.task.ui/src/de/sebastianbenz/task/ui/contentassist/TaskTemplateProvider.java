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
package de.sebastianbenz.task.ui.contentassist;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateProposal;

import com.google.inject.Inject;
import com.google.inject.Singleton;


@Singleton
public class TaskTemplateProvider extends DefaultTemplateProposalProvider {


	private IScopeProvider scopeProvider2;


	@Inject
	public TaskTemplateProvider(TemplateStore templateStore,
			ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
	}
	
	@Override
	public void setScopeProvider(IScopeProvider scopeProvider) {
		scopeProvider2 = scopeProvider;
		super.setScopeProvider(scopeProvider);
	}
	
	protected boolean validate(Template template, ContentAssistContext context) {
		return context.getMatcher().isCandidateMatchingPrefix(template.getName(), context.getPrefix().trim());
	}
	
	protected TemplateProposal doCreateProposal(Template template, TemplateContext templateContext,
			ContentAssistContext context, Image image, int relevance) {
		org.eclipse.jface.text.Region replaceRegion = context.getReplaceRegion();
		IRegion region = new Region(replaceRegion.getOffset() + replaceRegion.getLength(), 0);
		return new XtextTemplateProposal(template, templateContext, region , image, relevance);
	}

	
	protected TemplateContext doCreateTemplateContext(TemplateContextType contextType, ContentAssistContext context) {
		int length = context.getReplaceRegion().getLength();
		int offset = context.getReplaceRegion().getOffset() + length;
		return new XtextTemplateContext(contextType, context.getDocument(),
				new Position(offset, 0),
				context, scopeProvider2);
	}
	
}
