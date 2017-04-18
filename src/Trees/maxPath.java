package Trees;

public class maxPath {
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		TreeNode c1 = new TreeNode(2);
		TreeNode c2 = new TreeNode(3);
		TreeNode c3 = new TreeNode(96);
		TreeNode c4 = new TreeNode(99);
		TreeNode c5 = new TreeNode(97);
		
		root.left = c1;
		root.right = c2;
		//c1.left = c3;
		//c1.right = c4;
		//c2.left = null;
		//c2.right = null;
		c3.left =null;
		c3.right = c5;
		c4.left = null;
		c4.right = null;
		c5.left = null;
		c5.right = null;
		
		System.out.println(maxPathSum(root));
		
		
	}
	public static int maxPathSum(TreeNode a) {
		int result[] = new int[100];
		result[0]= Integer.MIN_VALUE;
		compute( a,result);
		return result[0];
	    
	}
	private static int compute(TreeNode a, int[] result) {
		// TODO Auto-generated method stub
		if( a== null){
			return 0;
		}
		int left = compute(a.left , result);
		int right = compute(a.right,result);
		
		int res = Math.max(a.val, Math.max(a.val + left, a.val + right));
		
		result[0]= Math.max(result[0], Math.max(res,a.val+right+left));
		
		return res;
	}
}
