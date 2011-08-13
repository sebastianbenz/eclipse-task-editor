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
package de.sebastianbenz.task.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.internal.xpand2.ast.TextStatement;

import de.sebastianbenz.task.TaskFactory;
import de.sebastianbenz.task.Text;
import de.sebastianbenz.task.TextSegment;


public class TaskImplCustom extends de.sebastianbenz.task.impl.TaskImpl {


	@Override
	protected String cleanText(String string) {
		if (string.startsWith("- ")) {
			string = string.substring(2, string.length());
		} else if (string.startsWith("-")) {
			string = string.substring(1, string.length());
		}
		return string;
	}
	
	
	protected void addTextSegment(EList<TextSegment> segments, int begin,
			int end) {
		super.addTextSegment(segments, begin, end);
		if(begin == 0){
			Text firstSegment = (Text) segments.get(0);
			firstSegment.setValue(firstSegment.getValue().substring(1));
		}
	}


}
