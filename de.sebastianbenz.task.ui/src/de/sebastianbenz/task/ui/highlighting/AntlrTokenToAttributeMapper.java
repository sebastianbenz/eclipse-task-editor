package de.sebastianbenz.task.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import com.google.inject.Singleton;
@Singleton
public class AntlrTokenToAttributeMapper extends
		DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_TASK_CLOSED".equals(tokenName)) {
			return Configuration.TASK_DONE_ID;
		}
		if ("RULE_TASK_OPEN".equals(tokenName)) {
			return Configuration.TASK_OPEN_ID;
		}
		if ("RULE_NOTE_CONTENT".equals(tokenName)) {
			return Configuration.NOTE_ID;
		}
		if ("RULE_PROJECT_1".equals(tokenName)) {
			return Configuration.PROJECT1_ID;
		}
		if ("RULE_PROJECT_2".equals(tokenName)) {
			return Configuration.PROJECT2_ID;
		}
		if ("RULE_PROJECT_3".equals(tokenName)) {
			return Configuration.PROJECT3_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
