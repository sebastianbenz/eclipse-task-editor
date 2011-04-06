package de.sebastianbenz.task.ui.views;

import java.util.Stack;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.NotifyChangedToViewerRefresh;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.XMLMemento;
import org.eclipse.xtext.ui.InjectableAdapterFactory;

import com.google.inject.Inject;

public class ContentProvider extends AdapterFactoryContentProvider {

	public class ExpandingViewerRefresh extends ViewerRefresh {

		public ExpandingViewerRefresh(Viewer viewer) {
			super(viewer);
		}

		@Override
		public void run() {
			if (viewer != null && viewer.getControl() != null && !viewer.getControl().isDisposed()){
				IMemento memento = XMLMemento.createWriteRoot("TMP");
				treeState.saveExpandedElements(expandedElements(), memento );
				super.run();
				Object[] expandedElements = treeState.restoreExpandedElements(memento, globalStateManager);
				for (Object object : expandedElements) {
					treeViewer().reveal(treePath(object));
				}
				treeViewer().setExpandedElements(expandedElements);
			}
		}

		private TreePath treePath(Object object) {
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				Stack<Object> path = new Stack<Object>();
				while(eObject != null){
					path.push(eObject);
					eObject = eObject.eContainer();
				}
				Object[] segments = new Object[path.size()];
				for(int i = 0; !path.isEmpty(); i++){
					segments[i] = path.pop();
				}
				return new TreePath(segments);
			}
			return null;
		}


		private TreeViewer treeViewer() {
			return (TreeViewer)viewer;
		}

		private Object[] expandedElements() {
			if (viewer instanceof TreeViewer) {
				TreeViewer treeViewer = (TreeViewer) viewer;
				return treeViewer.getExpandedElements();
			}
			return new Object[0];
		}
	}

	private final TreeState treeState;
	private GlobalStateManager globalStateManager;

	@Inject
	public ContentProvider(InjectableAdapterFactory adapterFactory,
			TreeState treeState) {
		super(adapterFactory);
		this.treeState = treeState;
	}

	public void init(GlobalStateManager globalStateManager){
		this.globalStateManager = globalStateManager;
	}
	
	public void notifyChanged(Notification notification) {
		if (viewer != null && viewer.getControl() != null
				&& !viewer.getControl().isDisposed()) {
			// If the notification is an IViewerNotification, it specifies how
			// ViewerRefresh should behave. Otherwise fall
			// back to NotifyChangedToViewerRefresh, which determines how to
			// refresh the viewer directly from the model
			// notification.
			//
			if (notification instanceof IViewerNotification) {
				if (viewerRefresh == null) {
					viewerRefresh = new ExpandingViewerRefresh(viewer);
				}

				if (viewerRefresh
						.addNotification((IViewerNotification) notification)) {
					viewer.getControl().getDisplay().asyncExec(viewerRefresh);
				}
			} else {
				NotifyChangedToViewerRefresh.handleNotifyChanged(viewer,
						notification.getNotifier(),
						notification.getEventType(), notification.getFeature(),
						notification.getOldValue(), notification.getNewValue(),
						notification.getPosition());
			}
		}
	}
}
