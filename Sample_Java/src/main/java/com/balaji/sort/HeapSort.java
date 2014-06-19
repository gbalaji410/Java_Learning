package com.balaji.sort;

import java.util.Arrays;
import java.util.Random;

import com.balaji.heap.MinHeap;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[1000];
		Random r = new Random();
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(1000);
		}
		
		MinHeap m = new MinHeap();
		for(int i:a){
			m.put(i);
		}
		
		int b[] = new int[a.length];
		
		for(int i=0;i<a.length;i++){
			b[i] = m.get();
		}
		
		System.out.println(Arrays.toString(b));
	}

}
