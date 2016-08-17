package Trees;

import java.util.ArrayList;

public class roottoLeaf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		TreeNode c2 = new TreeNode(4);
		TreeNode c3 = new TreeNode(8);
		TreeNode c4 = new TreeNode(11);
		TreeNode c5 = new TreeNode(13);
		TreeNode c6 = new TreeNode(4);
		TreeNode c7 = new TreeNode(7);
		TreeNode c8 = new TreeNode(2);
		TreeNode c9 = new TreeNode(5);
		TreeNode c10 = new TreeNode(1);
		
		root.left = c2;
		root.right = c3;
		c2.left = c4;
		c2.right = null;
		c3.left = c5;
		c3.right = c6;
		c4.left = c7;
		c4.right = c8;
		c5.left = null;
		c5.right = null;
		c6.left = c9;
		c6.right = c10;
		c7.left = null;
		c7.right = null;
		c8.left = null;
		c8.right = null;
		c9.left = null;
		c9.right = null;
		c10.left = null;
		c10.right = null;
		int sum = 22;
		ArrayList<ArrayList<Integer>> result = pathSum(root,sum);
		System.out.println(result);
	
	}
	public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> vkl = new ArrayList<Integer>();
		compute(result,root, sum , vkl);
		return result;
		
	}
	public static void compute(ArrayList<ArrayList<Integer>> result, TreeNode root,int  sum, ArrayList<Integer> vkl){
		if( root.left ==  null && root.right == null){
			vkl.add(root.val);
			int res = 0;
			for( int i=0 ; i < vkl.size(); i++){
				res = res + vkl.get(i);
			}
			if( res == sum){
				ArrayList<Integer> store = new ArrayList<Integer>(vkl);
				result.add(store);
			}
		}
		else{
			
			//System.out.println(size + " "+ root.val);
			vkl.add(root.val);
			//System.out.println(" Before pruning " + temp);
			if( root.left != null){
				compute(result,root.left,sum, vkl);
			}
			if( root.right != null){
				compute(result,root.right,sum,vkl);
			}
			//System.out.println(" After pruning" + temp);
		}
		vkl.remove(vkl.size()-1);
	}
}
