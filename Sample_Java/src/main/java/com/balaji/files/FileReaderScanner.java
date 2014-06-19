package com.balaji.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File source = new File("/Users/bganesan/Balaji/postcodes.csv");
		Scanner s = new Scanner(source,"UTF-8");
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
	}

}
