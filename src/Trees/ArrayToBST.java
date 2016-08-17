package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToBST {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		TreeNode result =sortedArrayToBST(input);
		inorderprint(result);
	}
	public static TreeNode sortedArrayToBST(final List<Integer> a) {
		TreeNode root = null;
		int length = a.size()-1;
		root = compute(0,length,a);
		return root;
	}
	public static TreeNode compute( int a , int b,final List<Integer> list){
		
		if( a > b){
			return null;
		}
		int middle = ((b+a)/2);

		int val = list.get(middle);
		
		// create a node
		TreeNode root = new TreeNode(val);
				
		root.left = compute(a,middle-1,list);
		root.right =compute(middle+1,b,list);
		return root;
	}
	public static void inorderprint(TreeNode root){
		if(root == null){
			return;
		}
		inorderprint(root.left);
		System.out.print(root.val);
		inorderprint(root.right);
	}
}
