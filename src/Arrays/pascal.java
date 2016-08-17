package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
	      i=0;
	      j=0;
	      int a;
	      Integer temp;
	      a =9;
	      ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	      
	       
	       for ( i =0 ;i<a ;i++)
	       {
	    	   ArrayList<Integer> list1 = new ArrayList<Integer>();
	    	   
	 
	       Integer number; 
	       number = (int) Math.pow(11, i);
	       LinkedList<Integer> stack = new LinkedList<Integer>();
	       while (number > 0) {
	           stack.push( number % 10 );
	           number = number / 10;
	       }

	       while (!stack.isEmpty()) {
	           temp = (stack.pop());
	           list1.add(temp);   
	       }
	       System.out.println("The arraylist contains the following elements: "+ list1);
	       list.add(list1);
	       }
	       
	       System.out.println("The arraylist contains the following elements: "+ list);

	}

}
