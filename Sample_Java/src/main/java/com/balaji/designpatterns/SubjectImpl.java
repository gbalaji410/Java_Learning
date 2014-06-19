package com.balaji.designpatterns;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class SubjectImpl extends Observable {
	
	public SubjectImpl(int value){
		this.value = value;
	}
	
	private int value = 0;
    private ArrayList<Observer> observers = new ArrayList<Observer>();

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public synchronized void deleteObserver(Observer o) {
		observers.remove(o);
	}
	
	@Override
	public synchronized void addObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void notifyObservers() {
	
		for(Observer o : observers){
			o.update(this, 1);
		}
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public static void main (String[] args){
		SubjectImpl s = new SubjectImpl(10);
		Observer o = new ObserverPatternDemo();
		s.addObserver(o);
		s.setValue(15);
		
	}
}
