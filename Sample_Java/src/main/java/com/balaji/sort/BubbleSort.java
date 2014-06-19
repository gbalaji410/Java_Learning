package com.balaji.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	static int[] r = new int[100];
	public static void main(String[] args) {
		
		Random rand = new Random();
		for (int i=1;i<100;i++){
			r[i] = rand.nextInt(100);
		}
		
		System.out.println(Arrays.toString(r));
		bubbleSort(r);
		System.out.println(Arrays.toString(r));
}

	static int[] bubbleSort (int[] in){
			
		for(int i=0;i<in.length;i++){
			for(int j=1;j<in.length;j++){
				if(in[j]<in[j-1]){
					int temp = in[j];
					in[j] = in[j-1];
					in[j-1] = temp;
				}
			}
		}
		
		return in;
	}
}