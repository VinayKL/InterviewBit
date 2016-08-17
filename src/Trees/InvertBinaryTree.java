package Trees;

public class InvertBinaryTree {
	public static void main(String args[]){
		TreeNode root = new TreeNode(100);
		TreeNode c1 = new TreeNode(98);
		TreeNode c2 = new TreeNode(102);
		TreeNode c3 = new TreeNode(96);
		TreeNode c4 = new TreeNode(99);
		TreeNode c5 = new TreeNode(97);
		TreeNode c6 = new TreeNode(109);
		
		root.left = c1;
		root.right = c2;
		c1.left = c3;
		c1.right = c4;
		c2.left = c5;
		c2.right = c6;
		c5.left = null;
		c5.right = null;
		c6.left = null;
		c6.right = null;
		
		//inorderprint(root);
		TreeNode result = invertTree(root);
		inorderprint(result);
		
	}
	public static TreeNode invertTree(TreeNode root) {
		
		if(root == null){
			return root;
		}
		
		
		TreeNode temp = root.right;
		root.right = invertTree(root.left);
		root.left = invertTree(temp);
		
		
		return root;
		
    }
	public static void inorderprint(TreeNode root){
		if(root == null){
			return;
		}
		inorderprint(root.left);
		System.out.println(root.val);
		inorderprint(root.right);
	}
}
