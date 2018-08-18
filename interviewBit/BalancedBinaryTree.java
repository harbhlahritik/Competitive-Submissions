/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int isBalanced(TreeNode A) {
        if(A == null){
            return 1;
        }
        if(maxDepth(A.left) == maxDepth(A.right) || maxDepth(A.left) - maxDepth(A.right) == 1
         || maxDepth(A.left) - maxDepth(A.right) == -1){
             if(isBalanced(A.left) == 1 && isBalanced(A.right) == 1){
                return 1; 
             }
             return 0;
         }
        return 0;
    }
    
    public int maxDepth(TreeNode A){
        if(A == null){
            return 0;
        }
        int left = maxDepth(A.left);
        int right = maxDepth(A.right);
        return Math.max(left,right)+1;
    }
}
