package com.balaji.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTester implements Runnable {
	
	private String name;
	
	private static Runnable task1 = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Task 1 is complete");
		}
	};
	
	private static Runnable task2 = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Task 2 is complete");
		}
	};
	
	private static final CyclicBarrier ct1 = new CyclicBarrier(2, task1);
	private static final CyclicBarrier ct2 = new CyclicBarrier(2, task2);

	public static void main(String[] args) {
		CyclicBarrierTester c = new CyclicBarrierTester();
		c.setName("Thread 1");
		
		CyclicBarrierTester c1 = new CyclicBarrierTester();
		c1.setName("Thread 2");
		
		new Thread(c).start();
		new Thread(c1).start();

	}

	@Override
	public void run() {
		
		try {
			
			System.out.println(getName() + " is starting.");
			Thread.sleep(10000);
			ct1.await();
			System.out.println(getName() + " is done.");
			
			System.out.println(getName() + " 2 is starting.");
			Thread.sleep(10000);
			ct2.await();
			System.out.println(getName() + " 2 is done.");

		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
