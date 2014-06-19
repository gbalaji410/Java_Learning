package com.balaji.astrings;


public class StringReverse {
	
	public static void main (String[] args){
		
		String input = "Do or do not, there is no try.";
		
		String output = "try. no is there not, do or Do";
		
		System.out.println(reverse(input).equalsIgnoreCase(output));
		//		System.out.println("Before reversal: " + input);
//		
//		System.out.println("After reversal: " + new StringBuilder(input).reverse());
//		
//		System.out.println("After reversal: " + reverse(input));
		

	}
	
	private static String reverse (String input){
		
		StringBuilder s =  new StringBuilder();
		
		//String[] split = input.split("\\s");
		
		char[] c = input.toCharArray();
		int st = input.length();
		int end = st;
		
		for(int i = input.length()-1 ; i>=0; i--) {
			if(c[i] == 32) {
				s.append(input.substring(end, st)).append(' ');
				st = i;
				end = st;
			}
			else {
				end = i;
			}
			
			//String in = split[i];
			//.append(in.replaceAll("[^a-zA-Z0-9]", "")).append(" ");
		}
		s.append(input.substring(end, st));
		System.out.println(s.toString().trim());
		return s.toString().trim();
	}
}