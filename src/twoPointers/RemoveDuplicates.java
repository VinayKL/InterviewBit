package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicates {
	public static void main(String args[]){
		System.out.println(removeDuplicates(new ArrayList<Integer>(Arrays.asList( 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3))));
	}
	public static int removeDuplicates(ArrayList<Integer> A) {
		int index = 1;
	    int n = A.size();
	    
	    if (A == null || A.size() == 0)
	        return 0;
	    // best method to delete entries without keeping track of start and length / swapping anything
	    for (int i = 1; i < n; i++) {
	        
	        if (A.get(i).intValue() != A.get(i - 1).intValue()) {
	
	            A.set(index, A.get(i));
	            index++;
	        }
	    }
	    
	    return index;
	}
}
