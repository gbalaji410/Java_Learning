package com.balaji.astrings;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
	
	public static int count = 0;
	public static void main(String[] args) {
		
	    permutations("balajiswr");
		
		System.out.println("Total Iterations: " + count);
		
	}
	
	public static void permutations (String s) {
		if(s!=null && s.length()>0)
			permute("", s.trim());
	}

	private static void permute(String prefix, String s) {
		int l = s.length();
		if(l == 0)
		{
			System.out.println(prefix);
			count++;
		}
		else {
			for(int i=0;i<l;i++) {
				String k = prefix + s.charAt(i);
				permute(k, s.substring(0,i) + s.substring(i + 1, l));
			}
		}
	}
}
