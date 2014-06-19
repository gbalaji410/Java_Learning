package com.balaji.linkedlist;

import java.util.concurrent.ConcurrentSkipListSet;

public class SkipListTest {
	static public void main (String[] args){
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
		
		for(int i = 1; i<=100; i++){
			set.add(i);
		}
		
		System.out.println(set.contains(23));
	}
}
