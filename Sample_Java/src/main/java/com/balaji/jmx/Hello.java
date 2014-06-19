package com.balaji.jmx;

import java.util.Date;

public class Hello implements HelloMBean {
	
    private String message = null;
    
    public Hello(){
    	message = "Hello World!";
    }

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public void sayHello() {
		System.out.println(getMessage() + ":" + new Date());
	}

}
