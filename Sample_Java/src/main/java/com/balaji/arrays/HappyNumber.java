package com.balaji.arrays;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappyNumber(129));
	}
	
	private static boolean isHappyNumber (long n) {
		long sum = 0;
		
		HashSet<Long> set = new HashSet<>();
		
		while(n > 1 && set.add(n)) {
			while (n > 0) {
				long x = n%10;
				sum += x * x;
				n = n/10;
			}
			n = sum;
			sum = 0;
		}
		
		return n == 1;
	}
}
