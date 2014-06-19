package com.balaji.arrays;

import java.util.ArrayList;
import java.util.List;

public class GridRobot {
	
	private static int longest = Integer.MIN_VALUE;

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3,4},{5,6,7,8},{9, 10,11,12},{13,14,15,16}};
		
		List<Integer> path = new ArrayList<Integer>();
		List<List<Integer>> paths = new ArrayList<>();
		getPaths(a, 0, 0, path, paths);
		
		System.out.println(longest);

		System.out.println(paths);
	}
	
	public static void getPaths (int[][] a, int i, int j, List<Integer> path, List<List<Integer>> paths){
		
		int len = a.length;
		
		if(i>= len || j>= len)
			return;
		
		path.add(a[i][j]);
		
		if(i==len-1 && j==len-1){
			paths.add(path);
			int temp = 0;
			for(Integer n : path){
				temp+=n;
			}

			if(temp > longest)
			{
				longest = temp;
			}
			return;
		}
		
		getPaths(a, i + 1, j, new ArrayList<>(path), paths);

		getPaths(a, i, j + 1, path, paths);

	}
}
