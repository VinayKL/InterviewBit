package Trees;

import java.util.Stack;

public class NextGreatestNumberBST {
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
		
		int b = 97;
		
		TreeNode c6 = getSuccessor(root,b);
		System.out.println(c6.val);
		
		
		
		
	}
	public static TreeNode getSuccessor(TreeNode A, int B) {
	    
	    Stack<TreeNode> stack = new Stack<>();
	    TreeNode node = A;
	        
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        
        boolean status = false;
	    
	    while (!stack.isEmpty()) {
	        
	        node = stack.pop();
	        
	        if (status)
	            return node;
	        
	        if (node.val == B) {
	            status = true;
	        }
	        
	        node = node.right;
	     
	        while (node != null) {
                stack.push(node);
                node = node.left;
            }   
	        
	    }
	    
	    return null;
	    
	}
}
