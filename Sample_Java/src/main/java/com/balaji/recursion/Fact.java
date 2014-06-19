package com.balaji.recursion;

import java.math.BigInteger;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fact(new BigInteger("22")));
	}
	
	private static BigInteger fact (BigInteger n){
		if(n.equals(BigInteger.ZERO)) return BigInteger.ONE;
		else
			return n.multiply(fact(n.subtract(BigInteger.ONE)));
	}
}
