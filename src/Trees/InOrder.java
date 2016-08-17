package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class InOrder {
	public static void main(String args[]){
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
		
		ArrayList<Integer> result = new ArrayList();
		result = inorderTraversal(root);
		System.out.println(result);
	}
	
	public static ArrayList<Integer> inorderTraversal(TreeNode a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = a;
        
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
    
		boolean status = false;
    
		while (!stack.isEmpty()) {
        
			node = stack.pop();
        
			result.add(node.val);
			node = node.right;
     
			while (node != null) {
				stack.push(node);
				node = node.left;
			}   
        
		}
    
		return result;
    
	}	
}
