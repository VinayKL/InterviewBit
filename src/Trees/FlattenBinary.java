package Trees;

public class FlattenBinary {
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
		
		root = flatten(root);
		inorderprint(root);
		
	}
	public static TreeNode flatten(TreeNode a) {
		if(a == null){
			
			return a;
		}
		
		a.left = flatten(a.left);
		
		TreeNode temp1 = a.right;	
		a.right = a.left;
		a.left = null;
		TreeNode temp = a;
		while(temp.right != null){
			temp =temp.right;
		}
		temp.right = flatten(temp1);
		
		
		return a;
	}
	
	public static void inorderprint(TreeNode root){
		if(root == null){
			return;
		}
		inorderprint(root.left);
		System.out.println(root.val);
		inorderprint(root.right);
	}
	
}
