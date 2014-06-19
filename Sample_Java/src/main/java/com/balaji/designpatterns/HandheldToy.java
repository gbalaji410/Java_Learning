package com.balaji.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class HandheldToy implements Toy {
	
	private List<Button> buttons  = new ArrayList<>();
		
	@Override
	public void playSound() {
		System.out.println("Play music lalalala!!!!");
	}

	@Override
	public void showPicture() {
		System.out.println("Show Picture");
	}
	
	public static void main(String[] args){
		
		Toy toy = new HandheldToy();

		Commander sound = new PlaySoundCommand(toy);
		Commander picture = new ShowPictureCommand(toy);
		
		Button soundButton = new Button(sound);
		Button pictureButton = new Button(picture);
		
		toy.addButton(pictureButton);
		toy.addButton(soundButton);

		soundButton.click();
		
		pictureButton.click();
		
	}

	@Override
	public void addButton(Button e) {
		buttons.add(e);
	}
}
