package com.balaji.astrings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//total - o
		//teeter - r
		System.out.println(firstNonRepeatedChar("tootaal"));
	}
	
	public static char firstNonRepeatedChar (String s) {
		char[] c = s.toCharArray();

		Map<Character, Integer> m = new LinkedHashMap<>(c.length, 1, false);
		for (int i=0;i<s.length();i++) {
			if(!m.containsKey(c[i])){
				m.put(c[i], 1);
			}
			else {
				m.put(c[i], 2);
			}
		}
		
		for (Character c1 : m.keySet()) {
			if(m.get(c1) == 1) {
				return c1;
			}
		}
		
		return '0';
	}

}
