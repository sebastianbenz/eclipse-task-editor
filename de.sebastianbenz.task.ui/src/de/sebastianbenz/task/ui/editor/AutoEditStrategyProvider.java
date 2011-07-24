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
package de.sebastianbenz.task.ui.editor;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategy;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;
import org.eclipse.xtext.ui.editor.autoedit.ShortCutEditStrategy;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class AutoEditStrategyProvider extends DefaultAutoEditStrategyProvider {

	protected static class LineBreakInserter extends AbstractEditStrategy {

		private final IAutoEditStrategy defaultStrategy;

		protected LineBreakInserter(IAutoEditStrategy defaultStrategy) {
			this.defaultStrategy = defaultStrategy;
		}

		@Override
		protected void internalCustomizeDocumentCommand(IDocument document,
				DocumentCommand command) throws BadLocationException {
			if (!isLineBreak(document, command)) {
				return;
			}
			String line = currentLine(document, command);
			if (isEmpty(line)) {
				return;
			}
			defaultStrategy.customizeDocumentCommand(document, command);

			if(!atEndOfLineInput(document, command.offset)){
				return;
			}else if(isEmptyTask(line)){
				removeSingleHyphen(document, command, line);
			}else if (isNewProject(line)) {
				command.text = command.text + '\t';
			} else if (isTask(line)) {
				command.text = command.text + "- ";
			}
		}

		private void removeSingleHyphen(IDocument document,
				DocumentCommand command, String line)
				throws BadLocationException {
			int lineNr = document.getLineOfOffset(command.offset);
			int lineOffset = document.getLineOffset(lineNr);
			int index = line.indexOf("-");
			int hyphenPosition = index + lineOffset;
			int toDelete = line.length() - index;
			document.replace(hyphenPosition, toDelete, "");
			command.offset = command.offset - toDelete;
		}

		protected boolean atEndOfLineInput(IDocument document, int offset) throws BadLocationException {
			IRegion line = document.getLineInformation(document.getLineOfOffset(offset));
			return document.get(offset, line.getOffset() + line.getLength() - offset).trim().length() == 0;
		}
		
		private boolean isEmptyTask(String line) {
			return "-".equals(line.trim());
		}

		private boolean isEmpty(String line) {
			return line.length() == 0;
		}

		private boolean isTask(String line) {
			return line.trim().startsWith("- ");
		}

		private boolean isNewProject(String line) {
			return line.endsWith(":");
		}

		private String currentLine(IDocument document, DocumentCommand command)
				throws BadLocationException {
			IRegion region = activeRegion(document, command);
			String line = document.get(region.getOffset(), region.getLength());
			return line;
		}

		private IRegion activeRegion(IDocument document, DocumentCommand command)
				throws BadLocationException {
			return document
					.getLineInformationOfOffset(command.offset);
		}

		private boolean isLineBreak(IDocument document, DocumentCommand command) {
			return command.text.equals(((IDocumentExtension4) document)
					.getDefaultLineDelimiter()) && command.length == 0;
		}
	}


	@Inject
	protected Provider<ShortCutEditStrategy> shortCut;

	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		super.configure(acceptor);
	}

	@Override
	protected void configureCurlyBracesBlock(IEditStrategyAcceptor acceptor) {
	}

	@Override
	protected void configureMultilineComments(IEditStrategyAcceptor acceptor) {
	}

	@Override
	protected void configureIndentationEditStrategy(
			IEditStrategyAcceptor acceptor) {
		acceptor.accept(
				new LineBreakInserter(defaultIndentLineAutoEditStrategy.get()),
				IDocument.DEFAULT_CONTENT_TYPE);
	}

}
