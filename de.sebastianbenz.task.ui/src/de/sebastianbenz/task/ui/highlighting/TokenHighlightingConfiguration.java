package de.sebastianbenz.task.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

import com.google.inject.Singleton;
@Singleton
public class TokenHighlightingConfiguration extends
		DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_TASK_OPEN".equals(tokenName)) {
			return HighlightingConfiguration.TASK_OPEN_ID;
		}
		if ("RULE_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.NOTE_ID;
		}
		if ("RULE_PROJECT_".equals(tokenName)) {
			return HighlightingConfiguration.PROJECT1_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
