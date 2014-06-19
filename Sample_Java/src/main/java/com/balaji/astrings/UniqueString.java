package com.balaji.astrings;

import java.io.UnsupportedEncodingException;

/**
 * Assumption - All characters are assumed to be ASCII 0 - 255 (1 byte)
 * This will not work for Unicode characters.
 * 
 * */
public class UniqueString {
	public static void main (String[] args) throws UnsupportedEncodingException{
		String s = "gates";
		byte[] bytes = s.getBytes("UTF-16");
		System.out.println("String:" + new String(bytes, "UTF-16"));
		System.out.println("Input String " + s + " is unique: " + isUnique(s));
	}
	
	static boolean isUnique (String s){
		
		if(s.length()>256)
			return false;
		
		boolean[] arr = new boolean[256];
		
		for(char a :s.toCharArray()){
			int intVal = a;
			System.out.println(a + ":" + intVal);
			if(arr[intVal]){
				return false;
			}
			arr[intVal] = true;
		}
		
		return true;
	}
}
