package com.balaji.astrings;

public class WordWrap {

	public static void main(String[] args) {

		System.out.println(wordWrap("aaa bb cc ddddd  ", 5));
	}
	
	public static String wordWrap (String s, int w) {
		StringBuilder sb = new StringBuilder(s);
		int lastSpace = -1;
		int start = 0;
		int i = 0;
		while (i < sb.length()) {
			if(s.charAt(i) == ' ') lastSpace = i;
			if(s.charAt(i) == '\n') {
				start = i + 1;
				lastSpace = -1;
			}
			if(i > (start + w - 1)) {
				if(lastSpace != -1) {
					sb.setCharAt(lastSpace, '\n');
					start = lastSpace + 1;
					lastSpace = -1;
				}
				else {
					sb.insert(i, '\n');
					start = i + 1;
				}
			}
			i++;
		}
		
		return sb.toString();
	}
}
