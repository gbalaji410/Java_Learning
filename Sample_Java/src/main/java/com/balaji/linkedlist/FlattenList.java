package com.balaji.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenList {

	public static void main(String[] args) {

		List<Object> treeList = a(a(1), 2, a(a(3, 4), 5), a(a(a())), a(a(a(6))), 7, 8, a(9,10), 11, 12);
		List<Object> op = flattenHelper(treeList);
		
		System.out.println(op);
	}

	private static List<Object> a(Object... a) {
		return Arrays.asList(a);
	}
	
	static List<Object> flattenHelper (List<Object> input){
		List<Object> output = new ArrayList<Object>();
		flatten(input, output);		
		return output;
	}
	
	static void flatten (List<Object> input, List<Object> output){
		
		if(input == null || input.size() == 0){
			return;
		}
		
		for(Object o:input){
			if(o instanceof List){
				flatten((List)o, output);
			}
			else {
				output.add(o);
			}
		}
		
	}
}
