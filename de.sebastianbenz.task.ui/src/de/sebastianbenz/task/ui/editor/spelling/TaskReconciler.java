package de.sebastianbenz.task.ui.editor.spelling;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.texteditor.spelling.SpellingService;
import org.eclipse.xtext.ui.editor.reconciler.XtextReconciler;

import com.google.inject.Inject;

public class TaskReconciler extends XtextReconciler {

	private boolean installed;
	private final SpellingService spellingService;

	@Inject
	public TaskReconciler(TaskReconcileStrategy strat, SpellingService spellingService){
		super(strat);
		this.spellingService = spellingService;
	}

	@Override
	public void install(ITextViewer textViewer) {
		if(!this.installed){
			super.install(textViewer);
			if (textViewer instanceof ISourceViewer) {
				ISourceViewer viewer = (ISourceViewer) textViewer;
				((TaskReconcileStrategy) this.getReconcilingStrategy(""))
						.addSpellSupport(viewer, spellingService);
			}
			installed = true;
		}
	}

}