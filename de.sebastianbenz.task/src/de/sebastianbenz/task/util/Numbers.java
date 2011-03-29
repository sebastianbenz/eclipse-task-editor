package de.sebastianbenz.task.util;

import static java.lang.Character.digit;

public class Numbers {

	public static Number parse(String string) {
		StringBuilder b = new StringBuilder();
		
		boolean isDouble = false;
		char first = string.charAt(0);
		
		if(first == '-' || digit(first, 10) > -1){
			b.append(first);
		}else {
			throw new NumberFormatException("IllegalCharacter: " + first);
		}
		
		for(int i = 1; i < string.length(); i++){
			char c = string.charAt(i);
			int d = Character.digit(c, 10);
			if(d > -1){
				b.append(d);
			}else if(isSeparator(c) && !isDouble && nextIsDigit(string, i+1)){
				isDouble = true;
				b.append('.');
			}else{
				break;
			}
		}
		if(isDouble){
			 return Double.valueOf(b.toString());
		}else{
			return Long.valueOf(b.toString());
		}
	}

	private static boolean nextIsDigit(String s, int i) {
		if(s.length() <= i){
			return false;
		}
		return digit(s.charAt(i), 10) > -1;
	}

	protected static boolean isSeparator(int d) {
		return d == '.' || d == ',';
	}

	public static boolean lessEqual(Number left, Number right) {
		if(left instanceof Double || right instanceof Double){
			return left.doubleValue() <= right.doubleValue();
		}else{
			return left.longValue() <= right.longValue();
		}
	}

	public static  boolean less(Number left, Number right) {
		if(left instanceof Double || right instanceof Double){
			return left.doubleValue() < right.doubleValue();
		}else{
			return left.longValue() < right.longValue();
		}
	}

	public static  boolean greaterEqual(Number left, Number right) {
		if(left instanceof Double || right instanceof Double){
			return left.doubleValue() >= right.doubleValue();
		}else{
			return left.longValue() >= right.longValue();
		}
	}

	public static boolean greater(Number left, Number right) {
		if(left instanceof Double || right instanceof Double){
			return left.doubleValue() > right.doubleValue();
		}else{
			return left.longValue() > right.longValue();
		}
	}

}
