package de.sebastianbenz.task.ui;

import org.eclipse.jface.text.DefaultTextDoubleClickStrategy;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.doubleClicking.DoubleClickStrategyProvider;

import com.google.inject.Inject;

public class TaskDoubleClickStrategyProvider extends
		DoubleClickStrategyProvider {

	@Inject
	private DefaultTextDoubleClickStrategy defaultDoubleClickStrategy;
	
	public ITextDoubleClickStrategy getStrategy(ISourceViewer sourceViewer, String contentType, String documentPartitioning) {
		return defaultDoubleClickStrategy;
	}
}
