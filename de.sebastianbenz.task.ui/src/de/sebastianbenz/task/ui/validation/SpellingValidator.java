package de.sebastianbenz.task.ui.validation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.core.runtime.content.IContentTypeManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
import org.eclipse.ui.texteditor.spelling.ISpellingProblemCollector;
import org.eclipse.ui.texteditor.spelling.SpellingContext;
import org.eclipse.ui.texteditor.spelling.SpellingProblem;
import org.eclipse.ui.texteditor.spelling.SpellingService;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.validation.Check;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Note;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.validation.TaskJavaValidator;

public class SpellingValidator extends TaskJavaValidator {

	private final class DocumentResolver implements Runnable {
		private final Content content;
		private IXtextDocument document;

		private DocumentResolver(Content content) {
			this.content = content;
		}

		public void run() {
			Resource resource = content.eResource();
			if (resource == null) {
				return;
			}
			IFile file = getFile(resource.getURI());
			if (file == null) {
				return;
			}
			document = XtextDocumentUtil.get(file);
		}
	}

	private static final IContentType TEXT_CONTENT_TYPE = Platform
			.getContentTypeManager()
			.getContentType(IContentTypeManager.CT_TEXT);

	private SpellingService spellingService;

	@Check
	public void checkSpelling(Task task) {
		doCheckSpelling(task);
	}

	@Check
	public void checkSpelling(Project task) {
		doCheckSpelling(task);
	}

	@Check
	public void checkSpelling(Note task) {
		doCheckSpelling(task);
	}

	private void doCheckSpelling(final Content content) {

		IDocument document = document(content);
		if (document != null) {
			ISpellingProblemCollector collector = new ISpellingProblemCollector() {

				public void endCollecting() {
				}

				public void beginCollecting() {
				}

				public void accept(SpellingProblem problem) {
					getMessageAcceptor().acceptWarning(problem.getMessage(),
							content, problem.getOffset(), problem.getLength(),
							null, new String[0]);
				}
			};
			spellingService().check(document, regionOf(content), newContext(),
					collector, new NullProgressMonitor());
		}
	}

	private IRegion[] regionOf(Content content) {
		ICompositeNode node = NodeModelUtils.getNode(content);
		int length = node.getLength();
		int offset = node.getOffset();
		return new Region[] { new Region(offset, length) };
	}

	private SpellingService spellingService() {
		if (spellingService == null) {
			IPreferenceStore preferenceStore = EditorsPlugin.getDefault()
					.getPreferenceStore();
			spellingService = new SpellingService(preferenceStore);
		}
		return spellingService;
	}

	private SpellingContext newContext() {
		SpellingContext context = new SpellingContext();
		context.setContentType(TEXT_CONTENT_TYPE);
		return context;
	}

	private IDocument document(final Content content) {
		DocumentResolver resolver = new DocumentResolver(content);
		Display.getDefault().syncExec(resolver);
		return resolver.document;
	}

	public static IFile getFile(URI uri) {
		if (uri == null) {
			return null;
		}

		String platformString = uri.toPlatformString(true);
		if (platformString == null) {
			return null;
		}

		return ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(platformString));
	}
}
