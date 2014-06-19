package com.balaji.astrings;

public class StringPool {

	public static void main(String[] args) {
		String a = new String("a" + "bc");
		
		String b = new String("ab" + "c");
		
		a.intern(); b.intern();
		
		System.out.println(a == b);
	}

}
