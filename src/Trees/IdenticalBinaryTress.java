package Trees;

public class IdenticalBinaryTress {
	public static void main(String args[]){
		TreeNode root = new TreeNode(100);
		TreeNode c1 = new TreeNode(98);
		TreeNode c2 = new TreeNode(102);
		TreeNode c3 = new TreeNode(96);
		TreeNode c4 = new TreeNode(99);
		TreeNode c5 = new TreeNode(97);
		
		root.left = c1;
		root.right = c2;
		c1.left = c3;
		c1.right = c4;
		c2.left = null;
		c2.right = null;
		c3.left =null;
		c3.right = c5;
		c4.left = null;
		c4.right = null;
		c5.left = null;
		c5.right = null;
		
		TreeNode root1 = new TreeNode(100);
		TreeNode c11 = new TreeNode(98);
		TreeNode c22 = new TreeNode(102);
		TreeNode c33 = new TreeNode(96);
		TreeNode c44 = new TreeNode(99);
		TreeNode c55 = new TreeNode(97);
		
		root1.left = c11;
		root1.right = c22;
		c11.left = c33;
		c11.right = c44;
		c22.left = null;
		c22.right = null;
		c33.left =null;
		c33.right = c55;
		c44.left = null;
		c44.right = null;
		c55.left = null;
		c5.right = null;
		
		int result = isSameTree(root,root1);
		System.out.println(result);
		inorderprint(root);
		
	}
	  
	public static int isSameTree1(TreeNode a, TreeNode b) {
		int result =0;		 
		result = compute(a,b,1);
		return result;
	}
	public static int compute(TreeNode node , TreeNode node2, int flag){
		if( flag == 0){
			return 0;
		}
		if(node.left != null && node2.left != null){
			flag = compute(node.left, node2.left, flag);
		}
		else if(( node.left == null && node2.left != null) || (node.left != null && node2.left == null)){
			return 0;
		}
		if(node.val != node2.val){
			//System.out.println(node.val + "  "+ node2.val);
			flag =0;
		}
		if(node.right != null && node2.right != null){
			flag = compute(node.right, node2.right, flag);
		}
		else if(( node.right == null && node2.right != null) || (node.right != null && node2.right == null)){
			return 0;
		}
		return flag;
		
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
