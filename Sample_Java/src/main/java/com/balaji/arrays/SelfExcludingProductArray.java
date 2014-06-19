package com.balaji.arrays;

import java.util.Arrays;

public class SelfExcludingProductArray {

	public static void main(String[] args) {
		int[] a = {3,1,4,2,0};
		System.out.println(Arrays.toString(selfExcludingProduct(a)));
	}
	
	/**
	 * Implement a method which takes an integer array and returns an integer array (of equal size) in
	 * which each element is the product of every number in the input array with the exception of the
	 * number at that index.
	 *
	 * Example:
	 *   [3, 1, 4, 2] => [8, 24, 6, 12]
	 */
	public static int[] selfExcludingProduct(int[] input) {
		
		if(input == null || input.length == 0)
			return null;
		
		int product = 1;
		int nonZeroProduct = 1;
		
		int[] prod = new int[input.length];
		
		for(int i : input) {
			if(i!=0) {
				nonZeroProduct*=i;
			}
			product*=i;
		}
		
		for(int i=0; i< input.length;i++) {
			if(input[i] == 0) {
				prod[i] = nonZeroProduct;
			}
			else {
				prod[i] = product/input[i];
			}
		}
		
		return prod;
	}
}
