package com.balaji.stackandqueue;


public class SafeQueue<T> {
	//FIFO
	Node<T> top;
	
	void push(T t){
		
		Node<T> input = new Node<>(t);
		Node<T> node = top;
		if(top == null){
			top = input;
		}
		else{
			while(node.getNext()!=null){
				node = node.getNext();
			}
			if(node!=null){
				node.setNext(input);
			}
		}
	}
	
	Node<T> peek(){
		if(top == null){
			return null;
		}
		return top;
	}
	
	Node<T> pop(){
		Node<T> pop = top;
		if(top == null){
			return null;
		}
		else{
			top = top.getNext();
		}
		return pop;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeQueue<Integer> s = new SafeQueue<>();

		for(int i = 0; i<100; i++){
			s.push(i);
		}
		for(int i = 0; i<100; i++){
			System.out.print(s.pop().getData()+"|");
		}
		System.out.println((s.peek()!=null?s.peek().getData():"Empty Q"));
	}
	
	class Node<T> {
		private T data;
		private Node<T> next;
		public Node(T t){
			this.setData(t);
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<T> getNext() {
			return next;
		}
		public void setNext(Node<T> next) {
			this.next = next;
		}
		
	}
}