package com.balaji.binarytrees;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BSTTester {
	static final File f = new File("/Users/bganesan/Balaji/Test.txt");
	
	public static BinarySearchTreeNode<Integer> buildRoot (int rootVal){
		BinarySearchTreeNode<Integer> tmp = new BinarySearchTreeNode<>(null, null, 0);
		
		BinarySearchTreeNode<Integer> left1 = new BinarySearchTreeNode<>(tmp, null, 1);
		BinarySearchTreeNode<Integer> right1 = new BinarySearchTreeNode<>(null, null, 4);
		BinarySearchTreeNode<Integer> left = new BinarySearchTreeNode<>(left1, right1, 3);
		
		BinarySearchTreeNode<Integer> left2 = new BinarySearchTreeNode<>(null, null, 7);
		BinarySearchTreeNode<Integer> right2 = new BinarySearchTreeNode<>(null, null, 12);
		BinarySearchTreeNode<Integer> right = new BinarySearchTreeNode<>(left2, right2, 10);
		
		BinarySearchTreeNode<Integer> root = new BinarySearchTreeNode<>(left, right, rootVal);
		return root;
	}
	
	public static void main(String[] args) throws IOException {
		
		BinarySearchTreeNode<Integer> root = buildRoot(5);
		BinarySearchTreeNode<Integer> root1 = buildRoot(5);		
		BinarySearchTreeNode<Integer> findNode = root.findNode(root, 13);
		
		System.out.println("IN ORDER: " + inOrderSerialize(root1));
		//BinarySearchTreeNode<Integer> findLca = LowestCommonAncestor.findLca(root, left2, right2);
		
		//System.out.println("LCA is: " + (findLca != null ? findLca.getData() : "NOT FOUND"));
		if(findNode == null){
			System.out.println("Node not found");
		}
		else{
			System.out.println("Found Node");
		}
		
		System.out.println("Maximum Tree Height: " + root.findMaxHeight(root));	

		BinarySearchTreeNode<Integer> deSerialize = deSerialize();
		System.out.println("Binary Tree after deseriaize: " + inOrderSerialize(deSerialize));
	}
	
	static String inOrderSerialize (BinarySearchTreeNode<Integer> root) throws IOException {
		String inOrder = inOrder(root);
		return inOrder;
	} 
	
	static String serialize (BinarySearchTreeNode<Integer> root) throws IOException {
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		String preOrder = preOrder(root);
		bw.write(preOrder);
		bw.close();
		return preOrder;
	} 
	
	static BinarySearchTreeNode<Integer> deSerialize () throws IOException {
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String in;
		BinarySearchTreeNode<Integer> rt = null;
		while((in = br.readLine()) != null){
			rt = BinaryTreeBuilder.buildPreOrder(rt, in.split("\\s"));
		}
		return rt;
	}
	
	static String inOrder (BinarySearchTreeNode<Integer> root) {
		StringBuilder sb = new StringBuilder();
		inOrderIterator(root, sb);
		System.out.println("Binary Tree: " + sb.toString());
		return sb.toString();
	}

	static void inOrderIterator (BinarySearchTreeNode<Integer> root, StringBuilder sb) {
		
		if(root == null){
			sb.append("# ");
			return;
		}
		
		inOrderIterator(root.getLeft(), sb);
		sb.append(root.getData() + " ");
		inOrderIterator(root.getRight(), sb);

	}
	
	static String preOrder (BinarySearchTreeNode<Integer> root) {
		StringBuilder sb = new StringBuilder();
		preOrderIterator(root, sb);
		System.out.println("Binary Tree: " + sb.toString());
		return sb.toString();
	}

	static void preOrderIterator (BinarySearchTreeNode<Integer> root, StringBuilder sb) {
		
		if(root == null){
			sb.append("# ");
			return;
		}
		
		sb.append(root.getData() + " ");

		preOrderIterator(root.getLeft(), sb);
		preOrderIterator(root.getRight(), sb);

	}

}
