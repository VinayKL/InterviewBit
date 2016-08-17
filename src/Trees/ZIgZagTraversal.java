package Trees;

import java.util.ArrayList;

public class ZIgZagTraversal {
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
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result = zigzagLevelOrder(root);
		System.out.println(result);
		
	}
	public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<TreeNode> levels = new ArrayList<TreeNode>();
		levels.add(a);
		//System.out.println("I am here");
		compute(levels,result,1);
		return result;
	}
	private static void compute(ArrayList<TreeNode> levels, ArrayList<ArrayList<Integer>> result, int flag) {
		//System.out.println("I am here");
		if(levels.isEmpty()){
			return;
		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(flag ==1){
			for( int i =0; i< levels.size(); i++){
				temp.add(levels.get(i).val);
			}
			result.add(temp);
			flag=0;
		}
		else if(flag ==0){
			
			for( int i=levels.size()-1; i>= 0; i--){
				temp.add(levels.get(i).val);
			}
			result.add(temp);
			flag=1;
		}
		
		ArrayList<TreeNode> levelstemp = new ArrayList<TreeNode>();
		levelstemp = (ArrayList<TreeNode>) levels.clone();
		
		levels.clear();
		
		for( int i =0 ; i< levelstemp.size() ; i++){
			if(levelstemp.get(i).left!= null){
				levels.add(levelstemp.get(i).left);
			}
			if(levelstemp.get(i).right!= null){
				levels.add(levelstemp.get(i).right);
			}
		}
		compute(levels,result,flag);
		return;
		
	}
}
