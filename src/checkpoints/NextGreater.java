package checkpoints;

import java.util.ArrayList;
import java.util.Arrays;

public class NextGreater {
	public static void main(String args[]){
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(7,6,5,4,3));
		ArrayList<Integer> b = new ArrayList<Integer> ();
		b = nextGreater(a);
		System.out.println(b);
	}
	public static ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
	    ArrayList<Integer> Ab = new ArrayList<Integer>();
	    int temp =0;
	    int temp1=0;
	    for(int i =0 ; i< a.size() ;i++ ){
	    	
	        temp = a.get(i);
	        temp1= -1;
	        for( int j =i+1; j< a.size() ; j++){
	            
	            if( a.get(j) > temp)
	            {
	               temp1 = a.get(j);
	               break;
	            }
	        }
	        Ab.add(temp1);
	    }
	    
	    return Ab;
	}
}
