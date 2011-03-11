package de.sebastianbenz.task.ui.editor;

import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;

public class TaskPaperSourceViewerConfiguration extends
		XtextSourceViewerConfiguration {

	
	@Override
	public int getTabWidth(ISourceViewer sourceViewer) {
		return 2;
	}
}
