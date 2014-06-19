package com.balaji.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 
 * Heap Class to provide O(n) insertion time and O(log n) time for add/get methods.
 * Retrieval is O(log n) as well
 * */

public class MinHeap {
	
	List<Integer> heap = new ArrayList<>();
	private volatile int currSize = 0;
	
	public static void main(String[] args) {
		
		MinHeap mh = new MinHeap();
		Random r = new Random();
		for(int i=0;i<15;i++){
			int rand = r.nextInt(100);
			System.out.println("Adding: " + rand);
			mh.put(rand);
		}
		
		for(int i=0;i<15;i++){
			System.out.println(mh.get());
		}

	}
	
	public void put (int a){
		heap.add(a);
		currSize++;
		siftup();
	}
	
	public void siftup (){
		int index = currSize - 1;
		int parent = (index - 1)/2;
		while(heap.get(index)<heap.get(parent)){
			swap(index,parent);
			index = parent;
			parent = (index - 1)/2;
		}
	}
	
	private void swap(int index, int parent) {
		if(parent==index){
			return;
		}
		int temp = heap.get(index);
		int p = heap.get(parent);
		heap.remove(index);
		heap.add(index, p);
		heap.remove(parent);
		heap.add(parent,temp);
	}

	public int get(){
		if(heap.size()==0)
			return -1;
		int ret = heap.remove(0);
		currSize--;
		if(currSize>0){
			heap.add(0,heap.remove(currSize-1));
			siftdown();
		}
		return ret;
	}

	private void siftdown() {
		
		if(heap.size()<=1)
			return;
		int index = 0;
		int lchild = (2*index) + 1;
		int rchild = (2*index) + 2;
		
		int minIndex = 0;
		
		if(heap.size()<=lchild)
			minIndex = rchild;
		else if(heap.size()<=rchild) 
			minIndex = lchild;
		else
			minIndex = (heap.get(lchild) < heap.get(rchild))?lchild:rchild;
		
		while(heap.get(minIndex)<heap.get(index)){
			swap(index, minIndex);
			index = minIndex;
			lchild = (2*index) + 1;
			rchild = (2*index) + 2;
			if(heap.size()<=lchild||heap.size()<=rchild) break;
			minIndex = (heap.get(lchild) < heap.get(rchild))?lchild:rchild;
		}

	}

}
