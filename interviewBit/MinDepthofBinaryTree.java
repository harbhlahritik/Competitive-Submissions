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
    public int minDepth(TreeNode A) {
        if(A == null){
            return 0;
        }
        if(A.left == null && A.right == null){
            return 1;
        }
        if(A.left == null && A.right != null){
            return minDepth(A.right)+1;
        }
        if(A.left != null && A.right == null){
            return minDepth(A.left)+1;
        }
        int left = minDepth(A.left);
        int right = minDepth(A.right);
        return Math.min(left,right)+1;
    }
}
