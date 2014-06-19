package com.balaji.arrays;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3871251371060421551L;
	
	private static volatile Singleton instance;

	private Singleton(){
		
	}
		
	public static Singleton getInstance(){
		
		if(instance == null) {
			synchronized(instance) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() throws ObjectStreamException {
		return instance;
	}
	
	public static void main (String[] args){
		Singleton s = Singleton.getInstance();
	}
}