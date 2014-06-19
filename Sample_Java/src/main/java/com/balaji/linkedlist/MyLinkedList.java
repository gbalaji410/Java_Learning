package com.balaji.linkedlist;

public class MyLinkedList<T> {
	
	ListElement<T> head;
	ListElement<T> tail;
	int size = 0;
	
	public ListElement<T> find (T data){
		
		if(head != null && head.getData() == data)
			return head;
		
		ListElement<T> next = head.getNext();
		
		while(next!= null){
			if(next.getData() == data){
				return next;
			}
			next = next.getNext();
		}
			
		return null;
	}
	
	public ListElement<T> insert (T data){
		return this.insert(data, false);
	}
	
	public ListElement<T> insert (T data, boolean circular){
		
		if(head == null){
			head = new ListElement<T>(data);
			tail = head;
			size++;
			return head;
		}
		
		
		ListElement<T> next = head;
		
		while(next!= null) {
			ListElement<T> next2 = next.getNext();
			if(next2 == null){
				next2 = new ListElement<T>(data);
				next.setNext(next2);
				size++;
				tail = next2;
				if(circular) {
					tail.setNext(head);
				}
				return head;
			}
			next = next.getNext();
		}
				
		return head;
	}
	
	public ListElement<T> delete (T data){
		
		if(head == null)
			return null;
			
		if(head.getData() == data){
			head = head.getNext();
			size--;
			return head;
		}
		
		ListElement<T> elem = head;

		while(elem != null){
			
			ListElement<T> next = elem.getNext();
			
			if(next!=null && next.getData() == data){
				elem.setNext(next.getNext());
				size--;
				return next;
			}
			
			elem = next;

		}
		
		return null;
	}
	
	public int size (){
		return size;
	}

	public T remove() {
		if(head == null)
			return null;
		
		T ret = head.getData();
		head = head.getNext();
		size--;
		return ret;
	}	
}