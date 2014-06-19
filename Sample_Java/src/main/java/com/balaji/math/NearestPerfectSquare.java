package com.balaji.math;

public class NearestPerfectSquare {
	
	private static final double epsilon = 0.0001;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nearestSquare(135));
	}
	
	private static long nearestSquare (int num) {
		
		double x = Math.sqrt(num);
		int d = (int) x;
		
		
		
		if(x - d <= epsilon) {
			return num;
		}
		
		long ceil = (long)Math.ceil(x);
		long floor = (long) Math.floor(x);
		
		ceil *= ceil;
		floor *= floor;
		

		if(Math.abs(ceil - num) < Math.abs(num - floor)) {
			return ceil;
		}
		return floor;
	}
}
