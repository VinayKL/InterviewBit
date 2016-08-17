package Trees;

import java.util.ArrayList;

public class KthSmallestinBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int k = 7;
		
		int result = kthsmallest(root,k);
		System.out.println(result);
		

	}
	public static int kthsmallest(TreeNode root, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int counter =0;
		compute(root,k,result);
		if( k > result.size()){
			return -1;
		}
		return result.get(k-1);
    }
	public static void compute(TreeNode root,int k,ArrayList<Integer>  result){
		if(root == null){
			return;
		}
		compute(root.left,k,result);
		result.add(root.val);
		compute(root.right,k,result);
		return;
	}
}
