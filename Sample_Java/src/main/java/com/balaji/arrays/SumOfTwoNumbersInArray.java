package com.balaji.arrays;

import java.util.Arrays;

public class SumOfTwoNumbersInArray {
	
	public static void main (String[] args) {
		
		int[] a =  {9,1,23,34,22,2,6,-1,32,8,5,3,12,17,7,43,14,-2,15,63,-50, 60};		
		int sum = 73;
		
		Arrays.sort(a); //O(n log n) for sorting.
		
		System.out.println(Arrays.toString(sumOfThree(a, sum))); // O(n * n) for the search
		
		System.out.println(Arrays.toString(sumOfTwoNumbers(a, sum))); // O(n) for the search

	}
	
	public static int[] sumOfTwoNumbers (int[] a, int sum) {
		int j = a.length - 1;
		int i = 0;
		
		int[] res = new int[2];
		
		while(i<j) {
			int s = a[i] + a[j];
			if(s == sum) {
				//System.out.println(a[i] + "," + a[j]);
				res[0] = a[i];
				res[1] = a[j];
				return res;
				//i++;j--;
			}
			else {
				if(s > sum) 
					j--;
				else 
					i++;
			}
		}
		
		return null;
	}
	
	public static int[] sumOfThree (int[] a, int sum) {
		int[] res = new int[3];
		
		for (int i = 0; i<a.length; i++) {
			int sumOfTwo = sum - a[i];
			int[] tmp = sumOfTwoNumbers(a, sumOfTwo);
			if(tmp!= null && tmp.length > 1) {
				res[0] = a[i];
				res[1] = tmp[0];
				res[2] = tmp[1];
				return res;
			}
		}
		return res;

	}
}
