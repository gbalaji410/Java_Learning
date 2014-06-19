package com.balaji.recursion;

import java.util.Iterator;
import java.util.TreeSet;


public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int[] m = new int[200];
		//for(int i = 0;i<=n;i++){
			System.out.print(fib(25, m) + " ");
		//}
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);
		 
		Iterator<Integer> iterator = tree.iterator();
		System.out.print("Tree set data: ");
		while (iterator.hasNext()) {
		    System.out.println(iterator.next() + " ");
		}
	}
	
	private static int fib (int n, int[] m){
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(m[n]!=0)
			return m[n];
		else
			m[n] = fib(n-1,m) + fib(n-2,m);
		return m[n];
	}
}
