package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeelement {
	public static void main(String args[]){
		System.out.println(removeElement(new ArrayList<Integer>(Arrays.asList(4,1,1,2,1,3)), 1));
	}
	public static int removeElement(ArrayList<Integer> a, int b) {
	    int index =0;
	    for(int i =0 ; i< a.size() ; i++){
	    	if( a.get(i)!= b){
	    		a.set(index, a.get(i));
	    		index++;
	    	}
	    }
	    return index;
	}
}
