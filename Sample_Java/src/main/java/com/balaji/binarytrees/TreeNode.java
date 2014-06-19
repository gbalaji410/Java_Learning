package com.balaji.binarytrees;

public class TreeNode<T> {
	
	//Lookup is O(log(n)) in Binary Search Tree
	//Deletion & Insertion is O(log(n)) in Binary Search Tree
	//Traversal - 
	private T data;
	private TreeNode<T> left;
	private TreeNode<T> right;
	
	public TreeNode(TreeNode<T> left, TreeNode<T> right, T data){
		this.left = left;
		this.right = right;
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public TreeNode<T> getLeft() {
		return left;
	}
	
	public TreeNode<T> getRight() {
		return right;
	}
}