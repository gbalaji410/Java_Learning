package com.balaji.arrays;

public class SmallestElementInCircularArray {

	public static void main(String[] args) {

		int[] a = {9,10,2,4,6,7,8,11,12,13,14,15};
		
		System.out.println(smallest(a, 0, a.length-1));
	}
	
	public static int smallest (int[] a, int min, int max){
		int p = min + (max - min)/2;
		int small = a[0];
		System.out.println("Small: " + small + " Pivot: " + a[p]);

		if(min < max){
			if(small<a[p]){
				//right side
				return smallest(a, p+1, max);
			}
			else {
				//left side
				return smallest(a, min, p);
			}
		}
		else {
			return Math.min(small, a[min]);
		}
	}
}
