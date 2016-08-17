package StackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class StackImplemantation {
	ArrayList<Integer> vkl1 = new ArrayList<Integer>();
    int counter = -1;
	Stack<Integer> min1 = new Stack();	      
	 
	
	   public void push(int x) {
		   counter++;
		   vkl1.add(counter, x);
		   if(min1.isEmpty()){
			   min1.push(x);
		   }
		   else if( min1.peek() > x){
			   min1.push(x);
		   }
	    }

	    public void pop() {
	    	if( counter == -1){
	    		
	    	}else{
	    		 int t1 = vkl1.get(counter);
		         counter--;
		         if( min1.peek() == t1){
		        	 min1.pop();
		         }
	    	}

	    }

	    public int top() {
	    	if( counter ==-1){
	    		return -1;
	    	}else{
	    		 return (int) vkl1.get(counter);
	    	}
	       
	    }

	    public int getMin() {
	    	if( counter ==-1){
	    		return -1;
	    	} 
	        return min1.peek();
	    }
	    
}
