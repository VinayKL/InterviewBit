package Trees;

import java.util.ArrayList;
import java.util.Arrays;

public class InorderPostOrder {
	static int counter= -2;
	public static TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
		if( counter == -2){
			counter = postorder.size()-1;
		}
		TreeNode root = compute(inorder,postorder,0,inorder.size()-1);
		return root;
	}
	private static TreeNode compute(ArrayList<Integer> inorder, ArrayList<Integer> postorder, int start, int end) {
		//System.out.println(start + " "+ end);
		if(start >end ){
			return null;
		}
		TreeNode root = new TreeNode(postorder.get(counter--));
		if( start == end ){
			return root;
		}
		int index =0;
		for( int i =start ; i <= end ;i++){
			if( inorder.get(i) == root.val){
				index = i;
				break;
			}
		}
		root.right = compute(inorder,postorder,index+1,end);
		root.left = compute( inorder,postorder,start, index-1);
		
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
		ArrayList<Integer> postorder = new ArrayList<Integer>(Arrays.asList(2,1,3));
		ArrayList<Integer> inorder = new ArrayList<Integer>(Arrays.asList(2,3,1));
		TreeNode result = buildTree(inorder,postorder);
		printinorder(result);
	}
}
