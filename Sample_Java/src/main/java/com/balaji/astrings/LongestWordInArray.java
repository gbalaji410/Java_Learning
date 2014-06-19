package com.balaji.astrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestWordInArray {
	
	private static Map<String, List<String>> inputMap = new HashMap<>();
	
	public static void main(String[] args) {
		
		
		String wrds[] = {"abc" , "baa" , "caan" , "an" , "banc"};
		char chars[] = {'a' , 'a' , 'n' , 'c' , 'b'};
		
		//String wrds[] = {"aat", "at" , "ta"};
		//char chars[] = {'a' , 't'};
		
		process(wrds);

		Set<String> longest = longest(wrds, chars);
		
		for(String s : longest){
			System.out.println(s);
		}

	}
	
	public static Set<String> longest (String[] s, char[] c) {
		String check = new String(c);
		int len = check.length();
		
		Set<String> ret = new HashSet<>();
		while (len > 0) {
			String sub = check.substring(0, len--);
			if(inputMap.containsKey(sortStr(sub))) {
				ret.addAll(inputMap.get(sortStr(sub)));
			}
		}
		
		int c1 = 0;
		len = check.length();
		
		while (c1 < len) {
			String sub = check.substring(c1++, len);
			if(inputMap.containsKey(sortStr(sub))) {
				ret.addAll(inputMap.get(sortStr(sub)));
			}
		} 
		
		return ret;
		
	}
	
	private static Map<String, List<String>> process (String[] s) {
		
		for(String in : s) {
			String sort = sortStr(in);
			List<String> list = inputMap.get(sort);
			if(list == null) {
				list = new ArrayList<String>();
			}
			list.add(in);
			inputMap.put(sort, list);
		}
		return inputMap;
	}
	
	private static String sortStr (String in){
		char[] c = in.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
}
