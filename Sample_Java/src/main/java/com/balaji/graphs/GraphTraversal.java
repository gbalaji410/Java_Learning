package com.balaji.graphs;


public class GraphTraversal {

	public static void main (String[] args){
		GraphNode<String> a = new GraphNode<String>("A");
		
		GraphNode<String> b = new GraphNode<String>("B");

		GraphNode<String> c = new GraphNode<String>("C");

		GraphNode<String> d = new GraphNode<String>("D");

		GraphNode<String> e = new GraphNode<String>("E");

		GraphNode<String> f = new GraphNode<String>("F");

		GraphNode<String> g = new GraphNode<String>("G");
		
		a.addChild(b);
		a.addChild(c);

		b.addChild(d);
		b.addChild(e);
		
		c.addChild(f);
		c.addChild(g);
		
		a.bfs(a);
		
		a.dfs(a);

	}
	
}