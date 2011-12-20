package de.sebastianbenz.task.util;

import java.util.List;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.internal.matchers.TypeSafeMatcher;

@SuppressWarnings("restriction")
public class ContentTypesMatcher extends
			TypeSafeMatcher<List<?>> {
		private final Class<?>[] types;

		public ContentTypesMatcher(Class<?>[] types) {
			this.types = types;
		}

		public void describeTo(Description description) {
			description.appendValueList("", ", ", "", types);
		}

		@Override
		public boolean matchesSafely(List<?> item) {
			int i = 0;
			for (Class<?> expectedType : types) {
				if(!expectedType.isInstance(item.get(i))){
					return false;
				}
				i++;
			}
			Assert.assertEquals(types.length, item.size());
			return true;
		}

		public static Matcher<List<?>> are(final Class<?>... types) {
			return new ContentTypesMatcher(types);
		}
	}