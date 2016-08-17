package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InorderCatesian {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,6,3,4));
		TreeNode root = buildTree(input);
		inorderprint(root);
	}
	public static TreeNode buildTree(ArrayList<Integer> a) {
		TreeNode root = null;
		root = compute(a);
		return root;
    }
	static TreeNode compute(List<Integer> temp){
		//System.out.println(temp);
		if( temp.size() ==0){
			return null;
		}
		int high = temp.get(0);
		int index = 0;
		for( int i = 1 ; i < temp.size() ; i++){
			if( temp.get(i) > high){
				high = temp.get(i);
				index =i;
			}
		}
		//System.out.println("Node created with "+ high);
		TreeNode root = new TreeNode(high);
		root.left = null;
		root.right = null;
		
		root.left = compute(temp.subList(0, index));
		//System.out.println(index+1+ " "+ temp.size());
		root.right = compute(temp.subList(index+1, temp.size()));
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
