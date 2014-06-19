package com.balaji.arrays;


public class StartEndIndexOfNumberInArray {

	public static void main(String[] args) {
	    int []a = {0,0,2,3,3,3,3,4,7,7,9,9,9,9,9};
				
		int[] res = index(a, 9);
		
		System.out.println("Low Index: " + res[0] + " High Index: " + res[1]);

	}
	
	public static int[] index (int[] arr, int a){
		
		int[] res = {-1, -1};
		int low = 0; int high = arr.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == a) {
				
				high = mid;
				while(--mid > 0 && a == arr[mid]) {
					res[0] = mid;
					
				}
				
				while(++high < arr.length && a == arr[high]){
					res[1] = high;
					
				}
				
				return res;
			}
			else if (arr[mid] > a){
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return res;
	}
}
