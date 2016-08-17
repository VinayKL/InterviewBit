package Trees;

import java.util.ArrayList;

public class SumMod1003 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode c1 = new TreeNode(1);
		c1.left = null;
		c1.right = null;
		TreeNode root = new TreeNode(1);
		TreeNode c2 = new TreeNode(2);
		TreeNode c3 = new TreeNode(3);
		TreeNode c4 = new TreeNode(4);
		TreeNode c5 = new TreeNode(5);
		TreeNode c6 = new TreeNode(6);
		TreeNode c7 = new TreeNode(7);
		TreeNode c8 = new TreeNode(8);
		
		root.left = c2;
		root.right = c3;
		c2.left = c4;
		c2.right = c5;
		c3.left = null;
		c3.right = c6;
		c4.left = c7;
		c4.right = c8;
		c5.left = null;
		c5.right = null;
		c6.left = null;
		c6.right = null;
		c7.left = null;
		c7.right = null;
		c8.left = null;
		c8.right = null;
		int result = sumNumbers(root);
		System.out.println(result);
	
	}
	public static int sumNumbers(TreeNode a) {
		int fres =0;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> vkl = new ArrayList<Integer>();
		compute(result,a, vkl);
		//System.out.println(result);
		for( int i=0; i< result.size();i++){
			double tem =0;
			for (int j = result.get(i).size()-1,k=0 ; j>=0 && k< result.get(i).size()  ; j--, k++){
				//System.out.println(result.get(i).get(k));
				tem = tem + ( result.get(i).get(k) *(int) Math.pow(10, j)) ;
			}
			tem = tem % 1003;
			fres= (int) ((fres + tem) % 1003);
		}
		return (fres % 1003);
		
	}
	public static void compute(ArrayList<ArrayList<Integer>> result, TreeNode root, ArrayList<Integer> vkl){
		if( root.left ==  null && root.right == null){
			vkl.add(root.val);
			ArrayList<Integer> store = new ArrayList<Integer>(vkl);
			result.add(store);
			
		}
		else{
			vkl.add(root.val);
			if( root.left != null){
				compute(result,root.left, vkl);
			}
			if( root.right != null){
				compute(result,root.right,vkl);
			}
		}
		vkl.remove(vkl.size()-1);
	}
}
