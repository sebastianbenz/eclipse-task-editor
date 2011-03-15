package de.sebastianbenz.task.app;

import org.eclipse.swt.widgets.Display;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;


public class TextEditorApplication implements IApplication {

	/*
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 * @since 3.3
	 */
	public Object start(IApplicationContext context) throws Exception {
        WorkbenchAdvisor workbenchAdvisor = new TextEditorWorkbenchAdvisor();
        Display display = PlatformUI.createDisplay();
        try {
            int returnCode = PlatformUI.createAndRunWorkbench(display, workbenchAdvisor);
            if (returnCode == PlatformUI.RETURN_RESTART)
                return IApplication.EXIT_RESTART;
			return IApplication.EXIT_OK;
        } finally {
            display.dispose();
        }
	}

	/*
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 * @since 3.3
	 */
	public void stop() {
	}
}
