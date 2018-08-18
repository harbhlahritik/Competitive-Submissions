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
    public int isSymmetric(TreeNode A) {
        return isMirror(A,A);
    }
    
    public int isMirror(TreeNode A,TreeNode B){
        if(A == null && B == null){
            return 1;
        }
        if(A != null && B != null && A.val == B.val){
            if(isMirror(A.left,B.right) == 1 && isMirror(A.right,B.left) == 1){
                return 1;
            }
            return 0;
        }
        return 0;
    }
    
}
