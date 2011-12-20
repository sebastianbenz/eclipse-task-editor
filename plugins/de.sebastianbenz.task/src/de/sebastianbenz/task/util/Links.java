package de.sebastianbenz.task.util;

import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.TaskFactory;

public class Links {

	public static Link create(String description, String url, int offset,
			int length) {
		Link link = TaskFactory.eINSTANCE.createLink();
		link.setLength(length);
		link.setOffset(offset);
		link.setDescription(description);
		link.setUrl(url);
		return link;
	}

}
