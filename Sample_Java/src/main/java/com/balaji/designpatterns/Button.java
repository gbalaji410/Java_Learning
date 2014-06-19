package com.balaji.designpatterns;

public class Button {
	private Commander c;
	
	public Button(Commander c){
		this.c = c;
	}
	
	public void click (){
		c.execute();
	}
}