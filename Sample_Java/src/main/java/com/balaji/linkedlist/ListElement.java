package com.balaji.linkedlist;

public class ListElement<T> {
	
	//Lookup is O(n) in a Linked List
	public ListElement(T data){
		setData(data);
	}

	private ListElement<T> next;
	
	private T data;

	public ListElement<T> getNext() {
		return next;
	}

	public void setNext(ListElement<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
