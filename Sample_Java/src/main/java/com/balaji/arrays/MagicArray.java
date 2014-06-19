package com.balaji.arrays;

import java.util.Arrays;
import java.util.Random;

public class MagicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int[] a = {-40, -20, -1,1,2,3,4, 6,9,12,13};
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(magicIndex(a, 0, a.length-1));

	}
	
	public static int magicIndex (int[] a, int low, int high){
		
		int mid = low + (high - low)/2;
		
		if(low < high) {
			if(a[mid] == mid)
				return mid;
			if(a[mid] > mid)//Left Side
				return magicIndex(a, low, mid - 1);
			else //Right Side
				return magicIndex(a, mid + 1, high);
		}
		return -1;
		
	}

}
