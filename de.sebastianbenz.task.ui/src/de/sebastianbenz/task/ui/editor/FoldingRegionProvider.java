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
package de.sebastianbenz.task.ui.editor;

import static com.google.common.collect.Sets.newHashSet;
import static de.sebastianbenz.task.TaskPackage.Literals.PROJECT;
import static de.sebastianbenz.task.TaskPackage.Literals.TASK_MODEL;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;

public class FoldingRegionProvider extends DefaultFoldingRegionProvider {
	
	private static final Set<EClass> supportedTypes = newHashSet(TASK_MODEL, PROJECT);//, NOTE);
	
//
//	
//	
//	public class Implementation extends TaskSwitch<Boolean> {
//
//		private final IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor;
//
//		public Implementation(
//				IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
//					this.foldingRegionAcceptor = foldingRegionAcceptor;
//		}
//
//		@Override
//		public Boolean caseProject(Project project) {
//			Project nextProject = findNextProjectOnSameOrHigherLevel(project);
//			if(nextProject == null){
////				foldingRegionAcceptor.accept(offset, length)
//			}
//			return Boolean.TRUE;
//		}
//
//		private Project findNextProjectOnSameOrHigherLevel(Project project) {
//			Todo todo = (Todo) project.eContainer();
//			int start = todo.getContents().indexOf(project);
//			while(start < todo.getContents().size()){
//				Content content = todo.getContents().get(start);
//				if (content instanceof Project) {
//					Project candidate = (Project) content;
//					if(candidate.getIntend().size() <= project.getIntend().size()){
//						return candidate;
//					}
//				}
//				start++;
//			}
//			return null;
//		}
//		
//	}
//
//	@Override
//	protected void computeObjectFolding(EObject eObject,
//			IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
//		new Implementation(foldingRegionAcceptor).doSwitch(eObject);
//	}
//	
	@Override
	protected boolean isHandled(EObject eObject) {
		return supportedTypes.contains(eObject.eClass());
	}
}
