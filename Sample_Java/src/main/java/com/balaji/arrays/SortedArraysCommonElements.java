package com.balaji.arrays;

import java.util.ArrayList;
import java.util.List;

public class SortedArraysCommonElements {

	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5,6};
		int[] b={5,6,7,8,9};
		
		List<Integer> common = common(a, b);
		for(int i : common){
			System.out.print(i+",");
		}
	}

	public static List<Integer> common (int[] a, int[] b){
		
		int i = a.length - 1;
		int j = b.length - 1;
		
		List<Integer> res = new ArrayList<>();
		
		while(i>=0 && j>=0){
			
			if(a[i] == b[j]){
				res.add(a[i]);
				i--; j--;
			}
			else if(a[i] < b[j]){
				j--;
			}
			else if(a[i] > b[j]){
				i--;
			}
		}
		
		
		return res;
	}
}
