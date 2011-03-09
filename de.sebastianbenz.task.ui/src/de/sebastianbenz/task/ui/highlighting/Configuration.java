package de.sebastianbenz.task.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.editor.utils.TextStyleConstants;

public class Configuration extends DefaultHighlightingConfiguration {
	
	public static final String NOTE_ID = "node";
	public static final String URL_ID = "url";
	public static final String PROJECT1_ID = "project1";
	public static final String PROJECT2_ID = "project2";
	public static final String PROJECT3_ID = "project3";
	static final String TASK_DONE_ID = "taskDone";
	static final String TASK_OPEN_ID = "taskOpen";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());
		
		acceptor.acceptDefaultHighlighting(NOTE_ID, "Note", nodeTextStyle());
		acceptor.acceptDefaultHighlighting(URL_ID, "Url", urlTextStyle());
		acceptor.acceptDefaultHighlighting(PROJECT1_ID, "Project1", project1TextStyle());
		acceptor.acceptDefaultHighlighting(PROJECT2_ID, "Project2", project2TextStyle());
		acceptor.acceptDefaultHighlighting(PROJECT3_ID, "Project3", project3TextStyle());
		
		acceptor.acceptDefaultHighlighting(TASK_DONE_ID, "Task closed", taskDoneTextStyle());
		acceptor.acceptDefaultHighlighting(TASK_OPEN_ID, "Task open", taskOpenTextStyle());
	}

	private TextStyle taskOpenTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 0, 0));
		return textStyle;
	}

	private TextStyle taskDoneTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(174, 226, 57));
		return textStyle;
	}

	private TextStyle project3TextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(11));
		return textStyle;
	}

	private TextStyle project2TextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(13));
		return textStyle;
	}

	private TextStyle project1TextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(15));
		return textStyle;
	}

	protected FontData fontWithHeight(int height) {
		return new FontData(TextStyleConstants.DEFAULT_FONT_NAME, height, SWT.BOLD);
	}

	private TextStyle urlTextStyle() {
		TextStyle textStyle = nodeTextStyle().copy();
		textStyle.setStyle(SWT.UNDERLINE_LINK);
		return textStyle;
	}

	private TextStyle nodeTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(125, 125, 125));
		return textStyle;
	}
	
	@Override
	public TextStyle defaultTextStyle() {
		TextStyle result = super.defaultTextStyle().copy();
		result.setFontData(new FontData("org.eclipse.jface.dialogfont", 11, SWT.NORMAL));
		return result;
	}
}
