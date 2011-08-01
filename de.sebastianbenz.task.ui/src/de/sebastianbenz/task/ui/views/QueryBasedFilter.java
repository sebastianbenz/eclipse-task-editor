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
package de.sebastianbenz.task.ui.views;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

import com.google.inject.Inject;

import de.sebastianbenz.task.query.Query;
import de.sebastianbenz.task.query.QueryInterpreter;
import de.sebastianbenz.task.query.QueryStringParser;

public class QueryBasedFilter extends ViewerFilter implements ModifyListener{

	private class RefreshJob extends Job {

		public RefreshJob() {
			super("Query evaluator");
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			if(viewer == null){
				return Status.OK_STATUS;
			}
			Display.getDefault().asyncExec(new Runnable() {
				
				public void run() {
					if(!viewer.getControl().isDisposed())
						viewer.refresh();
				}
			});
			return Status.OK_STATUS;
		}
		
	}
	
	
	private Viewer viewer;
	private RefreshJob refreshJob = new RefreshJob();
	private String text;
	@Inject
	private QueryInterpreter queryInterpreter;
	@Inject
	private QueryStringParser queryParser;
	
	private Query query;

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		this.viewer = viewer;
		if (!(element instanceof EObject)) {
			return true;
		}
		return queryInterpreter.select(query, (EObject) element);
	}

	public void modifyText(ModifyEvent e) {
		if(e.getSource() instanceof Text){
			String newText = ((Text)e.getSource()).getText();
			if(!newText.trim().equals(text)){
				text = newText;
				updateQuery();
				refreshJob.cancel();
				refreshJob.schedule(100);
			}
		}
	}

	private void updateQuery() {
		query = queryParser.parse(text);
		if(query == null || query.getExpression() == null){
			expand(1);
		}else{
			expandAll();
		}
	}

	private void expand(int i) {
		if (viewer instanceof TreeViewer) {
			((TreeViewer) viewer).expandToLevel(i);
		}
	}

	protected void expandAll() {
		if (viewer instanceof TreeViewer) {
			((TreeViewer) viewer).expandAll();
		}
	}

}
