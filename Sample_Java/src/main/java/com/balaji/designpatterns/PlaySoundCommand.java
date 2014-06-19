package com.balaji.designpatterns;

public class PlaySoundCommand implements Commander {
	
	private Toy toy;
	
	public PlaySoundCommand(Toy toy) {
		this.toy = toy;
	}
	
	@Override
	public boolean execute() {
		toy.playSound();
		return true;
	}

}
