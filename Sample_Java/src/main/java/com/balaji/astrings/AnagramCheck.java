package com.balaji.astrings;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		System.out.println(anagrams("abcdeq", "dcbaeq"));
		System.out.println(anagramCheck("abcdeq", "dcbaeq"));

	}

	static public boolean anagrams (String a, String b) {
		if(a == null && b == null)
			return true;
		if(a.length()!=b.length())
			return false;
		
		if(sort(a).equalsIgnoreCase(sort(b))) {
			return true;
		}
		return false;
	}
	
	private static String sort (String in) {
		char[] c = in.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	static public boolean anagramCheck (String a, String b) {
		if(a == null && b == null)
			return true;
		if(a.length()!=b.length())
			return false;
		
		int[] c = new int[256];
		
		for(int i=0;i<a.length();i++){
			c[a.charAt(i)]++;
		}
		
		for(int i=0;i<b.length();i++){
			if(--c[b.charAt(i)] < 0)
				return false;
		}
		return true;
	}
}
