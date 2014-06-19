package com.balaji.search;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] a = new int[100];
		for(int i=0;i<100;i++){
			a[i] = r.nextInt(100);
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int search = search(a, 0, a.length, 15);
		
		System.out.println(search);
	}
	
	static int search (int[] a, int low, int high, int x){
				
		while (low <= high) {
			int mid = low + (high - low)/2;
			if(a[mid] < x) {
				low = mid + 1;
				//return search(a, mid + 1, high, x);
			}
			else if(a[mid] > x) {
				high = mid - 1;
				//return search(a, low, mid, x);
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}

}
