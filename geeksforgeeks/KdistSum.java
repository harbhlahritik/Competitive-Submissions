import java.util.*;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode (int data) {
		this.data = data;
	}
}

class KdistSum {

	public static int SumOfKdistfromN(TreeNode root,int n,int k) {
		int ans = 0;
		int level = getLevel(root,0,n);
		if(level - k > 0){
            getNodeAtLevel(root, lvl);
        }
		return ans;
    }

    public static int getNodeAtLevel(TreeNode root,int lvl){
        if(root == null){
            return 0;
        }
        if(lvl == 0){
            return root.data;
        }
        int ans1 = getNodeAtLevel(root.left, lvl-1);
        int ans2 = getNodeAtLevel(root.right, lvl-1);
        return ans1+ans2;
    }

	public static int getLevel(TreeNode root,int level,int n) {
		if(root == null) {
			return 0;
		}
		if(root.data == n) {
			return level;
		}
		int value = getLevel(root.left,level+1,n);
		if(value != 0)
			return value;
		value = getLevel(root.right,level+1,n);
		return value;
	}

	public static void inorder(TreeNode root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);

		//Making the tree
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode (5);
		root.right = new TreeNode (7);
		root.left.left = new TreeNode (6);
		root.left.left.left = new TreeNode (4);
		root.left.left.right = new TreeNode (8);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode (3);
		root.right.left = new TreeNode (9);
		root.right.left.right = new TreeNode (11);
		root.right.right = new TreeNode (10);

		//print inorder of tree
    inorder(root);
    System.out.println();

		//Find the sum of Nodes that are K dist away from Node N
		System.out.println(SumOfKdistfromN(root, 5, 2));
	}
}
