package com.balaji.concurrency;


public class SynchronizedClass {
	
	public SynchronizedClass(long init){
		balance = init;
	}
	private long balance = 0;

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public synchronized long increment (long deposit) {
		setBalance(this.getBalance() + deposit);
		return getBalance();		
	}
	
	public synchronized long decrement (long withdraw) {
		setBalance(this.getBalance() - withdraw);
		return getBalance();		
	}
}
