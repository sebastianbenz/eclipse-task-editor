package de.sebastianbenz.task.util;

import org.eclipse.xtext.util.Strings;

public class Strings2 extends Strings{

	public static String firstWord(String s) {
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c == ' ' || c == '\t' || c == '\r' || c == '\n'){
				return s.substring(0, i);
			}
		}
		return "";
	}
	
}
