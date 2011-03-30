package de.sebastianbenz.task.ui.views;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;

import com.google.inject.Inject;

import de.sebastianbenz.task.ui.labeling.TaskLabelProvider;

public class TodoViewLabelProvider extends DelegatingStyledCellLabelProvider
		implements ILabelProvider {

	private final TaskLabelProvider labelProvider;

	@Inject
	public TodoViewLabelProvider(TaskLabelProvider labelProvider) {
		super(labelProvider);
		this.labelProvider = labelProvider;
	}

	public String getText(Object element) {
		return labelProvider.getStyledText(element).getString();
	}

}
