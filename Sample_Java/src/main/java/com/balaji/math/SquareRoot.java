package com.balaji.math;

import java.text.DecimalFormat;

public class SquareRoot {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("my Square root of: " + (sqrt(144)));
		System.out.println("Square root of: " + Math.sqrt(144));
	}
	
	public static double sqrt(double i) {
		return sqrt(i,1);
	}

	private static double sqrt (double x, double y){
		
		if(close(x/y, y))
			return y;
		else 
			return sqrt(x, betterGuess(x, y));
		
	}
	
	public static boolean close (double a, double b){
		if(Math.abs(a - b) < 0.001){
			return true;
		}
		return false;
	}
	
	public static double betterGuess(double x, double y) {
		   return ((y + x/y) / 2);
	}
}
