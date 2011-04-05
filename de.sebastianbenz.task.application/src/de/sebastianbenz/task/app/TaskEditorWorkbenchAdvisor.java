package de.sebastianbenz.task.app;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.internal.IWorkbenchConstants;

import de.sebastianbenz.task.app.actions.TextEditorActionBarAdvisor;
import de.sebastianbenz.task.ui.internal.TaskActivator;

public class TaskEditorWorkbenchAdvisor extends WorkbenchAdvisor {
	public TaskEditorWorkbenchAdvisor() {
	}

	public String getInitialWindowPerspectiveId() {
		return "de.sebastianbenz.task.app.TaskPerspective"; //$NON-NLS-1$
	}

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		return new WorkbenchWindowAdvisor(configurer) {
			public void preWindowOpen() {
				super.preWindowOpen();
				IWorkbenchWindowConfigurer wc = getWindowConfigurer();
				wc.setInitialSize(new Point(600, 450));
				wc.setShowCoolBar(true);
				wc.setShowStatusLine(true);
				wc.setShowProgressIndicator(true);
			}

			/*
			 * @see
			 * org.eclipse.ui.application.WorkbenchWindowAdvisor#postWindowCreate
			 * ()
			 * 
			 * @since 3.3
			 */
			public void postWindowCreate() {
				super.postWindowCreate();
				IWorkbenchWindowConfigurer wc = getWindowConfigurer();
				IWorkbenchPage[] pages = wc.getWindow().getPages();
				for (int i = 0; i < pages.length; i++) {
					pages[i].hideActionSet("org.eclipse.ui.edit.text.actionSet.openExternalFile");
					pages[i].hideActionSet("org.eclipse.search.menu");
					// pages[i].hideActionSet("org.eclipse.ui.edit.text.actionSet.annotationNavigation");
					// pages[i].hideActionSet("org.eclipse.ui.edit.text.actionSet.navigation");
				}
				TaskActivator.getInstance();
			}

			/*
			 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#
			 * createActionBarAdvisor
			 * (org.eclipse.ui.application.IActionBarConfigurer)
			 */
			public ActionBarAdvisor createActionBarAdvisor(
					IActionBarConfigurer abConfigurer) {
				return new TextEditorActionBarAdvisor(abConfigurer);
			}
		};
	}

	@Override
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);
		configurer.setSaveAndRestore(true);
		
	}

	@Override
	public IStatus saveState(IMemento memento) {
		IEditorReference[] editorReferences = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (IEditorReference editor : editorReferences) {
			IEditorInput input;
			try {
				input = editor.getEditorInput();
				IPersistableElement persistable = input.getPersistable();
				// Save input.
				IMemento inputMem = memento
						.createChild(IWorkbenchConstants.TAG_INPUT);
				inputMem.putString(IWorkbenchConstants.TAG_FACTORY_ID,
						persistable.getFactoryId());
				persistable.saveState(inputMem);
			} catch (PartInitException e) {
				new Status(IStatus.ERROR, "de.sebastianbenz.task.application",
						"Exception while saving editors", e);
			}
		}
		return Status.OK_STATUS;
	}
}
