/*******************************************************************************
 * Copyright (c) 2011 Sebastian.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian - initial API and implementation
 ******************************************************************************/
package de.sebastianbenz.task.ui.views;

import static org.eclipse.emf.ecore.util.EcoreUtil.getURI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;

import com.google.inject.Inject;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.ui.contentassist.TextProposalProvider;
import de.sebastianbenz.task.ui.internal.TaskActivator;

public class TodoView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "de.sebastianbenz.task.ui.views.TodoView";

	private TreeViewer viewer;

	private static class ContentSorter extends ViewerSorter {
		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			if (!(e1 instanceof Content)) {
				return super.compare(viewer, e1, e2);
			}
			if (!(e2 instanceof Content)) {
				return super.compare(viewer, e1, e2);
			}
			return ((Content) e1).getValue().compareTo(
					((Content) e2).getValue());
		}
	}

	@Inject
	private TodoViewLabelProvider labelProvider;

	@Inject
	private ContentProvider contentProvider;

	@Inject
	private TextProposalProvider proposalProvider;

	@Inject
	private QueryBasedFilter queryBasedViewFilter;

	@Inject
	private GlobalStateManager globalState;

	private Text queryText;

	private Action actionCollapseAll;

	private Action actionSort;

	private Action openInEditor;

	@Inject
	private IURIEditorOpener editorOpener;

	@Inject
	private TreeState treeState;

	private DrillDownAdapter drillDownAdapter;

	private IMemento memento;

	@Override
	public void createPartControl(Composite parent) {
		globalState.init();

		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		parent.setLayout(layout);

		configureQueryField(parent);
		configureTree(parent);
		configureActions();
		PlatformUI
				.getWorkbench()
				.getHelpSystem()
				.setHelp(viewer.getControl(), "de.sebastianbenz.task.ui.viewer");

		restoreState();
	}

	private void restoreState() {
		if (memento == null) {
			return;
		}
		viewer.setExpandedElements(treeState.restoreExpandedElements(memento,
				globalState));
		queryText.setText(treeState.restoreQuery(memento));
	}

	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		super.init(site, memento);
		this.memento = memento;
	}

	@Override
	public void saveState(IMemento memento) {
		super.saveState(memento);
		treeState.saveExpandedElements(viewer.getExpandedElements(), memento);
		treeState.saveQuery(queryText.getText(), memento);
	}

	protected void configureQueryField(Composite parent) {
		queryText = new Text(parent, SWT.SINGLE | SWT.BORDER | SWT.ICON_SEARCH | SWT.SEARCH
				| SWT.ICON_CANCEL);
		GridData gridData = new GridData(SWT.LEFT, SWT.TOP, true, false);
		gridData.horizontalAlignment = GridData.FILL;
		queryText.setLayoutData(gridData);
		queryText.setToolTipText("Enter a query...");
		queryText.setSelection(0, queryText.getText().length());
		queryText.addModifyListener(queryBasedViewFilter);
		proposalProvider.configure(queryText);
	}

	protected void configureTree(Composite parent) {
		viewer = new TreeViewer(parent);
		GridData gridData = new GridData(SWT.LEFT, SWT.TOP, true, true);
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		viewer.getTree().setLayoutData(gridData);
		viewer.setAutoExpandLevel(1);
		//viewer.setSorter(new ContentSorter());
		viewer.setLabelProvider(labelProvider);
		contentProvider.init(globalState);
		viewer.setContentProvider(contentProvider);
		viewer.setUseHashlookup(true);
		viewer.setFilters(new ViewerFilter[] { queryBasedViewFilter });
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setInput(globalState.getRoot());
	}

	protected void configureActions() {
		makeActions();
		IActionBars bars = ((IViewSite) getSite()).getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
		hookDoubleClickAction();
	}

	private void fillLocalPullDown(IMenuManager manager) {
//		manager.add(actionCollapseAll);
//		manager.add(new Separator());
//		manager.add(actionSort);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
//		manager.add(actionCollapseAll);
//		manager.add(actionSort);
//		manager.add(new Separator());
//		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
//		actionCollapseAll = createActionCollapseAll();
//		actionCollapseAll.setText("Collapse all");
//		actionCollapseAll.setImageDescriptor(image("collapseall.gif"));
//
//		actionSort = createActionSort();
//		actionSort.setText("Sort");
//		actionSort.setImageDescriptor(image("sort.gif"));
		openInEditor = createActionJumpToElement();

	}

	private ImageDescriptor image(String string) {
		String pluginId = TaskActivator.getInstance().getBundle()
				.getSymbolicName();
		return TaskActivator.imageDescriptorFromPlugin(pluginId, "icons/"
				+ string);
	}

	private Action createActionCollapseAll() {
		return new Action() {
			@Override
			public void run() {
				viewer.collapseAll();
			}
		};
	}

	private Action createActionSort() {
		return new Action("Sort", IAction.AS_CHECK_BOX) {
			@Override
			public void run() {

				if (isChecked()) {
					viewer.setSorter(new ContentSorter());
				} else {
					viewer.setSorter(null);
				}
				viewer.refresh();
			}
		};
	}

	private Action createActionJumpToElement() {
		return new Action() {
			@Override
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();
				if (obj instanceof EObject) {
					editorOpener.open(getURI((EObject) obj), true);
				}
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				openInEditor.run();
			}
		});
	}

	public TreeViewer getTreeViewer() {
		return viewer;
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		queryText.setFocus();
	}

	public GlobalStateManager getGlobaState() {
		return globalState;
	}

	@Override
	public void dispose() {
		super.dispose();
		globalState.dispose();
	}
}
