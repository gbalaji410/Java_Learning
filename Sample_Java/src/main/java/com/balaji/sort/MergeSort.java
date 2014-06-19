package com.balaji.sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	static int[] r = new int[100];
	static int[] c = new int[100];

	public static void main(String[] args) {
		
		Random rand = new Random();
		for (int i=0;i<100;i++){
			r[i] = rand.nextInt(100);
		}
		int high = r.length - 1;
		System.out.println(Arrays.toString(r));
		mergeSort(0, high);
		System.out.println(Arrays.toString(r));
}

	static void mergeSort (int low, int high){

		if(low<high){
			int mid = low + (high - low)/2;
			mergeSort(low, mid);
			mergeSort(mid+1, high);
			merge(low, mid, high);
		}
		
	}
	
	public static void merge (int low, int mid, int high){
		
		int i = low;
		int j = mid + 1; 
		int k = low;
		
		for(int n = low; n<= high ; n++){
			c[n] = r[n];
		}
		
		while(i<=mid && j<=high){
			if(c[i] < c[j]){
				r[k++] = c[i++];
			}
			else{
				r[k++] = c[j++];
			}
		}
		
		while(i <= mid){
			r[k++] = c[i++];
		}			
	}
}
