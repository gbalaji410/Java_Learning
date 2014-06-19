package com.balaji.designpatterns;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class ObserverPatternDemo implements Observer {
	
	public static void main(String[] args) {
		
		ObserverPatternDemo o = new ObserverPatternDemo();

		NoticeBoard obs = new NoticeBoard();
		obs.addObserver(o);
		obs.setMessage("Balaji");
		obs.setMessage("Riya");
		obs.setMessage("Sheetal");
		obs.setMessage("Ridhi");

	}
	
	private static class NoticeBoard extends Observable {
		
		private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
			notifyAllParties();
		}
		
		private void notifyAllParties(){
			setChanged();
			notifyObservers();
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof NoticeBoard) {
			NoticeBoard t = (NoticeBoard) o;
			System.out.println(t.getMessage() + " - New message received at: " + new Date());
		}
	}

}
