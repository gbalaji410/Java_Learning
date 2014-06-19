package com.balaji.binarytrees;

public class BinaryTreeBuilder {
	
	static int index = 0;
	
	static BinarySearchTreeNode<Integer> buildPreOrder (BinarySearchTreeNode<Integer> root, String[] arr){
		
		if(index > arr.length){
			return null;
		}
		
		if(root == null)
			root = new BinarySearchTreeNode<>();
			
		if(arr[index].equals("#")){
			index++;	
			return null;
		}
		
		root.setData(Integer.parseInt(arr[index]));
		index++;
		root.setLeft(buildPreOrder(root.getLeft(), arr));
		root.setRight(buildPreOrder(root.getRight(), arr));
		return root;
		}
}
