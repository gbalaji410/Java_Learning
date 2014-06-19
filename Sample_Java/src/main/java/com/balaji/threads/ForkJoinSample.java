package com.balaji.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinSample extends RecursiveAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int numProcessors = Runtime.getRuntime().availableProcessors();
	
	public static void main(String[] args){
		
		ForkJoinPool f = new ForkJoinPool(numProcessors);
		System.out.println(numProcessors+ ":"+f.getPoolSize());
		//f.invoke(task);

	}

	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		
	}
}
