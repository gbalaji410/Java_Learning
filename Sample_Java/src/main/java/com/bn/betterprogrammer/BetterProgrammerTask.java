package com.bn.betterprogrammer;


public class BetterProgrammerTask {
    
	public static void main (String[] args) {
		System.out.println(isPalindrome("abcddcba"));
	}
	
    public static boolean isPalindrome(String s) {
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
    	int len = s.length() - 1;
    	char[] c = s.toCharArray();
    	int i = 0;
    	while (i <= len) {
    		if(c[i++] != c[len--]) {
    			return false;
    		}
    	}
    	return true;
    }
}

