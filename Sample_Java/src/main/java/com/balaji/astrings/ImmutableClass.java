package com.balaji.astrings;

import java.util.Date;

public final class ImmutableClass {
	
	private final Integer a;
	private final String b;
	private final Date date;
	
	public Integer getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public Date getDate() {
		return new Date(date.getTime());
	}

	public ImmutableClass(Date dt){
		a = 1;
		b = "Test";
		date = new Date(dt.getTime());
	}
	
	@Override
	public String toString() {
		return a + " : " + b + " : " + getDate();
	}
	public static void main(String[] args) {
		ImmutableClass i = new ImmutableClass(new Date());
		System.out.println(i.toString());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(i.toString());

	}

}
