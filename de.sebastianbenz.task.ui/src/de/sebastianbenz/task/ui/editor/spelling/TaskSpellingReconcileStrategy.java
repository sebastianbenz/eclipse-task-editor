package de.sebastianbenz.task.ui.editor.spelling;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ISynchronizable;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelExtension;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.texteditor.spelling.ISpellingProblemCollector;
import org.eclipse.ui.texteditor.spelling.SpellingAnnotation;
import org.eclipse.ui.texteditor.spelling.SpellingProblem;
import org.eclipse.ui.texteditor.spelling.SpellingReconcileStrategy;
import org.eclipse.ui.texteditor.spelling.SpellingService;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

import de.sebastianbenz.task.ui.editor.TaskTokenTypeToPartitionTypeMapper;
import de.sebastianbenz.task.ui.internal.TaskActivator;
import de.sebastianbenz.task.ui.preferences.TaskPreferenceConstants;

public class TaskSpellingReconcileStrategy extends SpellingReconcileStrategy {

	/*
	 * copied from org.eclipse.ui.texteditor.spelling.SpellingReconcileStrategy.SpellingProblemCollector but ignores code blocks
	 */
	private class SpellingProblemCollector implements ISpellingProblemCollector {

		/** Annotation model. */
		private IAnnotationModel fAnnotationModel;

		/** Annotations to add. */
		private Map<SpellingAnnotation, Position> fAddAnnotations;

		/** Lock object for modifying the annotations. */
		private Object fLockObject;

		/**
		 * Initializes this collector with the given annotation model.
		 *
		 * @param annotationModel the annotation model
		 */
		public SpellingProblemCollector(IAnnotationModel annotationModel) {
			Assert.isLegal(annotationModel != null);
			fAnnotationModel= annotationModel;
			if (fAnnotationModel instanceof ISynchronizable)
				fLockObject= ((ISynchronizable)fAnnotationModel).getLockObject();
			else
				fLockObject= fAnnotationModel;
		}

		/*
		 * @see org.eclipse.ui.texteditor.spelling.ISpellingProblemCollector#accept(org.eclipse.ui.texteditor.spelling.SpellingProblem)
		 */
		public void accept(SpellingProblem problem) {
			try {
				if(!TaskActivator.getInstance().getPreferenceStore().getBoolean(TaskPreferenceConstants.SPELL_CHECKING)){
					return;
				}
				String contentType = getDocument().getContentType(problem.getOffset());
				if(TaskTokenTypeToPartitionTypeMapper.CODE_PARTITION.equals(contentType)){
					return;
				}
			} catch (BadLocationException e) {
				// ignore
			}
			fAddAnnotations.put(new SpellingAnnotation(problem), new Position(problem.getOffset(), problem.getLength()));
		}

		/*
		 * @see org.eclipse.ui.texteditor.spelling.ISpellingProblemCollector#beginCollecting()
		 */
		public void beginCollecting() {
			fAddAnnotations= Maps.newHashMap();
		}

		/*
		 * @see org.eclipse.ui.texteditor.spelling.ISpellingProblemCollector#endCollecting()
		 */
		public void endCollecting() {

			List<Object> toRemove= Lists.newArrayList();

			synchronized (fLockObject) {
				Iterator<?> iter= fAnnotationModel.getAnnotationIterator();
				while (iter.hasNext()) {
					Annotation annotation= (Annotation)iter.next();
					if (SpellingAnnotation.TYPE.equals(annotation.getType()))
						toRemove.add(annotation);
				}
				Annotation[] annotationsToRemove= (Annotation[])toRemove.toArray(new Annotation[toRemove.size()]);

				if (fAnnotationModel instanceof IAnnotationModelExtension)
					((IAnnotationModelExtension)fAnnotationModel).replaceAnnotations(annotationsToRemove, fAddAnnotations);
				else {
					for (int i= 0; i < annotationsToRemove.length; i++)
						fAnnotationModel.removeAnnotation(annotationsToRemove[i]);
					for (iter= fAddAnnotations.keySet().iterator(); iter.hasNext();) {
						Annotation annotation= (Annotation)iter.next();
						fAnnotationModel.addAnnotation(annotation, (Position)fAddAnnotations.get(annotation));
					}
				}
			}

			fAddAnnotations= null;
		}
	}
	
	
	@Inject
	public TaskSpellingReconcileStrategy(ISourceViewer viewer,
			SpellingService spellingService) {
		super(viewer, spellingService);
	}
	
	@Override
	protected ISpellingProblemCollector createSpellingProblemCollector() {
		IAnnotationModel model= getAnnotationModel();
		if (model == null)
			return null;
		return new SpellingProblemCollector(getAnnotationModel());
	}

	
}
