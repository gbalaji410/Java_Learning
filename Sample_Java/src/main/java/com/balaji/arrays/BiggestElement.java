package com.balaji.arrays;

import com.balaji.heap.MaxHeap;


public class BiggestElement {

	public static void main(String[] args) {

		int[] arr = {1,45,7,9,3,49,2,9,87};
		System.out.println(big(arr, 3));
	}
	
	public static int big (int[] arr, int n){
		if(arr == null || arr.length == 0 || n > arr.length){
			return -1;
		}
		
		MaxHeap m = new MaxHeap();
		for(int i=0;i<arr.length;i++){
			m.put(arr[i]);
		}
		
		int ret = 0;

		for(int i = 1;i<= n;i++){
			ret = m.get();
		}
		return ret;
	}
}
