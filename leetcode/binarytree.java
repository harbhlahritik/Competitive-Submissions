import java.util.*;

class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

class Solution {

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0){
            return null;
        } else if (nums.length == 1){
            TreeNode root = new TreeNode(nums[0]);
            return root;
        }
        int index = -1;
        int max = -1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        int [] left_arr = new int [index];
        int [] right_arr = new int [nums.length-index-1];
        for(int i = 0;i < index;i++){
            left_arr[i] = nums[i];
        }
        for(int i = index+1,k = 0;i < nums.length;i++,k++){
            right_arr[k] = nums[i];
        }
        root.left = constructMaximumBinaryTree(left_arr);
        root.right = constructMaximumBinaryTree(right_arr);
        return root;
    }

    public static void print_tree(TreeNode root){
        if(root == null){
            System.out.print("null ");
            return;
        }
        System.out.print(root.val + " ");
        print_tree(root.left);
        print_tree(root.right);
    }

    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T > 0){
            int N = s.nextInt();
            int [] nums = new int [N];
            for(int i = 0;i < N;i++){
                nums[i] = s.nextInt();
            }
            TreeNode root = constructMaximumBinaryTree(nums);
            print_tree(root);
            T--;
        }
    }
}