package com.balaji.concurrency;

public class IncrementThread extends Thread {
	
	private SynchronizedClass cls;
	
	public IncrementThread(SynchronizedClass cls){
		this.setCls(cls);
	}
	
	
	@Override
	public void run() {
		getCls().increment(200);
	}


	public SynchronizedClass getCls() {
		return cls;
	}


	public void setCls(SynchronizedClass cls) {
		this.cls = cls;
	}
}
