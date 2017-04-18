package Trees;

import java.util.ArrayList;

public class RecoverBST {
	public static ArrayList<Integer> recoverTree(TreeNode a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		TreeNode first = null;
		TreeNode second = null;
		TreeNode third = null;
		TreeNode temp = null;
		compute(a, first, second, third, temp);
		if( third == null){
			TreeNode vkl = first;
			first = second;
			second = vkl;
			result.add(first.val);
			result.add(second.val);
		}else{
			TreeNode vkl = first;
			first = third;
			third = vkl;
			result.add(first.val);
			result.add(third.val);
		}
		return result;
		
	}
	
	private static void compute(TreeNode root, TreeNode first, TreeNode second , TreeNode third, TreeNode temp) {
		System.out.println(" I am here"+ root.val);
		if ( root ==  null){
			return;
		}
		compute(root.left, first, second, third, temp);
		if( temp != null && root.val < temp.val){
			if( first == null){
				first = temp;
				second = root;
			}
			else{
				third = root;
			}
		}
		temp = root;
		
		compute(root.right, first, second, third, temp);
		
	}

	public static void main(String args[]){
		TreeNode root = new TreeNode(10);
		TreeNode c1 = new TreeNode(5);
		TreeNode c2 = new TreeNode(8);
		TreeNode c3 = new TreeNode(2);
		TreeNode c4 = new TreeNode(20);
		
		root.left = c1;
		root.right = c2;
		c1.left = c3;
		c1.right = c4;
		c2.left = null;
		c2.right = null;
		c3.left =null;
		c3.right = null;
		c4.left = null;
		c4.right = null;
		
		ArrayList<Integer> result = recoverTree(root);
		
		System.out.println(result);
	}
}
