package com.balaji.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GraphNode<T> {
	
	private Boolean visited;
	private List<GraphNode<T>> children;
	private T data;
	
	public GraphNode (T data){
		this.data = data;
		this.visited = false;
		this.children = new ArrayList<>();
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public List<GraphNode<T>> getChildren() {
		return children;
	}
	public void addChild(GraphNode<T> child) {
			this.children.add(child);
	}
	public Boolean getVisited() {
		return visited;
	}
	public void setVisited(Boolean visited) {
		this.visited = visited;
	}
	
	private GraphNode<T> getUnvisitedChildNode (GraphNode<T> parent){
		List<GraphNode<T>> children = parent.getChildren();
		for(GraphNode<T> child:children){
			if(!child.getVisited()){
				return child;
			}
		}
		return null;
	}
	
	public void dfs (GraphNode<T> root){
		dfs(root, true);
	}
	
	public void bfs (GraphNode<T> root){
		bfs(root, true);
	}
	
	private void clearNodes (){
		//dfs(this, false);
	}
	
	private void dfs (GraphNode<T> root, boolean visited) {
		
		Stack<GraphNode<T>> s = new Stack<>();
		s.push(root);
		root.setVisited(visited);
		System.out.println("Visited Node:"+root.getData());
		
		while(!s.isEmpty()){
			GraphNode<T> node = s.peek();
			GraphNode<T> child = getUnvisitedChildNode(node);
			if(child!=null){
				child.setVisited(visited);
				System.out.println("Visited Node:"+child.getData());
				s.push(child);
			}
			else
				s.pop();
		}
		clearNodes();
	}
	
	private void bfs (GraphNode<T> root, boolean visited) {
		
		Queue<GraphNode<T>> q = new LinkedList<>();
		q.add(root);
		root.setVisited(visited);
		System.out.println("Visited Node:"+root.getData());
		
		while(!q.isEmpty()){
			GraphNode<T> node = q.remove();
			GraphNode<T> child = null;
			while((child = getUnvisitedChildNode(node))!=null){
				child.setVisited(visited);
				System.out.println("Visited Node:"+child.getData());
				q.add(child);
			}
			
		}
		clearNodes();
	}
}
