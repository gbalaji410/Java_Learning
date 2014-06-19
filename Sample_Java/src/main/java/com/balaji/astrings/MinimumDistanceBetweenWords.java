package com.balaji.astrings;

public class MinimumDistanceBetweenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minDistance("hello how are you", "hello", "you"));
		System.out.println(minDistance("hello how are hello you", "hello", "you"));
		System.out.println(minDistance("you are hello", "hello", "you"));
		System.out.println(minDistance("hello how are hello", "hello", "you"));
	}
	
	/**
	 * 
	 * For  e.g 1. "hello how are you" - distance between "hello" and "you" is 3. 
			e.g 2. "hello how are hello you" - distance is 1 
			e.g 3. "you are hello" - distance is -1. Order of "hello" and "you" should be preserved. 
			e.g 4. "hello how are hello" - distance is -1 since "you" didnt occur even once.
	 * */
	public static int minDistance (String sentence, String word1, String word2){
		
		if(!sentence.contains(word1) || !sentence.contains(word2))
			return -1;
		
		String[] arr = sentence.split("\\s");
		boolean found1 = false; 		
		boolean found2 = false;

		int dist = 0;
		for(String s : arr){
			
			if(s.equalsIgnoreCase(word1)){
				found1 = true;
				dist = 0;
			}
			
			if(found1){
				dist++;
			}
			
			if(s.equalsIgnoreCase(word2)){
				found2 = true;
				if(!found1) {
					dist = -1;
				}
			}
			
			if(found1 && found2) {
				return dist - 1;
			}
		}
		
		return -1;
	}
}
