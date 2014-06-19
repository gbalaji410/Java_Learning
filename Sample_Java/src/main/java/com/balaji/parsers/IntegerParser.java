package com.balaji.parsers;

public class IntegerParser {

	public static void main(String[] args) {
		System.out.println(isNumber("-0.98"));
		System.out.println(parseInt("112"));

	}
	
	/*
	 * Returns true if the input string is a number and false otherwise
	 */
	 
	public static boolean isNumber(String toTest)
	{
	    String pattern = "(-?\\d+)|(-?\\d+\\.\\d+)";
	    return toTest.matches(pattern);
		//return true;
	}
	
	public static double parseInt (String s) throws NumberFormatException {
		
		boolean neg = false;
		Double d = new Double(0);

		if(s.startsWith("-")){
			neg = true;
			s = s.substring(1);
		}
		int len = s.length();

		long result = 0;
		for(int i=0;i<len;i++) {
			int c =  s.charAt(i);
			if((c < 48 || c > 57) && c!=46) 
				throw new NumberFormatException("Invalid Number");
			int test = (c - '0');
			result = result * 10;
			result = result + test;
		}
		if(neg){
			return -result;
		}
		return result;
	}
}
