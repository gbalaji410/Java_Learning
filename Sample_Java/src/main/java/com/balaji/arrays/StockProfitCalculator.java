package com.balaji.arrays;

public class StockProfitCalculator {

	public static void main(String[] args) {
		int[] a = {15,25,10,30};		
		profit(a);
	}

	private static void profit(int[] a) {
		
		int len = a.length - 1;
		
		int min = 0; int buy = 0; int sell = 0;
		
		int maxDiff = 0;
		
		for(int i = 0; i <= len ; i++){
			if(a[i] < a[min]) {
				min = i;
			}
			
			int diff = a[i] - a[min];
			
			if(diff > maxDiff) {
				buy = min;
				sell = i;
				maxDiff = diff;
			}
			
		}

		System.out.println("Buy at: " + a[buy]);
		System.out.println("Sell at: " + a[sell]);

	}

}
