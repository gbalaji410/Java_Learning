package com.balaji.binarytrees;

public class BinaryTreeTraversal {

	public static void main(String[] args) {
		BinarySearchTreeNode<Integer> root = BSTTester.buildRoot(5);
		StringBuilder sb = new StringBuilder();
		inOrderIterator(root, sb);
		System.out.println(sb.toString());
		sb = new StringBuilder();
		preOrderIterator(root, sb);
		System.out.println(sb.toString());
		sb = new StringBuilder();
		postOrderIterator(root, sb);
		System.out.println(sb.toString());
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
	
	static void preOrderIterator (BinarySearchTreeNode<Integer> root, StringBuilder sb) {
		
		if(root == null){
			sb.append("# ");
			return;
		}
		
		sb.append(root.getData() + " ");

		preOrderIterator(root.getLeft(), sb);
		preOrderIterator(root.getRight(), sb);

	}

	static void postOrderIterator (BinarySearchTreeNode<Integer> root, StringBuilder sb) {
	
	if(root == null){
		sb.append("# ");
		return;
	}
	
	postOrderIterator(root.getLeft(), sb);
	postOrderIterator(root.getRight(), sb);
	sb.append(root.getData() + " ");

}
}
