package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class diffCount {
	public static void main(String args[]){
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(80, 87, 75, 11, 57, 31, 88, 48, 15, 77, 44, 22, 82, 41, 52, 52, 99, 40, 84, 21, 30, 100, 61, 48, 96, 64, 73, 79, 84, 95, 14, 48, 80, 90, 26, 97, 33, 88, 25, 84, 85, 57, 44, 91, 64, 16, 39, 30, 18, 17, 84, 54, 54, 50, 24, 13, 100, 80, 69, 22, 96, 12, 68, 65, 40, 47, 70, 48, 53, 10, 39, 61, 56, 11, 46, 18, 94, 49, 59, 31, 30, 16, 64, 90, 90));
		int b =0;
		int c = 1;
		b = diffPossible(a, c);
		System.out.println(b);
	}
	public static int diffPossible(final List<Integer> a, int b) {
	    Collections.sort(a);
	    System.out.println(a);
	    System.out.println(a.size());
	    int temp =0;
	    int counter =0;
	    String pos = null;
	    Map m1 = new HashMap(); 
	    for(int i=0; i<a.size() ; i++){
	    	m1.put(a.get(i), String.valueOf(i));
	    }
	    int temp1 =0;
	    for( int i =0 ; i< a.size(); i++){
	        temp = a.get(i);
	        //pos = Collections.binarySearch(a, temp -b);
	        pos=  (String) m1.get(temp-b);
	        if( pos != null)
	        {
	        	temp = Integer.valueOf(pos);
	        }
	        
	        if( pos !=  null){
	            counter++;
	        }
	    }
	    return counter;
	}
}
