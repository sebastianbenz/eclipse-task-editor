/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
package de.sebastianbenz.task.resource;

import static com.google.common.base.Joiner.on;
import static com.google.common.collect.Lists.newArrayListWithExpectedSize;
import static com.google.common.collect.Maps.newHashMapWithExpectedSize;
import static org.eclipse.xtext.resource.EObjectDescription.create;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.util.TaskSwitch;

public class TaskResourceDescriptionStrategy extends
		DefaultResourceDescriptionStrategy {

	
	public class Implementation extends TaskSwitch<Boolean> {

		private final IAcceptor<IEObjectDescription> acceptor;

		public Implementation(IAcceptor<IEObjectDescription> acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Boolean caseProject(Project object) {
			return createContentDescription(object);
		}

		@Override
		public Boolean caseContent(Content content) {
			EList<Tag> tags = content.getTags();
			Map<String, String> userData = newHashMapWithExpectedSize(1);
			List<String> tagData = newArrayListWithExpectedSize(tags.size());
			for (Tag tag : tags) {
				createContentDescription(tag);
				tagData.add(tag.getName());
			}
			userData.put(Descriptions.TAG_KEY, on(Descriptions.SEPARATOR).join(tagData));
			QualifiedName name = nameOf(content);
			if(name == null){
				return Boolean.FALSE;
			}
			IEObjectDescription description = create(name, content, userData);
			acceptor.accept(description);
			return Boolean.TRUE;
		}
		
		
		protected Boolean createContentDescription(EObject object) {
			QualifiedName name = nameOf(object);
			if(name != null){
				acceptor.accept(EObjectDescription.create(name , object));
			}
			return Boolean.TRUE;
		}

		protected QualifiedName nameOf(EObject object) {
			return getQualifiedNameProvider().apply(object);
		}

		@Override
		public Boolean defaultCase(EObject object) {
			return Boolean.TRUE;
		}
	}

	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		if(eObject == null){
			return false;
		}
		return new Implementation(acceptor).doSwitch(eObject);
	}
}
