package com.balaji.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main (String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		a = reverse(a);
		System.out.println(Arrays.toString(a));
	}

	public static int[] reverse(int[] a)
	{
	    int l = a.length;
	    for (int j = 0; j < l / 2; j++)
	    {
	        int temp = a[j];
	        a[j] = a[l - j - 1];
	        a[l - j - 1] = temp;
	    }
	    
	    return a;
	}
	
}
