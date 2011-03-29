package de.sebastianbenz.task.query;

import static com.google.common.collect.Iterables.filter;
import static org.eclipse.emf.common.util.URI.createURI;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;

public class QueryStringParser {

	private XtextResourceSet resourceSet = createResourceSet();
	
	public Query parse(String input){
		resourceSet.getResources().clear();
		Resource resource = resourceSet.createResource(createURI("MyQuery.__query"));
		try {
			resource.load(new StringInputStream(input), null);
			EcoreUtil.resolveAll(resource);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return filter(resource.getContents(), Query.class).iterator().next();
	}

	private XtextResourceSet createResourceSet() {
		XtextResourceSet resourceSet = new SynchronizedXtextResourceSet();
		return resourceSet;
	}
	
}
