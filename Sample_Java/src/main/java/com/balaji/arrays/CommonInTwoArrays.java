package com.balaji.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class CommonInTwoArrays {

	public static void main(String[] args) {
		int[] a = {71,2,6,8,12,4};		
		int[] b = {11,21,16,8,112,41,2,6,4};
		
		Integer[] common = common(a, b);
		
		System.out.println(Arrays.toString(common));
	}
	
	public static Integer[] common (int[] a, int[] b) {
		
		BitSet bs = new BitSet(a.length);
		List<Integer> comm = new ArrayList<>();

		for(int i = 0;i< a.length ;i++) {
			bs.set(a[i]);
		}
		
		for(int i = 0;i< b.length ;i++) {
			if(bs.get(b[i])){
				comm.add(b[i]);
			}
		}
		
		return comm.toArray(new Integer[comm.size()]);
	}
}
