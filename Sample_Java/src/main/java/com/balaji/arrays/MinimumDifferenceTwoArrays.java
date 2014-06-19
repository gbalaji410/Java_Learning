package com.balaji.arrays;

public class MinimumDifferenceTwoArrays {

	public static void main(String[] args) {
		int[] a = {1,2,5,7,9,23,126};
		int[] b = {20,25,29,35};
		minDiff(a, b);
	}
	
	public static void minDiff (int[] a, int[] b){
		int min = Integer.MAX_VALUE;
		
		int i = 0; int j = 0;
		while (i < a.length && j < b.length){
			if(a[i] < b[j]){
				min = Math.min(min, (b[j] - a[i]));
				i++;
			}
			else {
				min = Math.min(min, (a[i] - b[j]));
				j++;
			}
		}
		System.out.println(min);
	}

}
