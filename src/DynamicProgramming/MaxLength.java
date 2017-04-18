package DynamicProgramming;

import Trees.TreeNode;

public class MaxLength {
	public static void main(String args[]){
		TreeNode root = new TreeNode(10);
		TreeNode l1 = new TreeNode(2);
		TreeNode l2 = new TreeNode(10);
		TreeNode l3 = new TreeNode(20);
		TreeNode l4 = new TreeNode(1);
		TreeNode l5 = new TreeNode(-25);
		TreeNode l6 = new TreeNode(3);
		TreeNode l7 = new TreeNode(4);
		root.left = l1;
		root.right = l2;
		l1.left =  l3;
		l1.right = l4;
		l2.left = null;
		l2.right = l5;
		l5.left = l6;
		l5.right = l7;
		System.out.println(root);
		
	}
	public int maxPathSum(TreeNode a) {
		
	}
	public static int compute(TreeNode A){
		if( A== null){
			return 0;
		}else{
			return Math.max(a, b)
		}
	}
}
