package com.balaji.astrings;

public class StringRev {
	
	public static void main (String[] args){
		System.out.println(reverse("0123456789"));
	}

	static String reverse (String in) {
		
		for(int i=0;i<in.length();i++){
			in = in.substring(1, in.length() - i) + in.substring(0, 1) + in.substring(in.length() - i, in.length());
		}
		return in;
	}
}
