package com.balaji.designpatterns;

public class ShowPictureCommand implements Commander {
	
	private Toy toy;
	
	public ShowPictureCommand(Toy toy) {
		this.toy = toy;
	}
	
	@Override
	public boolean execute() {
		toy.showPicture();
		return true;
	}

}
