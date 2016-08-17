package Bit;

import java.util.ArrayList;
import java.util.List;

public class arraycount {
	
	public static int singleNumber(final List<Integer> a) {
	    int result=0;
	    int ones = 0;
	    int twos= 0;
	    int common =0;
	    for(int i =0 ; i< a.size() ;i++)
	    {
	        twos = twos | (ones & a.get(i));
	        ones = ones ^ a.get(i);
	        common = ~( ones & twos);
	        ones = ones & common;
	        twos = twos & common;
	        //System.out.println(result);
	    }
	    return ones;
	}
	public static void main(String args[]){
		int result;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(3);
		
		result = singleNumber(A);
		System.out.println(result);
		
	}
}
