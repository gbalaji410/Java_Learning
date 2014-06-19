package com.balaji.threads;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchTester {
	
	private static final CountDownLatch ct = new CountDownLatch(3);
	
	public static void main(String[] args) {
		Waiter w = new Waiter();
		Decrementer d = new Decrementer();
		new Thread(w).start();
		new Thread(d).start();
	}
	
	private static class Waiter implements Runnable {

		@Override
		public void run() {
			try {
				System.out.println("Waiter thread has started");
				ct.await(10, TimeUnit.SECONDS);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Waiter thread has finished");
		}
	}
	
	private static class Decrementer implements Runnable {

		@Override
		public void run() {
			
			try {
				
				System.out.println("Decrementer thread is counting down: " + new Date());

				ct.countDown();
				Thread.sleep(2000);
				
				System.out.println("Decrementer thread is counting down: " + new Date());

				ct.countDown();
				Thread.sleep(5000);
				
				System.out.println("Decrementer thread is counting down: " + new Date());

				ct.countDown();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
