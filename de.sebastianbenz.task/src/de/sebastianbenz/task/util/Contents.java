/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package de.sebastianbenz.task.util;

import static de.sebastianbenz.task.util.Tasks.stripTags;
import de.sebastianbenz.task.taskPaper.Content;
import de.sebastianbenz.task.taskPaper.Project;
import de.sebastianbenz.task.taskPaper.Task;

public class Contents {

	public static int levelOf(Content content) {
		return content.getIntend().size();
	}
	
	public static String textOf(Content content){
		String text = content.getText().trim();
		if (content instanceof Project) {
			text = formatProject(text);
		}else if (content instanceof Task) {
			text = stripTags((Task) content);
			text  = formatTask(text);
		}
		return text;
	}

	protected static String formatTask(String text) {
		if(text.startsWith("- ")){
			text = text.substring(2, text.length());
		}else if(text.startsWith("-")){
			text = text.substring(1, text.length());
		}
		return text.trim();
	}

	protected static String formatProject(String text) {
		if(text.endsWith(":")){
			text = text.substring(0, text.length() - 1);
		}
		return text;
	}

}
