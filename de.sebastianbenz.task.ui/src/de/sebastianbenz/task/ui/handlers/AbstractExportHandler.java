package de.sebastianbenz.task.ui.handlers;

import static com.google.common.collect.Iterables.filter;

import java.util.Iterator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.Files;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

import de.sebastianbenz.task.TaskModel;
import de.sebastianbenz.task.generator.TaskGenerator;

public abstract class AbstractExportHandler extends AbstractEditorHandler {

	private final TaskGenerator generator;

	public AbstractExportHandler(TaskGenerator generator) {
		super();
		this.generator = generator;
	}

	protected abstract String[] fileExtensions();

	@Override
	protected void doExecute(final XtextEditor xtextEditor,
			XtextResource resource) {
		String path = selectFile(xtextEditor.getSite().getShell(), resource);
		if (path == null) {
			return;
		}
		doExport(resource, path);
	}

	private void doExport(XtextResource resource, String path) {
		Iterable<TaskModel> taskModels = filter(resource.getContents(),
				TaskModel.class);
		Iterator<TaskModel> iterator = taskModels.iterator();
		if (!iterator.hasNext()) {
			return;
		}
		StringConcatenation string = generator.generate(iterator.next());
		Files.writeStringIntoFile(path, string.toString());

	}

	protected String selectFile(Shell shell, XtextResource resource) {
		FileDialog fileDialog = new FileDialog(shell, SWT.SAVE);
		fileDialog.setFilterExtensions(fileExtensions());
		fileDialog.setText("Select target file");
		fileDialog.setFileName(resource.getURI().trimFileExtension()
				.lastSegment());
		String result = fileDialog.open();
		return result;
	}

}