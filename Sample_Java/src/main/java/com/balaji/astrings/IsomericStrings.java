package com.balaji.astrings;

import java.util.HashMap;
import java.util.Map;

public class IsomericStrings {

	public static void main(String[] args) {
		System.out.println(isomeric("turtle", "tletur"));
	}
	
	public static boolean isomeric (String a, String b) {
		
		if(a.length() != b.length())
			return false;
		
		char c[] = a.toCharArray();
		char[] d = b.toCharArray();
		
		Map<Character, Character> map = new HashMap<>();
		Map<Character, Character> map1 = new HashMap<>();

		for(int i=0;i<a.length();i++) {
			if(map.containsKey(c[i])) {
				if(map.get(c[i]) != d[i])
					return false;
			}
			if(map1.containsKey(d[i])) {
				if(map1.get(d[i]) != c[i])
					return false;
			}
			map.put(c[i], d[i]);
			map1.put(d[i], c[i]);
			
		}
		return true;
	}
}
