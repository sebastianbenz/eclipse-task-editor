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

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.TextSegment;
import de.sebastianbenz.task.util.Strings2;


public class CodeImplCustom extends de.sebastianbenz.task.impl.CodeImpl {

	public static final String PREFIX = "'''";
	private String lang;

	@Override
	protected String cleanText(String text) {
		text = text.replaceAll(PREFIX, "").trim();
		return text.substring(getLang().length());
	}
	
	@Override
	public String getLang() {
		if(lang == null){
			lang = Strings2.firstWord(getText().substring(PREFIX.length()));
		}
		return lang;
	}
	
	@Override
	public EList<Tag> getTags() {
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<Link> getLinks() {
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<TextSegment> getSegments() {
		return ECollections.emptyEList();
	}
}
