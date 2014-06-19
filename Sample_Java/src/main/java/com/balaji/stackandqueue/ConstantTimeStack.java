package com.balaji.stackandqueue;

import java.util.Random;
import java.util.Stack;

public class ConstantTimeStack extends Stack<Integer> {
	
	private Stack<Integer> temp = new Stack<>();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	@Override
	public Integer push(Integer item) {
		Integer e = super.push(item);
		
		if(temp.isEmpty()) {
			temp.push(item);
		}
		if(item < temp.peek()) {
			temp.push(item);
		}
		
		return e;
	}
	
	@Override
	public synchronized Integer pop() {
		Integer e = super.pop();
		if(!temp.isEmpty() && e == temp.peek()) {
			temp.pop();
		}
		return e;
	}
	
	public Integer min(){
		return temp.peek();
	}
	
	public static void main(String[] args) {
		ConstantTimeStack c = new ConstantTimeStack();
		
		Random r = new Random();
		
		for(int i = 0; i< 100; i++){
			c.push(r.nextInt(150));
		}
		
		for(int i = 0; i< 45; i++){
			c.pop();
		}
		
		System.out.println(c.min());
		
	}

}
