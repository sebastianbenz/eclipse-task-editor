package de.sebastianbenz.task.ui.views;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineNodeContentProvider;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineNodeLabelProvider;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.ui.util.DisplayRunHelper;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

import de.sebastianbenz.task.ui.outline.TaskOutlineTreeProvider;
import de.sebastianbenz.task.ui.views.ViewerUpdater.ResourceDescriptionsChangeListener;

public class TodoView extends ViewPart implements ResourceDescriptionsChangeListener {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "de.sebastianbenz.task.ui.views.TodoView";

	private TreeViewer viewer;
	private Action doubleClickAction;

	class NameSorter extends ViewerSorter {
	}

	private static final Logger LOG = Logger.getLogger(OutlinePage.class);

	@Inject
	private OutlineNodeLabelProvider labelProvider;

	@Inject
	private OutlineNodeContentProvider contentProvider;

	@Inject
	private TaskOutlineTreeProvider treeProvider;

	@Inject
	private ViewerUpdater updater;

	@Inject
	private QueryBasedFilter queryBasedViewFilter;

	@Inject
	private ViewRefreshJob refreshJob;
	
	@Inject
	private GlobalState globalState;
	
	@Override
	public void createPartControl(Composite parent) {
		// Create the help context id for the viewer's control
		configureTree(parent);
		configureActions();
		PlatformUI
				.getWorkbench()
				.getHelpSystem()
				.setHelp(viewer.getControl(), "de.sebastianbenz.task.ui.viewer");
		updater.addListener(this);
		refreshJob.setOutlinePage(this);
	}

	protected void configureTree(Composite parent) {
		viewer = new TreeViewer(parent);
		viewer.setLabelProvider(labelProvider);
		viewer.setContentProvider(contentProvider);
		viewer.setUseHashlookup(true);
		viewer.setFilters(new ViewerFilter[]{queryBasedViewFilter});
		new DrillDownAdapter(viewer);
		initViewer();
	}

	private void initViewer() {
		List<IOutlineNode> initiallyExpandedNodes = getInitiallyExpandedNodes();
		refreshViewer(initiallyExpandedNodes.isEmpty() ? null
				: initiallyExpandedNodes.get(0), initiallyExpandedNodes,
				Collections.<IOutlineNode> emptySet());
	}

	protected List<IOutlineNode> getInitiallyExpandedNodes() {
			IOutlineNode rootNode = treeProvider.createRoot(globalState);
			List<IOutlineNode> result = newArrayList(rootNode);
			addChildren(Collections.singletonList(rootNode), result,
					getDefaultExpansionLevel());
			return result;
	}

	protected int getDefaultExpansionLevel() {
		return 1;
	}

	protected void addChildren(List<IOutlineNode> nodes,
			List<IOutlineNode> allChildren, int depth) {
		for (IOutlineNode node : nodes) {
			List<IOutlineNode> children = node.getChildren();
			if (depth > 1) {
				allChildren.addAll(children);
				addChildren(children, allChildren, depth - 1);
			}
		}
	}


	protected void configureActions() {
	}

	public void scheduleRefresh() {
		refreshJob.cancel();
		refreshJob.schedule();
	}

	public TreeViewer getTreeViewer() {
		return viewer;
	}

	public TaskOutlineTreeProvider getTreeProvider() {
		return treeProvider;
	}

	protected void refreshViewer(final IOutlineNode rootNode,
			final Collection<IOutlineNode> nodesToBeExpanded,
			final Collection<IOutlineNode> selectedNodes) {
		DisplayRunHelper.runAsyncInDisplayThread(new Runnable() {
			public void run() {
				try {
					TreeViewer viewer = getTreeViewer();
					if (!viewer.getTree().isDisposed()) {
						viewer.setInput(rootNode);
						viewer.expandToLevel(2);
						viewer.setExpandedElements(Iterables.toArray(
								nodesToBeExpanded, IOutlineNode.class));
						viewer.setSelection(new StructuredSelection(Iterables
								.toArray(selectedNodes, IOutlineNode.class)));
						treeUpdated();
					}
				} catch (Throwable t) {
					LOG.error("Error refreshing task view", t);
				}
			}
		});
	}

	/**
	 * For testing.
	 */
	protected void treeUpdated() {
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public void handleResourceDescriptionChange(List<Delta> deltas) {
		refreshJob.cancel();
		refreshJob.schedule();
	}

	public GlobalState getGlobaState() {
		return globalState;
	}
}