package Trees;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int result = isBalanced(root);
		System.out.println(result);
	}
	public static int isBalanced(TreeNode a) {
		int result;
		int temp1,temp2;
		if( a == null){
			return 1;
		}
		temp1 = compute(a.left);
		temp2 = compute(a.right);
		if( (Math.abs(temp1- temp2) < 2) && (isBalanced(a.left) ==1) && (isBalanced(a.right) ==1)){
			return 1;
		}
		return 0;
	}
	public static int compute(TreeNode a){
		if( a == null){
			return 0;
		}
		int left =compute(a.left);
		int right = compute(a.right);
		return 1+Math.max(left, right);
	}
}
