package samsung;

import java.util.Scanner;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode (int data) {
		this.data = data;
	}
}

class KdistSum {
	
	public static int SumOfKdistfromN(TreeNode root,int n,int k) {
		int ans = 0;
		int level = 1;
		level = getLevel(root,level,n);
		System.out.println("The Level for the tree node "+n+" is "+level);
		return ans;
	}
	
	public static int getLevel(TreeNode root,int level,int n) {
		if(root == null) {
			return 0;
		}
		if(root.data == n) {
			return level;
		}
		int value = getLevel(root.left,level++,n);
		if(value != 0)
			return value;
		value = getLevel(root.right,level++,n);
		return value;
	}
	
	public static void inorder(TreeNode root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		//Making the tree
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode (5);
		root.right = new TreeNode (7);
		root.left.left = new TreeNode (6);
		root.left.left.left = new TreeNode (4);
		root.left.left.right = new TreeNode (8);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode (3);
		root.right.left = new TreeNode (9);
		root.right.left.right = new TreeNode (11);
		root.right.right = new TreeNode (10);
		
		//print inorder of tree
		inorder(root);
		
		//Find the sum of Nodes that are K dist away from Node N
		System.out.println(SumOfKdistfromN(root, 4, 2));
	}
}
