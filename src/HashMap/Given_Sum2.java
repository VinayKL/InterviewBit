package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Given_Sum2 {
static class Node implements Comparable<Node> {
        
        int left;
        int right;
        
        public Node(int left, int right) {
            this.left = left;
            this.right  = right;
        }
        
        public int compareTo(Node o) {
            if (this.right < o.right)
                return -1;
            if (this.right > o.right)
                return 1;
                
            return Integer.compare(this.left, o.left);
        }
        
    }
    
	public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
	    
	    int sum = B;
	    int diff;
	    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	    int size = A.size();
	    int num;
	    int index;
	    ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Node> node = new ArrayList<>();
	    
	    for (int i = size - 1; i >= 0; i--) {
	        num = A.get(i);
	        diff = sum - num;
	        
	        if (hashMap.containsKey(diff)) {
	            index = hashMap.get(diff);
	            node.add(new Node(i + 1, index + 1));
	        }
	        
	        hashMap.put(num, i);
	        
	    }
	    
	    if (node.size() > 0) {
	        Collections.sort(node);
            res.add(node.get(0).left);
            res.add(node.get(0).right);
	    }
	    
	    return res;
	    
	}
	public static void main(String aargs[]){
		
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3));
		
		int k =-1;
		ArrayList <Integer>B = new ArrayList();
		
		 B= twoSum(A,k);
		 Iterator it = B.iterator();
		 System.out.println(it.next());
		 System.out.println(it.next());
	}
}
