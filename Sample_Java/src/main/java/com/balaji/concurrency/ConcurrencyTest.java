package com.balaji.concurrency;



public class ConcurrencyTest {

	public static void main(String[] args) {

		SynchronizedClass cls = new SynchronizedClass(1000);

		IncrementThread inc = new IncrementThread(cls);
		DecrementThread dec = new DecrementThread(cls);
	
		inc.start();
		System.out.println("Waiting....");
		dec.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cls.getBalance());
	}

}
