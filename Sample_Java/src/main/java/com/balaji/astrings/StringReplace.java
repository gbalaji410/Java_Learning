package com.balaji.astrings;

import java.util.Arrays;


public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace("This is a test string for aeiou.", "a"));
	}
	
	static String replace (String input, String remove){
		
		
		Arrays.sort(input.toCharArray());
		
		char[] in = new char[input.length()];
		char[] r = remove.toCharArray();
		
		boolean[] b = new boolean[128];
		
		for(char c : r){
			b[c] = true;
		}
		
		if(remove.length() <= 0)
			return input;
		
		int rem = 0;
		for(int i = 0; i<input.length();i++){
			if(!b[input.charAt(i)]){
				in[rem] = input.charAt(i);
				rem++;
			}
		}
		return String.valueOf(in);
	}
}
