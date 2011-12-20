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

import static de.sebastianbenz.task.ui.editor.TaskTokenTypeToPartitionTypeMapper.CODE_PARTITION;
import static org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE;
import static org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper.STRING_LITERAL_PARTITION;

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
	private String[] defaultContentTypes = {DEFAULT_CONTENT_TYPE, CODE_PARTITION};


	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		super.configure(acceptor);
		configureAngleBracket(acceptor);
		
		acceptor.accept(partitionInsert.newInstance("'''", "'''"),DEFAULT_CONTENT_TYPE);
	}

	private void configureAngleBracket(IEditStrategyAcceptor acceptor) {
		for(String contentType : defaultContentTypes ){
			acceptor.accept(singleLineTerminals.newInstance("<", ">"),contentType);
		}
	}
	
	@Override
	protected void configureIndentationEditStrategy(
			IEditStrategyAcceptor acceptor) {
		for(String contentType : defaultContentTypes ){
			acceptor.accept(
					new LineBreakInserter(defaultIndentLineAutoEditStrategy.get()),
					contentType);
		}
	}
	
	protected void configureCompoundBracesBlocks(IEditStrategyAcceptor acceptor) {
		for(String contentType : defaultContentTypes ){
			acceptor.accept(compoundMultiLineTerminals.newInstanceFor("{", "}").and("[", "]").and("(", ")"), contentType);
		}
	}

	protected void configureMultilineComments(IEditStrategyAcceptor acceptor) {
		for(String contentType : defaultContentTypes ){
			acceptor.accept(singleLineTerminals.newInstance("/*", " */"), contentType);
			acceptor.accept(multiLineTerminals.newInstance("/*"," * ", " */"), contentType);
		}
	}

	protected void configureCurlyBracesBlock(IEditStrategyAcceptor acceptor) {
		for(String contentType : defaultContentTypes ){
			acceptor.accept(singleLineTerminals.newInstance("{", "}"),contentType);
		}
	}

	protected void configureSquareBrackets(IEditStrategyAcceptor acceptor) {
		for(String contentType : defaultContentTypes ){
			acceptor.accept(singleLineTerminals.newInstance("[", "]"),contentType);
		}
	}

	protected void configureParenthesis(IEditStrategyAcceptor acceptor) {
		for(String contentType : defaultContentTypes ){
			acceptor.accept(singleLineTerminals.newInstance("(", ")"),contentType);
		}
	}
	
	protected void configureStringLiteral(IEditStrategyAcceptor acceptor) {
		for(String contentType : defaultContentTypes ){
			// The following two are registered for the default content type, because on deletion 
			// the command.offset is cursor-1, which is outside the partition of terminals.length = 1.
			// How crude is that?
			// Note that in case you have two string literals following each other directly, the deletion strategy wouldn't apply.
			// One could add the same strategy for the STRING partition in addition to solve this
			acceptor.accept(partitionDeletion.newInstance("\"","\""),contentType);
			acceptor.accept(partitionDeletion.newInstance("'","'"),contentType);
		}
		acceptor.accept(partitionInsert.newInstance("\"","\""),STRING_LITERAL_PARTITION);
		acceptor.accept(partitionInsert.newInstance("'","'"),STRING_LITERAL_PARTITION);
		acceptor.accept(partitionEndSkippingEditStrategy.get(),STRING_LITERAL_PARTITION);
	}

}
