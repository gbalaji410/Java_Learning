package com.balaji.test;

import java.util.Calendar;
import java.util.Date;

public class BusinessDays {

	public static void main (String[] args){
		System.out.println(addBusinessDay(Calendar.getInstance(), 11));
	}
	
	static Date addBusinessDay (Calendar cal, int b){
				
		int count = 0;
		for(int i = 1; i<= b ; i++){
			cal.add(Calendar.DATE, 1);
			if((cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)){
				++count;
			}
		}
		
		if(count > 0)
			addBusinessDay(cal, count);
		
		return cal.getTime();
	}
}
