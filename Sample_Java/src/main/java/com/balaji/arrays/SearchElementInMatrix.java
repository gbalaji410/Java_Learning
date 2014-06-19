package com.balaji.arrays;

public class SearchElementInMatrix {

	public static void main(String[] args) {
		
		int mat[][] = { 
				{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
              };
		boolean found = search(mat, 4, 32);
		System.out.println(found);
	}

	private static boolean search(int[][] mat, int n, int x) {
		
		int i = 0; int j = n - 1;
		
		while (i < n && j >= 0){
			if(mat[i][j] == x)
				return true;
			else if(mat[i][j] < x)
				i++;
			else
				j--;
		}
		
		return false;
	}

}
