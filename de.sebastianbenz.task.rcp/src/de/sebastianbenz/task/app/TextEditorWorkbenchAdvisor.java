package de.sebastianbenz.task.app;

import org.eclipse.swt.graphics.Point;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import de.sebastianbenz.task.app.actions.TextEditorActionBarAdvisor;


public class TextEditorWorkbenchAdvisor extends WorkbenchAdvisor {
	public TextEditorWorkbenchAdvisor() {
	}

    public String getInitialWindowPerspectiveId() {
		return "de.sebastianbenz.task.app.TextEditorPerspective"; //$NON-NLS-1$
	}
	
    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		return new WorkbenchWindowAdvisor(configurer) {
            public void preWindowOpen() {
				super.preWindowOpen();
				IWorkbenchWindowConfigurer wc= getWindowConfigurer();
				wc.setInitialSize(new Point(600, 450));
				wc.setShowCoolBar(true);
				wc.setShowStatusLine(true);
			}

			/*
			 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#postWindowCreate()
			 * @since 3.3
			 */
			public void postWindowCreate() {
				super.postWindowCreate();
				IWorkbenchWindowConfigurer wc= getWindowConfigurer();
				IWorkbenchPage[] pages= wc.getWindow().getPages();
				for (int i=0; i < pages.length; i++) {
					pages[i].hideActionSet("org.eclipse.ui.edit.text.actionSet.openExternalFile");
//					pages[i].hideActionSet("org.eclipse.ui.edit.text.actionSet.annotationNavigation");
//					pages[i].hideActionSet("org.eclipse.ui.edit.text.actionSet.navigation");
				}
				
			}
			
            /*
             * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#createActionBarAdvisor(org.eclipse.ui.application.IActionBarConfigurer)
             */
            public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer abConfigurer) {
				return new TextEditorActionBarAdvisor(abConfigurer);
			}
		};
	}
}
