package com.balaji.arrays;

public class MaximumContiguousProductArray {

	public static void main(String[] args) {
		int[] a = {1,-1,10,-8, -9, 0};
		System.out.println(max_product(a));

	}
	
	public static long max_product (int[] a){
		
		if(a == null)
			return 0;
		if(a.length == 1)
			return a[0];
		
		long ans = a[0];
		long pre_min = a[0];
		long pre_max = a[0];
		
		for(int elem : a){
			long new_min = pre_min * elem;
			
			long new_max = pre_max * elem;
			
			pre_min = Math.min(elem, Math.min(new_max, new_min));
			pre_max = Math.max(elem, Math.max(new_max, new_min));
			
			ans = Math.max(ans, pre_max);

		}
		
		return ans;
	}
}
