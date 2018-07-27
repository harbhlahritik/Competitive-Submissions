package com.hritik;

import com.hritik.BinarySearchTree.Node;

public class LevelOrder {

	public static void level_print(Node root) {
		System.out.println(root.key);
		int h = height(root);
		for(int i = 1;i <= h;i++) {
			printLevelHeight(root,i);
			System.out.println();
		}
	}
	
	public static void printLevelHeight(Node root, int level) {
		if(root == null)
			return;
		if(level == 1) {
			System.out.print(root.key+" ");
		} else if(level > 1) {
			printLevelHeight(root.left, level-1);
			printLevelHeight(root.right, level-1);
		}
	}
	
	public static int height(Node root) {
		if(root == null)
			return 0;
		int left_height = height(root.left);
		int right_height = height(root.right);
		if(left_height > right_height) {
			return left_height;
		}
		return right_height;
	}
	
	public static void main(String[] args) {
		BinarySearchTree tr = new BinarySearchTree();
		
		tr.insert(10);
		tr.insert(50);
		tr.insert(30);
		tr.insert(20);
		tr.insert(40);
		tr.insert(60);
		
		level_print(tr.root);
	}
}
