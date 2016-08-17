package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.management.Query;

import Trees.TreeNode;

public class LevelOrder {
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		TreeNode c1 = new TreeNode(2);
		TreeNode c2 = new TreeNode(3);
		TreeNode c3 = new TreeNode(4);
		TreeNode c4 = new TreeNode(5);
		TreeNode c5 = new TreeNode(6);
		TreeNode c6 = new TreeNode(7);
		TreeNode c7 = new TreeNode(8);
		
		root.left = c1;
		root.right = c2;
		c1.left = c3;
		c1.right = c4;
		c2.left = c5;
		c2.right = c6;
		c5.left = null;
		c5.right = null;
		c6.left = c7;
		c6.right = null;
		c7.left = null;
		c7.right = null;
		
		ArrayList<ArrayList<Integer>> result = levelOrder(root);
		System.out.println(result);

	}
	public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode a) {
		ArrayList<ArrayList<Integer>>  result = new ArrayList<ArrayList<Integer>>();
		if( a == null){
			return result;
		}
		
		
		ArrayList<Integer> temp = new ArrayList<Integer> ();
		
		LinkedList<TreeNode> list1 = new LinkedList();
		LinkedList<TreeNode> list2 = new LinkedList();
		list1.add(a);
		while(! list1.isEmpty()){
			TreeNode vick = list1.remove();
			temp.add(vick.val);
			if( vick.left  != null){
				list2.add(vick.left);
			}
			if ( vick.right != null){
				list2.add(vick.right);
			}
			if( list1.isEmpty()){
				list1 = list2;
				list2 = new LinkedList();
				result.add(temp);
				temp = new ArrayList();
			}
		}
		return result;
	}
	
}
