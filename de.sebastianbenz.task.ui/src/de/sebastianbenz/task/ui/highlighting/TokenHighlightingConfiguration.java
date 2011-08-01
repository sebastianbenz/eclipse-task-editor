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
		if ("RULE_CODE_".equals(tokenName)) {
			return HighlightingConfiguration.CODE_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
