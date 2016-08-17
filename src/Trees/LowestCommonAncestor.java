package Trees;

import java.util.ArrayList;

public class LowestCommonAncestor {
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
		int val1 = 2;
		int val2 =3;
		int result = lca(root,val1,val2);
		System.out.println(result);
		
	}
	public static int lca(TreeNode a, int val1, int val2) {
		int result =0;
		ArrayList<Integer> path1 =new ArrayList<Integer>();
		ArrayList<Integer> path2 = new ArrayList<Integer>();
		ArrayList<Integer> vkl = new ArrayList<Integer>();
		compute(path1,a,val1,vkl);
		compute(path2,a,val2,vkl);
		System.out.println(path1);
		System.out.println(path2);
		for( int i =0 ; i<path1.size() && i<path2.size() ;i++){
			
			if(path1.get(i) != path2.get(i)){
				result = path1.get(i-1);
			}
		}
		return result;	
	}
	public static void compute(ArrayList<Integer> path1,TreeNode a, int val1,ArrayList<Integer> vkl){
		if(a == null){
			return;
		}
		System.out.println(a.val+ "  "+ val1);
		if( a.val == val1){
			System.out.println(" I am free");
			ArrayList<Integer> temp = new ArrayList<Integer>(vkl);
			path1.addAll(temp);
			return;
		}
		
		vkl.add(a.val);
		compute(path1, a.left,val1,vkl);
		
		compute(path1,a.right,val1,vkl);
		
		return;
		
	}
}
