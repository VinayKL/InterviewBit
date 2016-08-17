package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthSmallest {
	public static void main(String args[]){
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(2,1,4,3,2));
		int k = 3;
		int i =0;
		i = k_largest(A,k);
		System.out.println(i);
	}
	public static int k_largest(final List<Integer> a, int k){
		ArrayList<Integer> Ac = new ArrayList<Integer>(a);
		int result =0;
		Collections.sort(Ac);
		result = Ac.get(k-1);
		return result;
	}
}
