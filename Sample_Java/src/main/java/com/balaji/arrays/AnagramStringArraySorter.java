package com.balaji.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class AnagramStringArraySorter {

	public static void main(String[] args) {
		String[] in = {"ball","cat","act","tie","tac"};
		System.out.print(Arrays.toString(sorter(in)));
	}
	
	public static String[] sorter(String[] in){
		String[] arr = new String[in.length];
		int count = 0;
		Map<String, ArrayList<String>> m = new TreeMap<>();
		
		for(String s : in){
			String s1 = sortStr(s);
			if(!m.containsKey(s1)) {
				m.put(s1, new ArrayList<String>());
			}
			ArrayList<String> a = m.get(s1);
			a.add(s);
		}
		
		for (String key : m.keySet()) {
			ArrayList<String> l = m.get(key);
			for(String s : l){
				arr[count++] = s;
			}
		}
		
		return arr;
		
	}
	
	public static String sortStr (String in){
		char[] c = in.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
}
