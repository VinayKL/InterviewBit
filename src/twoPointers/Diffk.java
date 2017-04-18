package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Diffk {
	public static void main(String args[]){
		System.out.println(diffPossible(new ArrayList<Integer>( Arrays.asList(1,3,5)), 4));
	}
	public static int diffPossible(ArrayList<Integer> a, int b) {
		int result =0;
		HashSet<Integer> map = new HashSet<Integer>();
		
		for( int i=0; i< a.size(); i++){
			if(map.contains(a.get(i))){
				return 1;
			}else{
				map.add(b + a.get(i) );
			}
		}
		
		
		return result;
	}
	
}

/* O(1) Space Complexity
 * Nice Approach. look at the movement of start and end
 *
 * 		int start, end;
	    int n = A.size();
	    int diff;
	    
	    start = 0;
	    end = 1;
	    
	    while (start <= end && end < n) {
	        
	        diff = A.get(end) - A.get(start);
	        
	        if (diff == B && start != end) {
	            return 1;
	        } else if (diff <= B) {
	            end++;
	        } else {
	            start++;
	        }
	    }
 */

