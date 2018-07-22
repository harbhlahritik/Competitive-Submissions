package com.hritik;

public class depthOfBinaryTree {

     //Definition for a binary tree node.
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode(int x) {
             val = x;
         }
     }

    public static void main(String[] args) {
        int [] array = new int [5];
        System.out.println(array.length);
    }

     class Solution {
        public int maxDepth(TreeNode root) {
            if(root == null){
                return 0;
            }
            int leftDepth = 1 + maxDepth(root.left);
            int rightDepth = 1 + maxDepth(root.right);
            return Math.max(leftDepth,rightDepth);
        }
    }
}
