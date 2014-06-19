package com.balaji.arrays;


public class TwoMissingNumbersInArray {

	public static void main(String[] args) {
		int[] a = {1,3,4,5,6,7,8,10};
		missingNumbers(a, 10);
	}
	
	public static void missingNumbers (int[] a, int n) {
		int xsum = n * (n+1)/2;
		int xsqsum = n * (n+1) * (2*n+1)/6;
		
		int asum = 0;
		int asqsum = 0;
		
		for(int x:a) {
			asum += x;
			asqsum += (x*x);
		}
		
		int xplusy = xsum - asum;
		int sqDiff = xsqsum - asqsum;		
		int twoxy = (xplusy * xplusy) - sqDiff;
		int xminusy =  (int)Math.sqrt(sqDiff - twoxy);
		
		int x = (xplusy + xminusy)/2;
		int y = (xplusy - xminusy)/2;
		
		System.out.println(x);
		System.out.println(y);

	}
}
