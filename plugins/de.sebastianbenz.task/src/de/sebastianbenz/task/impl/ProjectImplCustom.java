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
import org.eclipse.xtext.util.Strings;

import de.sebastianbenz.task.Text;
import de.sebastianbenz.task.TextSegment;


public class ProjectImplCustom extends de.sebastianbenz.task.impl.ProjectImpl {
	@Override
	protected String cleanText(String text) {
		return text.substring(0, text.length()-1);
	}
	
	protected void addTextSegment(EList<TextSegment> segments, int begin,
			int end) {
		super.addTextSegment(segments, begin, end);
		if(end == getText().length()){
			Text lastSegment = (Text) segments.get(segments.size()-1);
			String string = lastSegment.getValue().trim();
			lastSegment.setValue(string.substring(0, string.length()- 1));
		}
	}
	
}
