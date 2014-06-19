package com.balaji.astrings;

public class SubstituteSpace {

	public static void main (String[] args){
		String s = "Mr. Balaji Ganesan          ";
		System.out.println(replace(s));
	}
	
	public static String replace (String in){
		int len = in.length();
		char[] arr = new char[len];
		in = in.trim();
		for(int i = in.length()-1;i>=0;i--){
			int c = in.charAt(i);
			if(c==32){
				arr[--len] = '0';
				arr[--len] = '2';
				arr[--len] = '%';
			}
			else{
				arr[--len] = in.charAt(i);
			}
		}
		return String.valueOf(arr);
	} 
}
