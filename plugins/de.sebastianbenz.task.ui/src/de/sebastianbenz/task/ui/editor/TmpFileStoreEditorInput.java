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
package de.sebastianbenz.task.ui.editor;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.ui.ide.FileStoreEditorInput;

/**
 * An implementation of filestore that indicates that the file is a temporary
 * "untitled" file.
 * 
 */
public class TmpFileStoreEditorInput extends FileStoreEditorInput {
	/**
	 * Property name of property that indicates "true" if a linked resource is backed by
	 * a temporary file.
	 */
	public static final QualifiedName UNTITLED_PROPERTY = new QualifiedName("de.sebastianbenz.task", "untitled");

	public TmpFileStoreEditorInput(IFileStore fileStore) {
		super(fileStore);
	}

}
