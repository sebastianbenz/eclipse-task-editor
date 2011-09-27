package de.sebastianbenz.task.ui.quickfix;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;
import org.eclipse.ui.texteditor.spelling.SpellingCorrectionProcessor;
import org.eclipse.xtext.ui.editor.quickfix.XtextQuickAssistProcessor;

import com.google.inject.Inject;

public class TaskQuickAssistProcessor extends XtextQuickAssistProcessor{

	@Inject
	private SpellingCorrectionProcessor spellingCorrectionProcessor;

	@Override
	public ICompletionProposal[] computeQuickAssistProposals(
			IQuickAssistInvocationContext invocationContext) {
		ICompletionProposal[] spellingProposals = spellingCorrectionProcessor.computeQuickAssistProposals(invocationContext);
		ICompletionProposal[] xtextProposals = super.computeQuickAssistProposals(invocationContext);
		ICompletionProposal[] ret = new ICompletionProposal[spellingProposals.length + xtextProposals.length];
		System.arraycopy(spellingProposals, 0, ret, 0, spellingProposals.length);
		System.arraycopy(xtextProposals, 0, ret, spellingProposals.length, xtextProposals.length);
		return ret;
	}
}