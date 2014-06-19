package com.balaji.arrays;

public class MaximumSumSubArray {
	
	
	//KADANE Algorithm O(n) linear time solution
	
	public static void main(String[] args) {

	   	int[] intArr={2, 3, -8, -1, 2, 4, -2, 3};
        findMaxSubArray(intArr);
	}
	
	public static void findMaxSubArray(int[] a){
		int maxsofar = a[0];
		int maxSum = a[0];
		for(int i = 1; i< a.length ; i++){
			maxSum = Math.max(a[i], (maxSum + a[i]));
			maxsofar = Math.max(maxsofar, maxSum);
			
		}
		System.out.println(maxsofar);
	}
}
