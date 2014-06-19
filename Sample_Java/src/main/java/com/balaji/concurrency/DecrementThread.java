package com.balaji.concurrency;

public class DecrementThread extends Thread {
	
	private SynchronizedClass cls;
	
	public DecrementThread(SynchronizedClass cls){
		this.setCls(cls);
	}
	
	
	@Override
	public void run() {
		getCls().decrement(200);
	}


	public SynchronizedClass getCls() {
		return cls;
	}


	public void setCls(SynchronizedClass cls) {
		this.cls = cls;
	}
}
