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
package de.sebastianbenz.task.ui.validation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import de.sebastianbenz.task.Code;
import de.sebastianbenz.task.ui.highlighting.BrushRegistry;
import de.sebastianbenz.task.validation.TaskJavaValidator;

public class TaskUiValidator extends TaskJavaValidator {


	@Inject
	private BrushRegistry brushes;
	
	@Check
	public void checkCodeLangIsRegistered(Code code) {
		String lang = code.getLang();
		if(Strings.isEmpty(lang)){
			return;
		}
		if(!brushes.getLanguages().contains(lang)){
			acceptWarning("Unknown language", code, NodeModelUtils.getNode(code).getOffset() + 3, lang.length(), "UnknownLanguage");
		}
	}

	public static IFile getFile(URI uri) {
		if (uri == null) {
			return null;
		}

		String platformString = uri.toPlatformString(true);
		if (platformString == null) {
			return null;
		}

		return ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(platformString));
	}
}
