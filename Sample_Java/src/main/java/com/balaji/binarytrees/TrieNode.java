package com.balaji.binarytrees;

public class TrieNode {
	
	private char c;
	private TrieNode[] links;
	private boolean isWord;
	
	public TrieNode(char c, boolean isWord){
		this.c = c;
		this.isWord = isWord;
		links = new TrieNode[26];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
