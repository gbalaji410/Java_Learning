package com.balaji.binarytrees;

public class BinarySearchTreeNode<T> {
	
	//Lookup is O(log(n)) in Binary Search Tree
	//Deletion & Insertion is O(log(n)) in Binary Search Tree
	private Integer data;
	private BinarySearchTreeNode<T> left;
	private BinarySearchTreeNode<T> right;
	public BinarySearchTreeNode(){}
	
	public void add (Integer value){
		add(this, data);
	}
	public BinarySearchTreeNode<T> add (BinarySearchTreeNode<T> node, int data){
		if(node == null){
			node = new BinarySearchTreeNode<>();
			node.data = data;
		}
		else if(node.getData() >= data){
			BinarySearchTreeNode<T> n = new BinarySearchTreeNode<>();
			node.setLeft(n);
			node.getLeft().data = data;
			return node.getLeft();
		}
		else{
			BinarySearchTreeNode<T> n = new BinarySearchTreeNode<>();
			node.setRight(n);
			node.getRight().data = data;
			return node.getRight();
		}
		return node;
	}
	
	public BinarySearchTreeNode(BinarySearchTreeNode<T> left, BinarySearchTreeNode<T> right, Integer data){
		this.data = data;
		if(left!=null && (getData() >= left.getData())){
			this.setLeft(left);
			this.setRight(right);
		}
		else{
			this.setLeft(right);
			this.setRight(left);
		}
	}
	
	public Integer getData() {
		return data;
	}
	
	public BinarySearchTreeNode<T> getLeft() {
		return left;
	}
	
	public BinarySearchTreeNode<T> getRight() {
		return right;
	}
	
	public BinarySearchTreeNode<Integer> findNode (BinarySearchTreeNode<Integer> root, int data){
		
		if(root == null)
			return null;
		
		if(root.getData() == data){
			return root;
		}
		
		if(root.getData() >= data){
			return findNode(root.getLeft(), data);
		}
		else{
			return findNode(root.getRight(), data);
		}		
	}
	
	public int findMaxHeight (BinarySearchTreeNode<Integer> root){
		
		if(root == null)
			return 0;
		
		return (Math.max(findMaxHeight(root.getLeft()), findMaxHeight(root.getRight()))) + 1;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setLeft(BinarySearchTreeNode<T> left) {
		this.left = left;
	}

	public void setRight(BinarySearchTreeNode<T> right) {
		this.right = right;
	}
}