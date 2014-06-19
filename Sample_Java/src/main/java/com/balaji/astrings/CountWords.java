package com.balaji.astrings;

public class CountWords {

	public static void main(String[] args) {
		System.out.println(countWords("country             is"));
	}

	public static int countWords(String input) {
	    
	    if(input == null || input.trim().length() == 0) {
	        return 0;
	    }
	    
		input = input.trim();

	    int count = 1;
	    
	    char[] a = input.toCharArray();
	    
	    boolean foundSpace = false;
	    
	    for(int i=0; i<input.length();i++) {
	        
	        int x = a[i];
	        
	        if(x >= 97 && x<=122){
	           foundSpace = false;
	           continue;
	        }
	        else if(x == 32) {
	            if(!foundSpace){
	                count++;
	            }
	           foundSpace = true;
	        }
	        
	    } 
	    
	    //String[] arr = input.split("//s");
	    
	    return count;
	    
	}
}
