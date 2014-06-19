package com.balaji.sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	
	static int[] a = new int[100];
	public static void main(String[] args) {
		Random r = new Random();
		for(int i=0;i<100;i++){
			a[i] = r.nextInt(1000);
		}
		
		System.out.println(Arrays.toString(a));

		quickSort(0, a.length-1);
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void quickSort (int low, int high){
		
		int i = low;
		int j = high;
		
		int pivot = a[low + (high - low)/2];
		
		while(i <= j){
			while(a[i]<pivot)
				i++;
			while(a[j]>pivot)
				j--;
			if(i <= j){
				swap(i,j);
				i++;
				j--;
			}
		}
		if(low<j)
			quickSort(low,j);
		if(i<high)
			quickSort(i, high);
			
	}
	
	static void swap(int i, int j){
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
}
