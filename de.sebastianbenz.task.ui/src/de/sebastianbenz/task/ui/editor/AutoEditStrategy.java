package de.sebastianbenz.task.ui.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;
import org.eclipse.xtext.ui.editor.autoedit.ShortCutEditStrategy;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class AutoEditStrategy extends DefaultAutoEditStrategyProvider{

	@Inject
	protected Provider<ShortCutEditStrategy> shortCut;
	
	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.accept(shortCut.get().configure("-", "- "),IDocument.DEFAULT_CONTENT_TYPE);
	}
	
}
