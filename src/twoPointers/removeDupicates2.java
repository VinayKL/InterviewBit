package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDupicates2 {
	public static void main(String args[]){
		System.out.println(removeDuplicates(new ArrayList<Integer>(Arrays.asList( 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3))));
	}
	public static int removeDuplicates(ArrayList<Integer> A) {
		if (A.size() <= 2)
			return A.size();
 
		int prev = 1; // point to previous
		int curr = 2; // point to current
 
		while (curr < A.size()) {
			if (A.get(curr) == A.get(prev) && A.get(prev) == A.get(prev-1)) {
				curr++;
			} else {
				prev++;
				A.set(prev, A.get(curr));
				curr++;
			}
		}
 
		return prev + 1;
	}
}
