/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(final List<Integer> a) {
        // int length = a.size();
        // int val = a.get(length/2);
        // TreeNode root = new TreeNode(val);
        // root = getBST(a,0,length/2-1,root);
        // root = getBST(a,length/2+1,length-1,root);
        // return root;
        return sortListToBST(a,0,a.size()-1);
    }
    
    public TreeNode sortListToBST(List<Integer> a,int start,int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode n = new TreeNode(a.get(mid));
        n.left = sortListToBST(a,start,mid-1);
        n.right = sortListToBST(a,mid+1,end);
        return n;
    }
    
    // public TreeNode getBST(List<Integer> a,int start,int end,TreeNode root){
    //     if(start == end){
    //         root = constructBST(root,a.get(start));
    //     } else {
    //         int val = a.get((start+end)/2);
    //         root = constructBST(root,val);
    //     }
    //     return root;
    // }
    
    // public TreeNode constructBST(TreeNode root,int val){
    //     if(root == null){
    //         return new TreeNode(val);
    //     }
    //     if(root.val > val){
    //         root.left = constructBST(root.left,val);
    //     } else {
    //         root.right = constructBST(root.right,val);
    //     }
    //     return root;
    // }
}
