package com.balaji.binarytrees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSplitter {
	public static void main (String[] a){
		File f = new File("/Users/bganesan/Balaji/recommendation.txt");
		
		int blocks = 200;
		char[] c = new char[blocks];
		String word = "Recommendation";
		int count = 0;
		
		try {
			Scanner s = new Scanner(f);
			while(s.hasNextLine()){
				String next = s.next();
				
				if (next.contains(word))
				    count++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println(f.length());
		System.out.println(count);

	}
}
