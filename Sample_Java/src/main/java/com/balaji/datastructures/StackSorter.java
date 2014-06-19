package com.balaji.datastructures;

import java.util.Stack;

public class StackSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> in = new Stack<>();
		in.push(2); in.push(1); in.push(8); in.push(4);
		
		in = sort(in);		
		System.out.print(in);
	}
	
	public static Stack<Integer> sort (Stack<Integer> in){
		Stack<Integer> out = new Stack<>();
		out.push(in.pop());
		
		while (!in.isEmpty()) {
			Integer a = in.pop();			
			while(!out.isEmpty() && out.peek() < a){
				in.push(out.pop());
			}
			out.push(a);			
		}
		
		
		return out;
	}
}
