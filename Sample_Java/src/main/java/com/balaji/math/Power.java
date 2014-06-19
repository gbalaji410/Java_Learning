package com.balaji.math;

public class Power {

	public static void main(String[] args) {
		System.out.println(pow(4,3));
		System.out.println(Math.pow(4,3));

	}

	public static double pow(double a, int b) {
		
		if(b == 0)
			return 1;
		
		if(b == 1)
			return a;
		
		double res = 1d;
		for(int i=1;i<=b ; i++){
			res*=a;
		}
		
		
		return res;
	} 
}
