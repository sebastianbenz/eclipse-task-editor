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

import static org.eclipse.jface.text.TextUtilities.getContentType;

import org.apache.log4j.Logger;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.swt.custom.LineBackgroundEvent;
import org.eclipse.swt.custom.LineBackgroundListener;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;

import de.sebastianbenz.task.ui.TaskTokenTypeToPartitionTypeMapper;
import de.sebastianbenz.task.ui.highlighting.SolarizedDark;

public class TaskEditor extends ExtLinkedXtextEditor{
	
	private static final Logger LOG = Logger.getLogger(TaskEditor.class);

	private Color background;
	
	private StyledText textWidget;

	
	@Override
	protected ISourceViewer createSourceViewer(Composite parent,
			IVerticalRuler ruler, int styles) {
		ISourceViewer result = super.createSourceViewer(parent, ruler, styles);
		result.getTextWidget().setWordWrap(true);
		textWidget = result.getTextWidget();
		background = new Color(parent.getDisplay(), SolarizedDark.BACKGROUND);
		
		textWidget.addLineBackgroundListener(new LineBackgroundListener() {
			
			public void lineGetBackground(LineBackgroundEvent event) {
				try {
					String contentType = getContentType(getDocument(), IDocumentExtension3.DEFAULT_PARTITIONING, event.lineOffset + event.lineText.length(), false);
					if(TaskTokenTypeToPartitionTypeMapper.CODE_PARTITION.equals(contentType)){
						event.lineBackground = background;
					}
				} catch (BadLocationException e) {
					LOG.error(e.getMessage(), e);
				}
			}
		});
		return result;
	}
	
	@Override
	public void dispose() {
		super.dispose();
		background.dispose();
	}
	
	
}
