package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Largest {
	public static void main(String args[]){
		String a;
		
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(3, 30, 34, 5, 9));
		
		a = largestNumber(A);
		System.out.println(a);
	}
	// Hint : Given 2 numbers X and Y : check which is greater XY or YX.
	// Order based on that.
	// Use Sort which is O(nlogn) . Collections.sort uses quick sort. so overload
	static String largestNumber(List<Integer> a) {
		StringBuilder numer = new StringBuilder();
		Collections.sort(a, new Comparator<Integer>() {
		    public int compare(Integer o1, Integer o2) {
		    	String s1 = String.valueOf(o1) + String.valueOf(o2);
				String s2 = String.valueOf(o2) + String.valueOf(o1);
				return s2.compareTo(s1);
		    }
		});
		for(int i=0;i<a.size();i++){
				numer.append(a.get(i));	
		}
		// Check if all the digits are equal to 0. first one 0 means all are 0;
		if( a.get(0) ==0){
			return "0";
		}else{
			return numer.toString();
		}
		
	}
}
