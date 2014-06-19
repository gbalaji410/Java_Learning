package com.balaji.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		
		Set<Integer> in = new HashSet<>();
		for(int x: a){
			in.add(x);
		}
		
		for(Set<Integer> s : powerset(in)) {
			System.out.println(Arrays.toString(s.toArray()));
		}
	}

	private static List<Set<Integer>> powerset(Set<Integer> a) {
		
		List<Set<Integer>> power = new ArrayList<>();

		if(a == null || a.size() == 0) {
			power.add(new HashSet<Integer>());
			return power;
		}
		
		List<Integer> list = new ArrayList<Integer>(a);
		
		int head = list.get(0);
		
		Set<Integer> sub = new HashSet<Integer>(list.subList(1, list.size()));
				
		for(Set<Integer> s : powerset(sub)) {
			Set<Integer> newSet = new HashSet<>();
			newSet.add(head);
			newSet.addAll(s);
			power.add(newSet);
			power.add(s);
		}
		
		return power;
	}

}
