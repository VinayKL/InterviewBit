package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FourSum {
public static void main(String aargs[]){
		
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 0, -1, 0, -2, 2));
		
		int k = 0 ;
		ArrayList<ArrayList<Integer>>B = new ArrayList<ArrayList<Integer>>();
		
		B= fourSum(A,k);
		Iterator it = B.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
	}
	public static ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> a, int b) {
		
	}
}
