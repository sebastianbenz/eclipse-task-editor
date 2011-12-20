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
package de.sebastianbenz.task.ui.highlighting;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class HighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	private static final int DEFAULT_FONT_SIZE = JFaceResources.getDefaultFontDescriptor().getFontData()[0].getHeight();
	
	public static final String NOTE_ID = "node";
	public static final String NOTE_DONE_ID = "node_done";
	public static final String NOTE_URL_ID = "url";
	public static final String PROJECT1_ID = "project1";
	public static final String PROJECT2_ID = "project2";
	public static final String PROJECT3_ID = "project3";
	public static final String PROJECT1_DONE_ID = "project1Done";
	public static final String PROJECT2_DONE_ID = "project2Done";
	public static final String PROJECT3_DONE_ID = "project3Done";
	public static final String TASK_DONE_ID = "taskDone";
	public static final String TASK_OPEN_ID = "taskOpen";
	public static final String TAG_ID = "tag";
	public static final String CODE_ID = "code";
	public static final String CODE_ANNOTATION_ID = "code annotation";

	public static final String TASK_URL_ID = "taskUrl";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(TAG_ID, "Tags", tagTextStyle());

		acceptor.acceptDefaultHighlighting(TASK_OPEN_ID, "Task", taskOpenTextStyle());
		acceptor.acceptDefaultHighlighting(TASK_DONE_ID, "Task (Done)", taskDoneTextStyle());
		acceptor.acceptDefaultHighlighting(TASK_URL_ID, "Task URL", taskUrlTextStyle());
		
		acceptor.acceptDefaultHighlighting(NOTE_ID, "Note", nodeTextStyle());
		acceptor.acceptDefaultHighlighting(NOTE_DONE_ID, "Note (Done)", nodeDoneTextStyle());
		acceptor.acceptDefaultHighlighting(NOTE_URL_ID, "Note URL", noteUrlTextStyle());
		
		acceptor.acceptDefaultHighlighting(PROJECT1_ID, "Project", project1TextStyle());
		acceptor.acceptDefaultHighlighting(PROJECT2_ID, "Sub project", project2TextStyle());
		acceptor.acceptDefaultHighlighting(PROJECT3_ID, "Sub sub project", project3TextStyle());
		
		acceptor.acceptDefaultHighlighting(PROJECT1_DONE_ID, "Project (Done)", project1DoneTextStyle());
		acceptor.acceptDefaultHighlighting(PROJECT2_DONE_ID, "Sub project (Done)", project2DoneTextStyle());
		acceptor.acceptDefaultHighlighting(PROJECT3_DONE_ID, "Sub sub project (Done)", project3DoneTextStyle());
		
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(CODE_ID, "Code", codeTextStyle());
		acceptor.acceptDefaultHighlighting(CODE_ANNOTATION_ID, "Code Annotation", codeAnnotationTextStyle());
	}

	

	public TextStyle project3DoneTextStyle() {
		TextStyle textStyle = project3TextStyle().copy();
		strikethrough(textStyle);
		return textStyle;
	}



	public TextStyle project2DoneTextStyle() {
		TextStyle textStyle = project2TextStyle().copy();
		strikethrough(textStyle);
		return textStyle;
	}



	public TextStyle project1DoneTextStyle() {
		TextStyle textStyle = project1TextStyle().copy();
		strikethrough(textStyle);
		return textStyle;
	}



	public TextStyle taskUrlTextStyle() {
		TextStyle textStyle = taskOpenTextStyle().copy();
		textStyle.setStyle(TextAttribute.UNDERLINE);
		return textStyle;
	}

	public TextStyle taskOpenTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		return textStyle;
	}

	public TextStyle taskDoneTextStyle() {
		return strikethrough(defaultTextStyle().copy());
	}

	private TextStyle strikethrough(TextStyle textStyle) {
		textStyle.setStyle(TextAttribute.STRIKETHROUGH);
		return textStyle;
	}

	public TextStyle project3TextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 1));
		return textStyle;
	}

	public TextStyle project2TextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 2));
		return textStyle;
	}

	public TextStyle project1TextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 3));
		return textStyle;
	}

	protected FontData fontWithHeight(int height) {
		return new FontData(JFaceResources.HEADER_FONT, height, SWT.BOLD);
	}

	public TextStyle noteUrlTextStyle() {
		TextStyle textStyle = nodeTextStyle().copy();
		textStyle.setStyle(TextAttribute.UNDERLINE);
		return textStyle;
	}

	public TextStyle nodeTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(grey());
		return textStyle;
	}
	
	public TextStyle nodeDoneTextStyle() {
		return strikethrough(nodeTextStyle());
	}

	protected RGB grey() {
		return new RGB(125, 125, 125);
	}
	
	private TextStyle tagTextStyle() {
		TextStyle textStyle = nodeTextStyle().copy();
		textStyle.setStyle(TextAttribute.UNDERLINE);
		textStyle.setColor(grey());
		return textStyle;
	}
	
	public TextStyle codeTextStyle() {
		TextStyle result = super.defaultTextStyle().copy();
		result.setColor(ColorScheme.CODE);
		return result;
	}
	
	public TextStyle codeAnnotationTextStyle() {
		TextStyle textStyle = super.defaultTextStyle().copy();
		textStyle.setColor(ColorScheme.ANNOTATION);
		return textStyle;
	}
	
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = super.defaultTextStyle().copy();
		textStyle.setColor(ColorScheme.KEYWORD);
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	@Override
	public TextStyle defaultTextStyle() {
		TextStyle result = super.defaultTextStyle().copy();
		FontData fontData = new FontData();
		fontData.setName(JFaceResources.TEXT_FONT);
		fontData.setHeight(DEFAULT_FONT_SIZE);
		result.setFontData(fontData);  
		return result;
	}
	
	public TextStyle numberTextStyle() {
		TextStyle textStyle = super.defaultTextStyle().copy();
		textStyle.setColor(ColorScheme.NUMBER);
		return textStyle;
	}

	public TextStyle stringTextStyle() {
		TextStyle textStyle = super.defaultTextStyle().copy();
		textStyle.setColor(ColorScheme.STRING);
		return textStyle;
	}

	public TextStyle commentTextStyle() {
		TextStyle textStyle = super.defaultTextStyle().copy();
		textStyle.setColor(ColorScheme.COMMENT);
		return textStyle;
	}
}
