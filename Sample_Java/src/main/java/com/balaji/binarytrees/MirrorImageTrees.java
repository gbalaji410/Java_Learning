package com.balaji.binarytrees;


public class MirrorImageTrees {

	public static BinaryTreeNode<Integer> createTree () {
		BinaryTreeNode<Integer> tmp = new BinaryTreeNode<>(null, null, 0);
		
		BinaryTreeNode<Integer> left1 = new BinaryTreeNode<>(tmp, null, 1);
		BinaryTreeNode<Integer> right1 = new BinaryTreeNode<>(null, null, 4);
		BinaryTreeNode<Integer> left = new BinaryTreeNode<>(left1, right1, 3);
		
		BinaryTreeNode<Integer> left2 = new BinaryTreeNode<>(null, null, 7);
		BinaryTreeNode<Integer> right2 = new BinaryTreeNode<>(null, null, 12);
		BinaryTreeNode<Integer> right = new BinaryTreeNode<>(left2, right2, 10);
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(left, right, 5);
		return root;
	}
	
	public static BinaryTreeNode<Integer> createTree1 () {
		BinaryTreeNode<Integer> tmp = new BinaryTreeNode<>(null, null, 0);
		
		BinaryTreeNode<Integer> left1 = new BinaryTreeNode<>(null, tmp, 1);
		BinaryTreeNode<Integer> right1 = new BinaryTreeNode<>(null, null, 4);
		BinaryTreeNode<Integer> left = new BinaryTreeNode<>(right1, left1, 3);
		
		BinaryTreeNode<Integer> left2 = new BinaryTreeNode<>(null, null, 7);
		BinaryTreeNode<Integer> right2 = new BinaryTreeNode<>(null, null, 12);
		BinaryTreeNode<Integer> right = new BinaryTreeNode<>(right2, left2, 10);
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(right, left, 5);
		return root;
	}
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> createTree = createTree(); 
		BinaryTreeNode<Integer> createTree1 = createTree1();

		System.out.print(isMirror(createTree, createTree1));
	}
	
	public static <T> boolean isMirror (BinaryTreeNode<T> a, BinaryTreeNode<T> b) {
		
		if(a == null && b == null)
			return true;
		if(a == null || b == null)
			return false;
		
		return (a.getData() == b.getData()) && isMirror(a.getLeft(), b.getRight()) && 
				isMirror(a.getRight(), b.getLeft());
	}
}
