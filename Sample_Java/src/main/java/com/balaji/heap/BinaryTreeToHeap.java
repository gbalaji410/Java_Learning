package com.balaji.heap;

import java.util.Arrays;

import com.balaji.binarytrees.BSTTester;
import com.balaji.binarytrees.BinarySearchTreeNode;

public class BinaryTreeToHeap {

	public static void main(String[] args) {

		BinarySearchTreeNode<Integer> root = BSTTester.buildRoot(5);
		int size = treeSize(root);
		int[] a = new int[size];
		
		traverse(root, a, 0);
		
		//Arrays.sort(a);
		
		MinHeap mn = new MinHeap();
		
		for(int i=0; i<size;i++) {
			mn.put(a[i]);
		}
		
		System.out.println(mn.heap);
		
		for(int i=0; i<size;i++) {
			System.out.print(mn.get() + ",");
		}
	}
	
	public static int traverse (BinarySearchTreeNode<Integer> root, int[] a, int c) {
		if(root == null || root.getData() == null) {
			return c;
		}
		a[c++] = root.getData();
		
		c = traverse(root.getLeft(), a, c);
		c = traverse(root.getRight(), a, c);
		return c;
	}
	public static int treeSize (BinarySearchTreeNode<Integer> root) {
		
		if(root == null) return 0;
		
		int size = 1;
		
		size = size + treeSize(root.getLeft());
		size = size + treeSize(root.getRight());
		
		return size;

	}
}
