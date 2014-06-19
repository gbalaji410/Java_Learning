package com.balaji.arrays;

import java.util.Arrays;

public class SumOfPairsInArray {
	
	public static void main (String[] args) {
		
		int[] a =  {9,1,23,34,22,2,6,-1,32,8,5,3,12,17,7,43,14,-2,15,63,-50, 60};		
		int sum = 10;
		
		Arrays.sort(a); //O(n log n) for sorting.			
		sumOfTwoNumbers(a, sum); // O(n) for the search

	}
	
	public static void sumOfTwoNumbers (int[] a, int sum) {
		
		int i = 0;
		int j = a.length - 1;
		
		while(i<j){
			int s = a[i] + a[j];
			if(s == sum) {
				System.out.println(a[i] + "," + a[j]);
				i++;j--;
			}
			else {
				if(s > sum) 
					j--;
				else 
					i++;
			}
		}
		
	}

}
