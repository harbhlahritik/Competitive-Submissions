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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = A;
        while(true){
            if(s.empty() && curr == null){
                break;
            } else {
                while(curr!=null){
                    s.push(curr);
                    curr = curr.left;
                }
                if(!s.empty() && curr == null){
                    TreeNode n = s.pop();
                    list.add(n.val);
                    curr = n.right;
                }
                while(curr!=null){
                    s.push(curr);
                    curr = curr.left;
                }
            }
        }
        
        return list;
    }
}
