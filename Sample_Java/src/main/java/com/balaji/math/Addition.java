package com.balaji.math;

public class Addition {

	public static void main(String[] args) {
		int a = 759;
		int b = 674;
		
		System.out.println(a+b);
		
		System.out.println(sum(a,b));

		
	}
	
	private static int sum(int a, int b){
		return a ^ b;
	}
}
