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

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;
import org.eclipse.xtext.ui.editor.model.DocumentPartitioner;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.sebastianbenz.task.query.Query;
import de.sebastianbenz.task.query.QueryStringParser;

public class TextProposalProvider implements IContentProposalProvider {

	private static String KEY_PRESS = "Ctrl+Space";

	@Inject
	private QueryStringParser queryParser;

	@Inject
	private XtextSourceViewer.Factory factory;

	@Inject
	private Provider<XtextSourceViewerConfiguration> configurationProvider;

	@Inject
	private Provider<XtextDocument> documentProvider;

	@Inject
	private Provider<DocumentPartitioner> partitionerProvider;
	
	@Inject
	private SimplePrefixMatcher prefixMatcher;

	public ICompletionProposal[] computeCompletionProposals(
			String currentModelToParse, int cursorPosition) {
		if (currentModelToParse == null) {
			currentModelToParse = "";
		}
		Query query = queryParser.parse(currentModelToParse);
		if (query == null) {
			return new ICompletionProposal[0];
		}
		final XtextResource xtextResource = (XtextResource) query.eResource();
		final IXtextDocument xtextDocument = getDocument(xtextResource,
				currentModelToParse);

		XtextSourceViewerConfiguration configuration = configurationProvider
				.get();
		ISourceViewer sourceViewer = getSourceViewer(xtextDocument,
				configuration);
		IContentAssistant contentAssistant = configuration
				.getContentAssistant(sourceViewer);
		String contentType;
		try {
			contentType = xtextDocument.getContentType(cursorPosition);
		} catch (BadLocationException e) {
			return new ICompletionProposal[0];
		}
		IContentAssistProcessor processor = contentAssistant
				.getContentAssistProcessor(contentType);
		if (processor != null) {
			return processor.computeCompletionProposals(sourceViewer,
					cursorPosition);
		}
		return new ICompletionProposal[0];
	}

	protected ISourceViewer getSourceViewer(final IXtextDocument xtextDocument,
			XtextSourceViewerConfiguration configuration) {
		ISourceViewer sourceViewer = factory.createSourceViewer(new Shell(),
				null, null, false, 0);
		sourceViewer.configure(configuration);
		sourceViewer.setDocument(xtextDocument);
		return sourceViewer;
	}

	public IXtextDocument getDocument(final XtextResource xtextResource,
			final String model) {
		XtextDocument document = documentProvider.get();
		document.set(model);
		document.setInput(xtextResource);
		FastPartitioner partitioner = partitionerProvider.get();
		partitioner.connect(document);
		document.setDocumentPartitioner(partitioner);
		return document;
	}


	public void configure(final Text text) {
		try {
			KeyStroke ks = KeyStroke.getInstance(KEY_PRESS);
			ContentProposalAdapter adapter = new ContentProposalAdapter(text,
					new TextContentAdapter(), this, ks, null);
			adapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_INSERT);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	public IContentProposal[] getProposals(String contents, int position) {
		ICompletionProposal[] proposals = computeCompletionProposals(contents,
				position);
		IContentProposal[] result = new IContentProposal[proposals.length];
		int i = 0;
		for (ICompletionProposal completionProposal : proposals) {
			String description = "";
			String label = completionProposal.getDisplayString();
			String content = prefixMatcher.apply(contents, position, label);
			result[i] = new ContentProposal(content, label, description);
			i++;
		}
		return result;
	}

	
}
