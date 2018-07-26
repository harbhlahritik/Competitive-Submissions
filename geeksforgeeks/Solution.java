package com.hritik;
import java.util.*;
import java.io.*;

class Graph{
	private int V; // no of nodes
	private LinkedList<Integer> adj[];// adjacency list
	//constructor
	Graph (int v){
		V = v;
		adj = new LinkedList[v];
		for(int i = 0;i < v;++i)
			adj[i] = new LinkedList<>();
	}
	// to add an edge
	void addEdge(int v,int w){
		adj[v].add(w);
	}
	
	void DFSutil(int v, boolean visited[]) {
		// mark current node as visited and print it
		visited[v] = true;
		System.out.print(v+" ");
		
		//Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n])
				DFSutil(n, visited);
		}
	}
	
	void DFS(int v) {
		boolean visited[] = new boolean [V];
		DFSutil(v, visited);
	}
}

class Solution {
	public static void main(String[] args) {
		Graph g = new Graph(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        System.out.println("The Depth First Traversal for the graph is:");
        
        g.DFS(2);
	}
}
