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
    public int hasPathSum(TreeNode A, int B) {
        A = makeSumTree(A,0);
        return findNum(A,B);
    }
    
    public int findNum(TreeNode A,int B){
        if(A == null){
            return 0;
        }
        if(A.val == B && A.left == null && A.right == null){
            return 1;
        }
        int left = findNum(A.left,B);
        int right = findNum(A.right,B);
        if(left == 1 || right == 1){
            return 1;
        }
        return 0;
    }
    
    public TreeNode makeSumTree(TreeNode A,int sum){
        if(A == null){
            return A;
        }
        sum += A.val;
        A.val = sum;
        A.left = makeSumTree(A.left,sum);
        A.right = makeSumTree(A.right,sum);
        return A;
    }
}
