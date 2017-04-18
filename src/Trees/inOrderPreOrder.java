package Trees;

import java.util.ArrayList;
import java.util.Arrays;

public class inOrderPreOrder {
	static int counter=0;
	public static TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
		TreeNode result = null;
		result = compute(preorder,inorder,0,inorder.size()-1);
		return result;
	}
	private static TreeNode compute(ArrayList<Integer> preorder, ArrayList<Integer> inorder, int start, int end) {
		//System.out.println(start+ " "+ end);
		if( start > end){
			return null;
		}
		TreeNode root = new TreeNode(preorder.get(counter++));
		if( start == end){
			return root;
		}
		int index = 0;
		int i=0;
		for( i = start ; i<= end ;i++){
			if( inorder.get(i) == root.val){
				index =i;
			}
		}
		root.left = compute(preorder,inorder,start,index-1);
		root.right = compute(preorder,inorder,index+1,end);
		return root;
	}
	private static void printinorder(TreeNode result) {
		if( result == null){
			return;
		}
		printinorder(result.left);
		System.out.println(result.val);
		printinorder(result.right);
		
	}
	public static void main(String args[]){
		ArrayList<Integer> preorder = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> inorder = new ArrayList<Integer>(Arrays.asList(2,1,3));
		TreeNode result = buildTree(preorder,inorder);
		printinorder(result);
	}
}
