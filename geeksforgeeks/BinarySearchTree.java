package com.hritik;

public class BinarySearchTree {
	class Node{
		int key;
		Node right, left;
		
		//Constructor
		public Node(int key) {
			this.key = key;
		}
	}
	
	Node root;
	
	BinarySearchTree () {
		root = null;
	}
	
	void insert(int key) {
		root = insert_rec(key,root);
	}
	
	Node insert_rec(int key,Node root) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		//cases
		if(key < root.key) {
			root.left = insert_rec(key, root.left);
		} else {
			root.right = insert_rec(key, root.right);
		}
		return root;
	}
	
	void delete(int key) {
		root = delete_rec(key,root);
	}
	
	Node delete_rec(int key, Node root) {
		if(root == null)
			return root;
		if(key < root.key)
			root.left = delete_rec(key, root.left);
		else if(key > root.key)
			root.right = delete_rec(key, root.right);
		else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else {
				//delete inorder successor
				root.key = minv(root.right);
				root.right = delete_rec(root.key, root.right);
			}
		}
		return root;
	}
	
	int minv(Node root) {
		int minvalue = root.key;
		while(root.left!=null) {
			minvalue = root.left.key;
			root = root.left;
		}
		return minvalue;
	}
	
	
	
	public static void inorder_traversal(Node root) {
		if(root == null)
			return;
		inorder_traversal(root.left);
		System.out.println(root.key);
		inorder_traversal(root.right);
	}
	
	public static void main(String[] args) {
		BinarySearchTree tr = new BinarySearchTree();
		
		tr.insert(10);
		tr.insert(50);
		tr.insert(30);
		tr.insert(20);
		tr.insert(40);
		tr.insert(60);
		
		tr.delete(30);
		
		inorder_traversal(tr.root);
	}
}
