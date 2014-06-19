package com.balaji.binarytrees;

public class LowestCommonAncestor {
	
	public static BinarySearchTreeNode<Integer> findLca (BinarySearchTreeNode<Integer> root, BinarySearchTreeNode<Integer> p, 
			BinarySearchTreeNode<Integer> q){
		
		if(root == null)
			return null;
		
		if((p!=null && root.getData() == p.getData()) || (q!=null && root.getData() == q.getData()))
			return root;
		
		BinarySearchTreeNode<Integer> left = findLca(root.getLeft(), p, q);
		BinarySearchTreeNode<Integer> right = findLca(root.getRight(), p, q);
		
		if(left!=null && right!= null){
			return root;
		}
		else if (left!=null){
			return left;
		}
		else
			return right;

	}
	
}
