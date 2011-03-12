package de.sebastianbenz.task.ui.views;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.IOutlineNodeComparer;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineTreeState;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

import de.sebastianbenz.task.ui.internal.TaskActivator;

public class ViewRefreshJob extends Job {
	
	private TodoView todoView;
	
	@Inject
	private IOutlineNodeComparer nodeComparer;
	
	public ViewRefreshJob() {
		super("Refreshing outline");
	}

	public void setOutlinePage(TodoView todoView) {
		this.todoView = todoView;
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			OutlineTreeState formerState = new OutlineTreeState(todoView.getTreeViewer());
			OutlineTreeState newState = new OutlineTreeState();
			IOutlineNode rootNode = refreshOutlineModel(monitor, formerState, newState);
			if (!monitor.isCanceled())
				todoView.refreshViewer(rootNode, newState.getExpandedNodes(), newState.getSelectedNodes());
			return Status.OK_STATUS;
		} catch (Throwable t) {
			return new Status(IStatus.ERROR, TaskActivator.getInstance().getBundle().getSymbolicName(), "Error refreshing outline", t);
		}
	}

	protected IOutlineNode refreshOutlineModel(final IProgressMonitor monitor, final OutlineTreeState formerState,
			final OutlineTreeState newState) {
		IOutlineNode rootNode = todoView.getTreeProvider().createRoot(todoView.getGlobaState());
		restoreChildrenSelectionAndExpansion(rootNode, formerState, newState);
		return rootNode;
	}
	
	protected void restoreChildrenSelectionAndExpansion(IOutlineNode parent, OutlineTreeState formerState, OutlineTreeState newState) {
		List<IOutlineNode> children = parent.getChildren();
		for(IOutlineNode child: children) {
			if(containsUsingComparer(formerState.getExpandedNodes(), child)) {
				restoreChildrenSelectionAndExpansion(child, formerState, newState);
				newState.addExpandedNode(child);
			}
			if(containsUsingComparer(formerState.getSelectedNodes(), child)) {
				newState.addSelectedNode(child);
			}
		}
	}
	
	protected boolean containsUsingComparer(Iterable<IOutlineNode> list, final IOutlineNode node) {
		return Iterables.any(list, new Predicate<IOutlineNode>() {
			public boolean apply(IOutlineNode nodeFromList) {
				return nodeComparer.equals(node, nodeFromList);
			}
		});
	}
}