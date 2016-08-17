package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CoinsInaLine {
	public static void main(String args[]){
		ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(1,100,500,10));
		int result =maxcoin(temp);
		System.out.println(result);
	}
	// recursive without DP
	public static int maxcoin1(ArrayList<Integer> a) {
		int size = a.size();
		int first = 0;
		int last = size-1;
		int result = compute(a,first,last);
		return result;
	}
	private static int compute(ArrayList<Integer> a, int first, int last) {
		if( first > last){
			return 0;
		}
		return Math.max(a.get(first) + Math.min( compute(a, first+2, last),compute(a,first+1,last-1)) , a.get(last) + Math.min(compute(a, first+1, last-1),compute(a,first,last-2)));
	}
	
	// With DP
	public static int maxcoin(ArrayList<Integer> a){
		int size = a.size();
		int DP[][] = new int[size][size];
		int i =0;
		int j = 0;
		while( i> j){
			DP[i][j] = Math.max(a.get(i) + Math.min(a, b))
		}
	}
}
