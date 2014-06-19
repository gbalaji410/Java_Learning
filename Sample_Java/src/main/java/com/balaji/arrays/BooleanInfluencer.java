package com.balaji.arrays;

import java.util.Arrays;
import java.util.Random;

public class BooleanInfluencer {

	public static void main(String[] args) {
		boolean a[][] = new boolean[5][5];
		
		Random r = new Random();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j] = r.nextBoolean();
			}
		}

		System.out.println(influencer(a));
	}
	
	public static boolean influencer (boolean[][] a){
		boolean is_inf = true;
		for(int i=0;i<a.length;i++){
			System.out.println(Arrays.toString(a[i]));
			for(int j=0;j<a[i].length;j++){
				if(a[i][j] || !a[j][i]) {
					is_inf = false;
					break;
				}
			}
		}
		return is_inf;
	}
}
