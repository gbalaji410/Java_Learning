package com.balaji.astrings;

public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindromeString("99123332199"));
	}

	private static String longestPalindromeString(String s) {
		if(s == null)
			return "";
		if(s.length() == 1)
			return s;
		
		String longest = s.substring(0, 1);
		
		for(int i = 0; i < s.length(); i++){
			String tmp = helper(s, i, i);
			if(tmp.length() > longest.length()) {
				longest = tmp;
			}
			//Even Conditions
			tmp = helper(s, i, i + 1);
			if(tmp.length() > longest.length()) {
				longest = tmp;
			}
		}
		
		return longest;
	}
	
	private static String helper(String s, int i, int j){
		while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
			i--;
			j++;
		}
		return s.substring(i + 1, j);
	}
}
