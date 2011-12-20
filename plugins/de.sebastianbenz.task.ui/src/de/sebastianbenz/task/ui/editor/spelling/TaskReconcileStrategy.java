package de.sebastianbenz.task.ui.editor.spelling;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.texteditor.spelling.SpellingReconcileStrategy;
import org.eclipse.ui.texteditor.spelling.SpellingService;
import org.eclipse.xtext.ui.editor.reconciler.XtextDocumentReconcileStrategy;

public class TaskReconcileStrategy extends XtextDocumentReconcileStrategy implements IReconcilingStrategyExtension {


	private TaskSpellingReconcileStrategy spellingStrategy;
	private IDocument document;

	@Override
	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
		super.reconcile(dirtyRegion, subRegion);
		if(spellingStrategy != null){
			spellingStrategy.reconcile(dirtyRegion, subRegion);
		}
	}

	@Override
	public void reconcile(IRegion subRegion) {
		super.reconcile(subRegion);
		if(spellingStrategy != null) {
			initialReconcile();
		}
	}

	@Override
	public void setDocument(IDocument document) {
		this.document = document;
		super.setDocument(document);
		if(spellingStrategy != null) {
			spellingStrategy.setDocument(document);
			initialReconcile();
		}
	}

	public void setProgressMonitor(IProgressMonitor monitor) {
		spellingStrategy.setProgressMonitor(monitor);
	}

	public void initialReconcile() {
		if(spellingStrategy != null) {
			spellingStrategy.initialReconcile();
		}
	}

	public void addSpellSupport(ISourceViewer viewer,
			SpellingService spellingService) {
		if(this.spellingStrategy == null) {
			this.spellingStrategy = new TaskSpellingReconcileStrategy(viewer, spellingService);
			this.spellingStrategy.setDocument(document);
		}
	}
}