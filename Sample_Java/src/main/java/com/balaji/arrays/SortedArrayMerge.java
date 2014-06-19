package com.balaji.arrays;

import java.util.Arrays;

public class SortedArrayMerge {

	public static void main(String[] args) {
		int[] a = new int[41];
		int[] b = new int[18];
		
		for(int i = 0;i<23;i++){
			a[i] = i;
		}
		
		for(int i = 0;i<18;i++){
			b[i] = i;
		}
		
		merge(a, b, 23, 18);
		System.out.print(Arrays.toString(a));
	}
	
	public static void merge (int[] a, int[] b, int lastA, int lastB){
		
		int l1 = lastA - 1;
		int l2 = lastB - 1;
		
		int max = lastA + lastB - 1;
		while (l1 >= 0 && l2 >= 0) {
			if(a[l1] > b[l2]) {
				a[max] = a[l1];
				max--; l1--;
			}
			else {
				a[max] = a[l2];
				max--; l2--;
			}
		}
		
		while(l2 >= 0){
			a[max] = b[l2];
			max--; l2--;
		}
//		int i = 0;int j = 0; int k = 0;
//		
//		while(i<a.length && j<b.length){
//			if(a[i] < b[j]){
//				c[k] = a[i];
//				i++;
//			}
//			else{
//				c[k] = a[j];
//				j++;
//			}
//			k++;
//		}
//		
//		while(i<a.length){
//			c[k] = a[i];
//			i++;
//			k++;
//		}
//		while(j<b.length){
//			c[k] = b[j];
//			j++;
//			k++;
//		}
//		
	}
}
