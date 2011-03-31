package de.sebastianbenz.task.ui.contentassist;

public class SimplePrefixMatcher {

	public String apply(String text, int position, String proposal) {
		String s = "";
		String lastPrefix = "";
		for (int i = 0; i < proposal.length(); i++) {
			int index = position - 1 - i;
			if (index >= text.length() || index < 0) {
				return removePrefix(proposal, lastPrefix);
			}
			s = text.charAt(index) + s;
			if (proposal.startsWith(s)) {
				lastPrefix = s;
			}
		}
		return removePrefix(proposal, lastPrefix);
	}

	protected String removePrefix(String proposal, String lastPrefix) {
		return proposal.substring(lastPrefix.length());
	}

}
