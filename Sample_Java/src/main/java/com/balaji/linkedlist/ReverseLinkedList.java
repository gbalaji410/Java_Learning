package com.balaji.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {
	
	public static void main(String[] args) {

		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		
		for(int i = 1; i<= 100; i++){
			list.insert(i);
		}
		
		reverseList(list);
		
		
	}
	
	public static void reverseList (MyLinkedList<Integer> list){
		
		ListElement<Integer> curr, rev, temp;
		
		ListElement<Integer> head = list.head;
		
		if(head == null)
			return;
	
		curr = head;
		rev = null;
		list.tail = head;
		
		while(curr!= null){
			list.head = curr;
			temp = curr.getNext();
			curr.setNext(rev);
			rev = curr;
			curr = temp;
		}
		
		
		for(int i = 0; i< list.size; i++){
			System.out.println(list.remove());
		}
	}
}
