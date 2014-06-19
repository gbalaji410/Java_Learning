package com.balaji.cache;

import java.util.Random;

public class TTLCacheTester {
	
	public static void main (String[] args) throws InterruptedException{
		TTLCache<Integer, String> ttl = new TTLCache<>();
		Random r = new Random();
		for(int i =0;i<=100;i++){
			ttl.put(r.nextInt(10000), "Test" + i, 1000);
		}
		
		//Thread.sleep(1000);
		
		String string = ttl.get(100);
		
		System.out.println(string);
	}
}
