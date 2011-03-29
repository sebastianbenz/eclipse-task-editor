package de.sebastianbenz.task.ui.views;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.xtext.ui.InjectableAdapterFactory;

import com.google.inject.Inject;

public class ContentProvider extends AdapterFactoryContentProvider {

	@Inject
	public ContentProvider(InjectableAdapterFactory adapterFactory) {
		super(adapterFactory);
	}

}
