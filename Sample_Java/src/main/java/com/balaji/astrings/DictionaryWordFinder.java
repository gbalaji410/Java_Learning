package com.balaji.astrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DictionaryWordFinder {

	public static void main(String[] args) {
		
		String[] dic = {"abacus", "deltoid","gaff","giraffe","microphone","reef","qar","raq","giraffeq"};
		
		char[] c = {'a', 'e', 'f', 'f', 'g', 'i', 'r', 'q'};
		
		Map<String, List<String>> map = preProcess(dic);
		
		String sign = getStringSignature(c);
		System.out.println(getStringSignature(c));
		
		List<String> words = new ArrayList<>();
		for (String key : map.keySet()){
			String s = Long.toBinaryString(Long.parseLong(key,2) & ~Long.parseLong(sign,2));
			long l = Long.parseLong(s,2);
			if(l == 0) {
				words.addAll(map.get(key));
			}
		}
		System.out.println(words.size());
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		
		String sortedInput = sort(new String(c));

		for(String word : words){
			String q1 = RemoveCharsFromString.removeChars(sortedInput, word);
			m.put(q1.trim().length(), word);			
		}
		
		System.out.println(m.firstEntry().getValue());
		
	}
	
	
	public static Map<String, List<String>> preProcess (String[] dic){
		Map<String, List<String>> map = new HashMap<>();
		
		for(String s : dic){
			String key = getStringSignature(s.toLowerCase().toCharArray());
			List<String> ls = map.get(key);
			if(ls == null) {
				 ls = new ArrayList<>();
			}
			ls.add(s);
			map.put(key, ls);
			
		}
		
		return map;
	}

	public static String getStringSignature (char[] c) {
		int[] a = new int[26];
		for(char ch : c){
			int x = ch - 'a';
			a[x] = 1;
		}
		String key = Arrays.toString(a).replaceAll("[^0-9]", "");
		return key;
	}
	
	public static String sort (String in) { 
		char[] c = in.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
}
