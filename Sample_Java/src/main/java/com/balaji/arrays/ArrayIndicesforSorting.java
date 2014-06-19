package com.balaji.arrays;

public class ArrayIndicesforSorting {

	public static void main(String[] args) {
		
		int[] a = {1,2,4,7,10,11, 7,12, 6,7,16,18,19};
		int[] idx = arrayIndex(a);
		//Output should be 3 & 10 (0-2 is sorted already and 16 is the start of max)
		for(int i : idx){
			System.out.println(i);
		}
	}
	
	private static int startOfRight(int[] a){
		for(int i = a.length-2; i>=0 ;i--){
			if(a[i] > a[i+1])
				return i + 1;
		}
		return 0;
	}
	private static int endOfLeft(int[] a){
		for(int i = 1;i<a.length;i++){
			if(a[i] < a[i-1])
				return i - 1;
		}
		return a.length - 1;
	}
	public static int[] arrayIndex (int[] a) {
		
		int[] index = new int[2];		
		
		int m = endOfLeft(a); int n = startOfRight(a);
		
		int minIndex = m + 1; int maxIndex = n - 1;
		
		for(int k = m + 1; k<n;k++){
			if(a[k] < a[minIndex]) minIndex = k;
			if(a[k] > a[maxIndex]) maxIndex = k;

		}
		
		while(a[m] > a[minIndex]){
			m--;
		}
		
		while(a[n] < a[maxIndex]){
			n++;
		}
		
		index[0] = m + 1;
		index[1] = n - 1;

		return index;
	}
}
