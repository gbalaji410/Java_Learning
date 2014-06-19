package com.balaji.files;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;

public class FileReaderWithBuffer {
	
	public static void main (String[] args) throws IOException {
		
//		File f = new File("/Users/bganesan/Balaji/postcodes.csv");
//		FileInputStream fis = new FileInputStream(f);
//		
//		int ch = 0;
//		
//		while((ch = fis.read()) != -1){
//			System.out.print((char)ch);
//		}
		
//		fis.close();
		RandomAccessFile r = new RandomAccessFile("/Users/bganesan/Balaji/postcodes.csv", "r");
		FileChannel f = r.getChannel();
		Date time = new Date();
		System.out.println("Start Time:" + time);
		ByteBuffer bb = ByteBuffer.allocate(4096);
		while(f.read(bb)>0){
			bb.flip();
			for(int i=0;i<bb.limit();i++){
				System.out.print((char)bb.get(i));
			}
			bb.clear();
		}
		f.close();	
		r.close();
		Date end = new Date();
		System.out.println("End Time:" + end);
		System.out.println("Total Time:" + (end.getTime() - time.getTime()));

	}
}
