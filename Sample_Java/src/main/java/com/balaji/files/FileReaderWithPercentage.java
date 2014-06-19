package com.balaji.files;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;
import java.util.Random;

public class FileReaderWithPercentage {
	
	public static void main (String[] args) throws IOException {
		
		RandomAccessFile r = new RandomAccessFile("/Users/bganesan/Balaji/postcodes.csv", "r");
		
		FileChannel f = r.getChannel();
		
        
		long size = f.size();
		
		System.out.println("File size in MB: " + size/(1024 * 1024));
		double percent = 0.3;
		double a = (size/100) * percent;				
		Date time = new Date();
		
		System.out.println("Start Time:" + time);
		ByteBuffer bb = ByteBuffer.allocate((int)a);
		//Random ran = new Random();
		
		//f.position(ran.nextInt((int)size));
		
		if(f.read(bb)>0){
			bb.flip();
			for(int i=0;i<bb.limit();i++){
				System.out.print((char)bb.get(i));
			}
		}

		f.close();	
		r.close();
		Date end = new Date();
		System.out.println("End Time:" + end);
		System.out.println("Total Time:" + (end.getTime() - time.getTime()));

	}
	
	private static void memory(){
		int mb = 1024*1024;
		Runtime runtime = Runtime.getRuntime();
		
		//Print used memory
        System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
 
        //Print free memory
        System.out.println("Free Memory:"
            + runtime.freeMemory() / mb);
         
        //Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
	}
}
