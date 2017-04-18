package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxProductSubarray {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,3,-2,4,-1));
		int result = maxProduct(input);
		System.out.println(result);
	}
	public static int maxProduct(final List<Integer> A) {
	    if (A == null)
	        return 0;
	    
	    int n;
	    int max = 0;
	    int max_neg = 1;
	    int max_pos = 1;
        
	    n = A.size();
	    
	    for (int i = 0; i < n; i++) {
	        
	        if (A.get(i) == 0) {
	            max_pos = max_neg = 1;
	        } else if (A.get(i) > 0) {
	            max_pos *= A.get(i);
	            if (max_neg * A.get(i) < 0){
	            	 max_neg *= A.get(i);
	            }  
	            max = Math.max(max, max_pos);
	        } else {
	            int temp = max_pos;
	            max_pos = Math.max(1, A.get(i) * max_neg);
	            max_neg = A.get(i) * temp;
	            if (max_pos != 1)
    	            max = Math.max(max, max_pos);
	        }
	        
	    }
	    return max;
	}
}
