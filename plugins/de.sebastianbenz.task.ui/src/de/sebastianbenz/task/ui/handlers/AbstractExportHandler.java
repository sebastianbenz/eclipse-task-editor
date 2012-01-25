package de.sebastianbenz.task.ui.handlers;

import static com.google.common.collect.Iterables.filter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.Files;

import de.sebastianbenz.task.TaskModel;
import de.sebastianbenz.task.generator.TaskGenerator;

public abstract class AbstractExportHandler extends AbstractEditorHandler {

	private final TaskGenerator generator;
	private final IEncodingProvider encodingProvider;

	public AbstractExportHandler(TaskGenerator generator, IEncodingProvider encodingProvider) {
		super();
		this.generator = generator;
		this.encodingProvider = encodingProvider;
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

	protected void doExport(XtextResource resource, String path) {
		Iterable<TaskModel> taskModels = filter(resource.getContents(),
				TaskModel.class);
		Iterator<TaskModel> iterator = taskModels.iterator();
		if (!iterator.hasNext()) {
			return;
		}
		CharSequence string = generator.generate(iterator.next());
		String encoding = encodingProvider.getEncoding(resource.getURI());
		writeStringIntoFile(path, string.toString(), encoding);
	}
	
	public static void writeStringIntoFile(String filename, String content, String encoding) {
		try {
			final File file = new File(filename);
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), encoding);
			try {
				writer.append(content);
			} finally {
				writer.close();
			}
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}

	protected String selectFile(Shell shell, XtextResource resource) {
		FileDialog fileDialog = new FileDialog(shell, SWT.SAVE);
		fileDialog.setFilterExtensions(fileExtensions());
		fileDialog.setText("Select target file");
		fileDialog.setFileName(resource.getURI().trimFileExtension()
				.lastSegment() + "." + getFileExtension());
		String result = fileDialog.open();
		return result;
	}

	protected abstract String getFileExtension();

}