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
    public int isSameTree(TreeNode A, TreeNode B) {
        if(A == null && B == null){
            return 1;
        }
        if(A == null && B != null){
            return 0;
        }
        if(A != null && B == null){
            return 0;
        }
        if(A.left == null && A.right == null && B.left == null && B.right == null
        && A.val == B.val){
            return 1;
        }
        int left = isSameTree(A.left,B.left);
        int right = isSameTree(A.right,B.right);
        if(left == 1 && right == 1 && A.val == B.val){
            return 1;
        }
        return 0;
    }
}
