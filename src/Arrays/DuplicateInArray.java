package Arrays;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateInArray {
	// DO NOT MODIFY THE LIST
	// Given solution
	/* Collections.sort(A);
	    
	    for (int i = 0; i < A.size() - 1; i++) {
	        if (A.get(i).intValue() == A.get(i + 1).intValue())
	            return A.get(i);
	    }
	    
	    return -1;
	    
	    */
	public static void main(String args[]){
		ArrayList<Integer> a = new ArrayList<Integer>(5);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(2);
		int k;
		k = repeatedNumber(a);
		System.out.println("Repeated number is"+k);
	}
	public static int repeatedNumber(final ArrayList<Integer> a) {
	    HashMap hm = new HashMap();
	    
	    for( int i =0; i< a.size(); i++)
	    {
	        if(hm.containsKey(a.get(i)) )
	        {
	            return a.get(i);
	        }
	        else
	        {
	            hm.put(a.get(i),new Integer(1));
	        }
	    }
	    return -1;
	}
}
