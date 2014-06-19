package com.balaji.astrings;

public class SubstringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubstring("MainString","Main"));
	}

	private static boolean isSubstring(String s1, String s2) {
		
		if(s1 == null || s1 == null){
			return false;
		}
		
		if(s1.length() == 0 || s2.length() > s1.length()) return false;
		
		int j = 0;
		
		for(int i = 0; i<s1.length();i++){
			if(s1.charAt(i) == s2.charAt(j)) {
				j++;
			}
		}
		
		return false;
	}

}
