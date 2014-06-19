package com.balaji.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianStreamOfNumbers {
	
	private Queue<Integer> minHeap;
	private Queue<Integer> maxHeap;
	private int count = 0;
	
	public MedianStreamOfNumbers () {
		this.minHeap = new PriorityQueue<>();
		this.maxHeap = new PriorityQueue<>(10, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		this.count = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianStreamOfNumbers m = new MedianStreamOfNumbers();
		m.addNumberToSTream(1);
		m.addNumberToSTream(2);
		m.addNumberToSTream(5);
		m.addNumberToSTream(7);
		m.addNumberToSTream(9);

//		m.addNumberToSTream(3);
//		m.addNumberToSTream(8);
//		m.addNumberToSTream(9);
//		m.addNumberToSTream(19);
//		m.addNumberToSTream(23);
//		m.addNumberToSTream(24);

		System.out.println(m.getMedian()); // should be 1

	}
	
	public void addNumberToSTream (Integer in){
		//maxHeap.add(in);
		if(count % 2 == 0) {
			maxHeap.add(in);
			count++;
			if(minHeap.isEmpty()) {
				return;
			}
		}
		else {
			minHeap.add(in);
			count++;
		}
		if(maxHeap.peek() > minHeap.peek()) {
			//exchange
			Integer a = maxHeap.poll();
			Integer b = minHeap.poll();
			maxHeap.add(b);
			minHeap.add(a);
		}
	}
	
	private double getMedian () {
		if(count % 2 == 0) {
			Integer a = maxHeap.peek();
			Integer b = minHeap.peek();
			return (a + b)/2.0;
		}
		else {
			return maxHeap.peek();
		}
	}
}
