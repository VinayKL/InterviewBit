package Trees;

import java.util.ArrayList;
import java.util.List;

public class levelordertraversval {
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		TreeNode c1 = new TreeNode(2);
		TreeNode c2 = new TreeNode(3);
		TreeNode c3 = new TreeNode(4);
		TreeNode c4 = new TreeNode(5);
		TreeNode c5 = new TreeNode(6);
		TreeNode c6 = new TreeNode(7);
		
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
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result = levelOrder(root);
		System.out.println(result);
		
	}
	 public static List<List<Integer>> levelOrder(TreeNode root) {
		 
	 }
}
