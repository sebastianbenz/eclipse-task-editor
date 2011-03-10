package de.sebastianbenz.task.tagging;

import static com.google.common.collect.Iterables.concat;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.collect.Iterators;

import de.sebastianbenz.task.taskPaper.Task;
import de.sebastianbenz.task.util.Tasks;

public class TagProvider {

	public Iterable<Tag> in(Resource r) {
		Iterator<Task> tasks = Iterators.filter(r.getAllContents(), Task.class);
		Iterable<Tag> result = Collections.emptyList();
		while (tasks.hasNext()) {
			result = concat(Tasks.allTags(tasks.next()), result);
		}
		return result;
	}

}
