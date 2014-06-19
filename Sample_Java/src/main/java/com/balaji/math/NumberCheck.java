package com.balaji.math;

import com.balaji.parsers.IntegerParser;

public class NumberCheck {

	public static void main(String[] args) {
		System.out.println(isNumber("-222"));
	}
	
	public static boolean isNumber(String toTest)
	{
		try {
			System.out.println(IntegerParser.parseInt(toTest));
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
}
