package com.balaji.astrings;

import java.util.HashSet;
import java.util.Set;

public class RemoveCharsFromString {

	public static void main(String[] args) {
		System.out.println(removeChars("Battle of the vowels: Hawaii vs. Grozny.", "aeiou"));
	}
	
	public static String removeChars (String in, String rem) {

		boolean[] arr = new boolean[128];
		
		for(char c : rem.toCharArray()) {
			arr[c] = true;
		}
		
		char[] c1 = in.toCharArray();
		
		for(int i=0;i<in.length();i++){
			char c = in.charAt(i);
			if(arr[c]) {
				c1[i] = 31;
			}
		}
		
		return new String(c1);
	}
}
