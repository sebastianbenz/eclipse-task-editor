package de.sebastianbenz.task.util;

import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.TaskFactory;

public class Tasks {

	public static Task newTask(String text) {
		Task task = TaskFactory.eINSTANCE.createTask();
		task.setText(text);
		return task;
	}
}
