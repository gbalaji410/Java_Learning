package com.balaji.astrings;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RepeatingString {

	public static void main(String[] args) {
		repeat("ABCABCA" , 2);
	}

	public static void repeat(String s, int len){
		Set<String> temp = new HashSet<>();
		Set<String> ls = new TreeSet<>();
		int i = 0;
		int j = i + len;
		while(j <= s.length()){
			if(!temp.add(s.substring(i, j))){
				ls.add(s.substring(i, j));
			}
			i++;
			j = i + len;
		}
		
		for(String s1 : ls){
			System.out.println(s1);
		}
	}
}
