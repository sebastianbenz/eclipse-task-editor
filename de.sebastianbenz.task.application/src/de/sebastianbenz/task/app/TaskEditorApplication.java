package de.sebastianbenz.task.app;

import it.sauronsoftware.junique.AlreadyLockedException;
import it.sauronsoftware.junique.JUnique;
import it.sauronsoftware.junique.MessageHandler;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.sebastianbenz.task.app.actions.EditorOpener;

public class TaskEditorApplication implements IApplication {

	private static final String APP_ID = "eclipse-task-editor";

	/*
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
	 * IApplicationContext)
	 * 
	 * @since 3.3
	 */
	public Object start(IApplicationContext context) throws Exception {
		String[] args = arguments(context);
		final TaskEditorWorkbenchAdvisor workbenchAdvisor = new TaskEditorWorkbenchAdvisor(
				args);
		boolean alreadyRunning;
		try {
			JUnique.acquireLock(APP_ID, new MessageHandler() {
				public String handle(final String message) {
					Display.getDefault().asyncExec(new Runnable() {
						
						public void run() {
							IWorkbenchWindow window = PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow();
							EditorOpener.open(window, message);
							window.getShell().forceActive();
							
						}
						
					});
					return null;
				}
			});
			alreadyRunning = false;
		} catch (AlreadyLockedException e) {
			alreadyRunning = true;
		}
		if (!alreadyRunning) {
			Display display = PlatformUI.createDisplay();
			try {
				int returnCode = PlatformUI.createAndRunWorkbench(display,
						workbenchAdvisor);
				if (returnCode == PlatformUI.RETURN_RESTART)
					return IApplication.EXIT_RESTART;
				return IApplication.EXIT_OK;
			} finally {
				display.dispose();
			}
		} else {
			for (int i = 0; i < args.length; i++) {
				JUnique.sendMessage(APP_ID, args[i]);
			}
		}
		return IApplication.EXIT_OK;
	}

	private String[] arguments(IApplicationContext context) {
		Object value = context.getArguments().get("application.args");
		if (value instanceof String[]) {
			return (String[]) value;
		}
		return new String[0];
	}

	/*
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 * 
	 * @since 3.3
	 */
	public void stop() {
	}
}
