package com.balaji.linkedlist;

public class MyLinkedListTester {

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		for(int i = 1; i<= 10; i++){
			list.insert(i, false);
		}	
		list.insert(11, true);

		//ListElement<Integer> listElement = removeMth(list, 5);
		//System.out.println("Find in List: " + (listElement!=null?listElement.getData():" None"));
		
		System.out.println("Circular List: " + isCircular(list));

	}
	
	public static boolean isCircular (MyLinkedList<Integer> list) {
		
		if(list == null || list.size() <= 1)
			return false;
		
		ListElement<Integer> slow = list.head;
		ListElement<Integer> fast = list.head.getNext();
		
		while(true){
			if(fast == null || fast.getNext() == null) {
				return false;
			}
			if(fast != null && fast.getData() == slow.getData()) {
				return true;
			}
			slow = slow.getNext();
			fast = fast.getNext() != null ? fast.getNext().getNext() : fast.getNext();
		}

	}
	
	public static ListElement<Integer> removeMth (MyLinkedList<Integer> list, int m){
		
		ListElement<Integer> returnElem = null;
		if(list == null || list.size() == 0){
			return null;
		}
		
		ListElement<Integer> elem = list.head;
		ListElement<Integer> elem1 = list.head;

		if(m == 0){
			//return last
			while(elem!=null){
				returnElem = elem;
				elem = elem.getNext();
			}
			return returnElem;
		}
		//Have 2 pointers and put them m nodes apart.
		for(int i=1;i<=m;i++){
			elem1 = elem1.getNext();
			if(elem1 == null){
				return elem1;
			}
		}
		//Now when the run ahead pointer reaches the end, the other pointer is m nodes from the end.
		while(elem1!=null){
			elem1 = elem1.getNext();
			elem = elem.getNext();
		}
		return elem;		
	}
}