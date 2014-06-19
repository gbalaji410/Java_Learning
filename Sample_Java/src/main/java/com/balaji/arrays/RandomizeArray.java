package com.balaji.arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomizeArray {
	
	
	public static void main (String[] args) {

		int[] arr = new int[10];
		for (int i=0; i<arr.length;i++){
			arr[i] = i + 1;
		}
		
		System.out.println("Before Randomize" + Arrays.toString(arr));
		
		randomize(arr);

		System.out.println("After Randomize" + Arrays.toString(arr));

	}
	
	private static int[] randomize (int [] a){
		
		int len = a.length;
		
		Random r = new Random();
		for (int i=0; i<a.length;i++){
			int randomInt = r.nextInt(len--);
			int temp = a[randomInt];
			a[randomInt] = a[i];
			a[i] = temp;
		}
		return a;
	}
}
