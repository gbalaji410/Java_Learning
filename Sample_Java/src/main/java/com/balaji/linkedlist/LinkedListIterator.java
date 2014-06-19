package com.balaji.linkedlist;

public class LinkedListIterator {

	public static void main(String[] args) {
		MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
		MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();
		MyLinkedList<Integer> list3 = new MyLinkedList<Integer>();
		MyLinkedList<Integer> list4 = new MyLinkedList<Integer>();
		MyLinkedList<Integer> list5 = new MyLinkedList<Integer>();

		for(int i = 1; i<= 10; i++){
			list1.insert(i);
			list2.insert(i*2);
			list3.insert(i*3);
			list4.insert(i*4);
			list5.insert(i*5);
		}	
		
		MyLinkedList<MyLinkedList<Integer>> list = new MyLinkedList<>();
		list.insert(list1);
		list.insert(list2);
		list.insert(list3);
		list.insert(list4);
		list.insert(list5);

		System.out.println(iterate(list));
	}
	
	public static <T> String iterate (MyLinkedList<T> list) {
		StringBuilder sb = new StringBuilder();
		iterator(list, sb);
		return sb.toString();
	}
	
	public static <T> void iterator (MyLinkedList<T> l, StringBuilder sb) {
		
		ListElement<T> head = l.head;
		while (head != null) {
			T t = head.getData();
			if(t instanceof MyLinkedList<?>) {
				sb.append("|");
				iterator((MyLinkedList<?>) t, sb);
			}
			else {
				sb.append(t.toString()+",");
			}
			head = head.getNext();
		}
	}
}
