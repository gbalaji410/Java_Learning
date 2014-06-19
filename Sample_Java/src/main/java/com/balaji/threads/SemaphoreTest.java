package com.balaji.threads;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	public static void main (String[] args) throws Exception {
		
		Semaphore s = new Semaphore(5);
		for(int i = 0;i<101;i++){
			new Work(s).start();
			if(i%2==0)
				Thread.currentThread().setPriority(1);
			else 
				Thread.currentThread().setPriority(10);
		}
		
	}
	
	private static class Work extends Thread{
		
		private Semaphore s;
		public Work(Semaphore s){
			this.s = s;
		}
		
		@Override
		public void run() {
			try{
			s.acquire();
			  String msg = Thread.currentThread().getName() + " - running at: "
			            + new Date();
			System.out.println(msg);
	        Thread.sleep(10000);
			Random r = new Random();
			}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();
			}
			finally{
				s.release();
			}
		}
		
	}
	
}