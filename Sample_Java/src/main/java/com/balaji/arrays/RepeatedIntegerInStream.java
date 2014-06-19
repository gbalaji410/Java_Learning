package com.balaji.arrays;

import java.util.BitSet;

public class RepeatedIntegerInStream {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,7,8,9,10};
		System.out.println(repeatedNumber(a));
		System.out.println(repeatedNumberOtherWay(a, 10));

	}
	
	public static int repeatedNumber (int[] a) {
		if(a.length <= 1)
			return -1;
		int len = a.length;
		BitSet bs = new BitSet();
		
		//boolean[] arr = new boolean[a[len - 1] + 1];
		
		for(int i = 0; i< len; i++){
			if(bs.get(a[i])) {
				return a[i];
			}
			else {
				bs.set(a[i]);
			}
		}
		
		return -1;
	}

	public static int repeatedNumberOtherWay (int[] a, int n) {
		if(a.length <= 1)
			return -1;
		
		int sum = 0;
		for(int i:a){
			sum += i;
		}
		
		int expectedSum = n * (n + 1)/2;
		return sum - expectedSum;
	}
}
