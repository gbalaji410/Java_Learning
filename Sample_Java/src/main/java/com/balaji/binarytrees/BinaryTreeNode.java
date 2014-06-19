package com.balaji.binarytrees;

public class BinaryTreeNode<T> extends BinarySearchTreeNode<T> {
	
	//Lookup is O(log(n)) in Binary Search Tree
	//Deletion & Insertion is O(log(n)) in Binary Search Tree
	private Integer data;
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;
	public BinaryTreeNode(){}
	
	public void add (Integer value){
		add(this, data);
	}
	public BinaryTreeNode<T> add (BinaryTreeNode<T> node, int data){
		if(node == null){
			node = new BinaryTreeNode<>();
			node.data = data;
		}
		return node;
	}
	
	public BinaryTreeNode(BinaryTreeNode<T> left, BinaryTreeNode<T> right, Integer data){
		this.data = data;
		this.setLeft(left);
		this.setRight(right);
	}
	
	public Integer getData() {
		return data;
	}
	
	public BinaryTreeNode<T> getLeft() {
		return left;
	}
	
	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}
}