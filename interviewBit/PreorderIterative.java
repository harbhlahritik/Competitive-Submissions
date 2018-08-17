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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        s.push(A);
        while(!s.empty()){
            TreeNode n = s.pop();
            list.add(n.val);
            if(n.right != null)
                s.push(n.right);
            if(n.left != null)
                s.push(n.left);
        }
        return list;
    }
}
