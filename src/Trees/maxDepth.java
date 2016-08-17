package Trees;

import java.util.ArrayList;

public class maxDepth {
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
		
		int depth = maxDepth(root);
		System.out.println(depth);
	}
	public static int maxDepth(TreeNode a) {
		if(a==null){
			return 0;
		}
		int left_hieght = maxDepth(a.left);
		int right_hieght = maxDepth(a.right);
		return Math.min(left_hieght+1, right_hieght+1);
		
	}
	
	
}
