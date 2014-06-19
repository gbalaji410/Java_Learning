package com.balaji.arrays;

import java.util.Arrays;
import java.util.Random;

public class Influencer {
	
	public static void main(String[] args){
		int a[][] = new int[5][5];
		//a[0][0] = 1;
		Random r = new Random();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j] = r.nextInt(2);
			}
		}

		System.out.println(influencer(a));
		
	}
	
	static boolean influencer (int[][] a){
		
		int c = 0;
		
		boolean influencer = true;
		
		for(int i=0;i<a.length;i++){
			System.out.println(Arrays.toString(a[i]));
			for(int j=0;j<a[i].length;j++){
				c++;
				//System.out.println(a[i][j]);
				if(i==j) continue;
				if(a[i][j] == 1 && a[j][i] != 0){
					influencer = false;
					break;
				}
			}
		}
		
		System.out.println("Executions: " + c);
		return influencer;
	}
}
