package com.balaji.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 
 * Heap Class to provide O(n) insertion time and O(log n) time for add/get methods.
 * Retrieval is O(log n) as well
 * */

public class MaxHeap {
	
	List<Integer> heap = new ArrayList<>();
	private int currSize = 0;
	
	public static void main(String[] args) {
		
		MaxHeap mh = new MaxHeap();
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
		while(heap.get(parent)<heap.get(index)){
			swap(parent,index);
			index = parent;
			parent = (index - 1)/2;
		}
	}
	
	private void swap(int parent, int index) {
		// TODO Auto-generated method stub
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
		
		int maxIndex = 0;
		
		if(heap.size()<=lchild)
			maxIndex = rchild;
		else if(heap.size()<=rchild) 
			maxIndex = lchild;
		else
			maxIndex = (heap.get(lchild) > heap.get(rchild))?lchild:rchild;
		
		while(heap.get(index)<heap.get(maxIndex)){
			swap(index, maxIndex);
			index = maxIndex;
			lchild = (2*index) + 1;
			rchild = (2*index) + 2;
			if(heap.size()<=lchild||heap.size()<=rchild) break;
			maxIndex = (heap.get(lchild) > heap.get(rchild))?lchild:rchild;
		}

	}

}
