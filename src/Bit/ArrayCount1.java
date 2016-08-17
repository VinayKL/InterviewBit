package Bit;

import java.util.ArrayList;
import java.util.List;

public class ArrayCount1 {
	
	public static int singleNumber(final List<Integer> a) {
	    int result=0;
	    for(int i =0 ; i< a.size() ;i++)
	    {
	        result = result ^ a.get(i);
	        //System.out.println(result);
	    }
	    return result;
	}
	public static void main(String args[]){
		int result;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(5);
		A.add(3);
		A.add(5);
		A.add(3);
		
		result = singleNumber(A);
		System.out.println(result);
		
	}
}
