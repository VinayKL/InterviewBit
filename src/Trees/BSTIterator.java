package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTIterator {
	static Queue<TreeNode> que = new LinkedList();
	public static void main(String args[]){
		TreeNode root = new TreeNode(100);
		TreeNode c1 = new TreeNode(98);
		TreeNode c2 = new TreeNode(102);
		TreeNode c3 = new TreeNode(96);
		TreeNode c4 = new TreeNode(99);
		TreeNode c5 = new TreeNode(97);
		TreeNode c6 = new TreeNode(109);
		
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
		
		BSTIterator i = new BSTIterator(root);
		while (i.hasNext()) {
			System.out.println(i.next());
		}
			
	}
	 public BSTIterator(TreeNode root) {
	        inorderprint(root);
	    }

	    /** @return whether we have a next smallest number */
	public boolean hasNext() {
	        return !que.isEmpty();
	}

	    /** @return the next smallest number */
	 public int next() {
	        return que.remove().val;
	 }
	 public static void inorderprint(TreeNode root){
			if(root == null){
				return;
			}
			inorderprint(root.left);
			que.add(root);
			inorderprint(root.right);
		}
}
