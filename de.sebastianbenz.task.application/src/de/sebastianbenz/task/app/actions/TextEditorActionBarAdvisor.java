package de.sebastianbenz.task.app.actions;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;


/**
 * Adds actions to a workbench window.
 */
public final class TextEditorActionBarAdvisor extends ActionBarAdvisor {

	/**
	 * Constructs a new action builder.
	 * 
	 * @param actionBarConfigurer the configurer
	 */
	public TextEditorActionBarAdvisor(IActionBarConfigurer actionBarConfigurer) {
		super(actionBarConfigurer);
	}

    /*
     * @see org.eclipse.ui.application.ActionBarAdvisor#fillCoolBar(org.eclipse.jface.action.ICoolBarManager)
     */
    protected void fillCoolBar(ICoolBarManager cbManager) {
		cbManager.add(new GroupMarker("group.file")); //$NON-NLS-1$
		{ // File Group
			IToolBarManager fileToolBar = new ToolBarManager(cbManager.getStyle());
			fileToolBar.add(new Separator(IWorkbenchActionConstants.NEW_GROUP));
			fileToolBar.add(new GroupMarker(IWorkbenchActionConstants.OPEN_EXT));
			fileToolBar.add(new GroupMarker(IWorkbenchActionConstants.SAVE_GROUP));
			fileToolBar.add(getAction(ActionFactory.SAVE.getId()));
			
			// Add to the cool bar manager
			cbManager.add(new ToolBarContributionItem(fileToolBar,IWorkbenchActionConstants.TOOLBAR_FILE));
		}
		
		cbManager.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		
		cbManager.add(new GroupMarker(IWorkbenchActionConstants.GROUP_EDITOR));
	}
	
	/*
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)
	 */
    protected void fillMenuBar(IMenuManager menubar) {
		menubar.add(createFileMenu());
		menubar.add(createEditMenu());
	}
	
	/**
	 * Creates and returns the 'File' menu.
	 */
	private MenuManager createFileMenu() {
		MenuManager menu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE); //$NON-NLS-1$
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));

		menu.add(new GroupMarker(IWorkbenchActionConstants.NEW_EXT));
		menu.add(getAction(ActionFactory.CLOSE.getId()));
		menu.add(getAction(ActionFactory.CLOSE_ALL.getId()));
		//		menu.add(closeAllSavedAction);
		menu.add(new GroupMarker(IWorkbenchActionConstants.CLOSE_EXT));
		menu.add(new Separator());
		menu.add(getAction(ActionFactory.SAVE.getId()));
		menu.add(getAction(ActionFactory.SAVE_AS.getId()));
		menu.add(getAction(ActionFactory.SAVE_ALL.getId()));
		menu.add(getAction(ActionFactory.REVERT.getId()));
		menu.add(getAction(ActionFactory.PREFERENCES.getId()));
		menu.add(ContributionItemFactory.REOPEN_EDITORS.create(getActionBarConfigurer().getWindowConfigurer().getWindow()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.MRU));
		menu.add(new Separator());
		menu.add(getAction(ActionFactory.QUIT.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
		return menu;
	}

	/**
	 * Creates and returns the 'Edit' menu.
	 */
	private MenuManager createEditMenu() {
		MenuManager menu = new MenuManager("&Edit", IWorkbenchActionConstants.M_EDIT); //$NON-NLS-1$
		menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));

		menu.add(getAction(ActionFactory.UNDO.getId()));
		menu.add(getAction(ActionFactory.REDO.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));

		menu.add(getAction(ActionFactory.CUT.getId()));
		menu.add(getAction(ActionFactory.COPY.getId()));
		menu.add(getAction(ActionFactory.PASTE.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.CUT_EXT));

		menu.add(getAction(ActionFactory.SELECT_ALL.getId()));
		menu.add(new Separator());

		menu.add(getAction(ActionFactory.FIND.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.FIND_EXT));

		menu.add(new GroupMarker(IWorkbenchActionConstants.ADD_EXT));

		menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_END));
		menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		return menu;
	}

    /*
     * @see org.eclipse.ui.application.ActionBarAdvisor#makeActions(org.eclipse.ui.IWorkbenchWindow)
     */
    protected void makeActions(IWorkbenchWindow window) {
		registerAsGlobal(ActionFactory.SAVE.create(window));
		registerAsGlobal(ActionFactory.SAVE_AS.create(window));
		registerAsGlobal(ActionFactory.ABOUT.create(window));
		registerAsGlobal(ActionFactory.SAVE_ALL.create(window));
		registerAsGlobal(ActionFactory.UNDO.create(window));
		registerAsGlobal(ActionFactory.REDO.create(window));
		registerAsGlobal(ActionFactory.CUT.create(window));
		registerAsGlobal(ActionFactory.COPY.create(window));
		registerAsGlobal(ActionFactory.PASTE.create(window));
		registerAsGlobal(ActionFactory.SELECT_ALL.create(window));
		registerAsGlobal(ActionFactory.FIND.create(window));
		registerAsGlobal(ActionFactory.CLOSE.create(window));
		registerAsGlobal(ActionFactory.CLOSE_ALL.create(window));
		registerAsGlobal(ActionFactory.CLOSE_ALL_SAVED.create(window));
		registerAsGlobal(ActionFactory.REVERT.create(window));
		registerAsGlobal(ActionFactory.PREFERENCES.create(window));
		registerAsGlobal(ActionFactory.QUIT.create(window));
	}
	
	/**
	 * Registers the action as global action and registers it for disposal.
	 * 
	 * @param action the action to register
	 */
	private void registerAsGlobal(IAction action) {
		getActionBarConfigurer().registerGlobalAction(action);
		register(action);
	}
}
