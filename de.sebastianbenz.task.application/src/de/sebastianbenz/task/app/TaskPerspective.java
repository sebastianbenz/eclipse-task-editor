package de.sebastianbenz.task.app;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import de.sebastianbenz.task.ui.views.TodoView;


public class TaskPerspective implements IPerspectiveFactory {

    public TaskPerspective() {
    }

    public void createInitialLayout(IPageLayout layout) {
    	String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.setFixed(true);
		layout.addStandaloneView(TodoView.ID,  false, IPageLayout.LEFT, 0.25f, editorArea);
    }
}
