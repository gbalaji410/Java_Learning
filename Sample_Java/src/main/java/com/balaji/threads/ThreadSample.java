package com.balaji.threads;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadSample implements Callable<String> {
	
    private static final AtomicInteger nextId = new AtomicInteger(0);

	private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>(){
		@Override
		public Integer initialValue(){
			return nextId.incrementAndGet();
		}
	};
	
	private AtomicLong counter = new AtomicLong(0);
	
	@Override
	public String call() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(formatter.get().format(new Date()));
		System.out.println("ThreadId Value: " + threadId.get());
		return String.valueOf(counter.incrementAndGet());

	}
	
	public static void main (String[] args) throws ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(200);		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mmddyy");//.get();
		System.out.println("Start Time: " + simpleDateFormat.format(new Date()));
		ThreadSample task = new ThreadSample();
		List<ThreadSample> tasks = Collections.nCopies(10000, task);
		
		List<Future<String>> all = null;
		try {
			all = es.invokeAll(tasks);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Submitted tasks to executor.");

		for(Future<String> t:all){
					try {
				System.out.println(t.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("End Time: " + simpleDateFormat.format(new Date()));
		es.shutdown();
	}
	
}
