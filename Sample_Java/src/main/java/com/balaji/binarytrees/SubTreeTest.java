package com.balaji.binarytrees;


public class SubTreeTest {

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
		
		BinaryTreeNode<Integer> right = new BinaryTreeNode<>(null, null, 10);
		BinaryTreeNode<Integer> left = new BinaryTreeNode<>(null, null, 3);
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(null, null, 5);
		return root;
	}
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> rootA = createTree(); 
		BinaryTreeNode<Integer> rootB = createTree1();

		System.out.print(isSubTree(rootA, rootB));
	}
	
	public static <T> boolean isSubTree (BinaryTreeNode<T> rootA, BinaryTreeNode<T> rootB) {
		
		if(rootB == null)
			return true;
		
		if(rootA == null)
			return false;
		
		Integer a = rootA.getData();
		Integer b = rootB.getData();
		
		if(a.intValue() == b.intValue()) {
			return isSubTree(rootA.getLeft(), rootB.getLeft()) && isSubTree(rootA.getRight(), rootB.getRight());
		}
		else {
			return isSubTree(rootA.getLeft(), rootB) || isSubTree(rootA.getRight(), rootB);
		}
	}
}
