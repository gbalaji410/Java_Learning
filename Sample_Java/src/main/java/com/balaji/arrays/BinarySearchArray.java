package com.balaji.arrays;

import java.util.Arrays;

public class BinarySearchArray {

	public static void main(String[] args) {
		int[] arr = {12,7,3,4,88,9,0,-2,31,45,65,7,9,11,54,9,8,7,6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(index(arr, 54));
	}
	
	public static int index (int[] arr, int a){
		
		int index = -1;
		int low = 0; int high = arr.length - 1;
		while (low <= high){
			int mid = low + (high - low)/2;
			if(arr[mid] == a)
				return mid;
			else if (arr[mid] > a){
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}		
		return index;
	}
}
