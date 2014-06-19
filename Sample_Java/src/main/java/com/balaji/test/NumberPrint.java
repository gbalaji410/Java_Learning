package com.balaji.test;

import java.util.Random;


public class NumberPrint {
	
	static final String[] tens = {"","ten","twenty","thirty","forty","fifty",
			"sixty", "seventy","eighty","ninety"};
	
	static final String[] ones = {"","one","two","three","four","five",
			"six", "seven","eight","nine", "ten",
			"eleven","twelve","thirteen","fourteen","fifteen"
			,"sixteen","seventeen","eighteen","nineteen"};
	
	public static void main(String[] args) {

		Random r = new Random();
		int nextInt = r.nextInt(10000);
		System.out.println("Number: " + nextInt + " Text: " + textForNum(nextInt));
		
	}

	private static String textForNum (int n){
		
		StringBuilder sb = new StringBuilder();
		
		if(n < 0){
			return "Invalid Number";
		}
		if(n==0){
			return "Zero";
		}
		if(n>Integer.MAX_VALUE){
			return "Maximum Integer Value reached";
		}
		
		if(n<20){
			return ones[n];
		}
		else if (n<100){
			return hundred(n);
		}
		else if (n<1000){
			return thousand(n);
		}
		else {
			return greaterThanthousand(n);
		}
		
	}
	
	private static String hundred (int n){
		StringBuilder sb = new StringBuilder();
		int one = n%10;
		int ten = n/10;
		sb.append(tens[ten]).append(" ").append(ones[one]);
		return sb.toString();
	}
	
	private static String thousand (int n){
		StringBuilder sb = new StringBuilder();
		int h = n/100;
		if(h>0){
			sb.append(ones[h]).append(" hundred");
		}
		if(n%100>0){
			sb.append(" and ").append(hundred(n%100));
		}
		return sb.toString();
	}
	
	private static String greaterThanthousand (int n){
		StringBuilder sb = new StringBuilder();
		int t = n/1000;
		sb.append(ones[t]).append(" thousand ").append(thousand(n%1000));
		return sb.toString();
	}
}
