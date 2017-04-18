package Arrays;

import java.util.ArrayList;

public class flip {
	public static void main(String args[]){
		String input = "1101010001";
		System.out.println(flip(input));
	}
	
	
	public static ArrayList<Integer> flip(String A) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int max_so_far = 0;
		int max = 0;
		int head = -1;
		int tail =-1;
		head =0;
		int l = 0;
		int r = A.length();
		
		// Step 1 :- Covert the question into max continuous sub array problem
		ArrayList<Integer> sub = new ArrayList<Integer>();
		
		for ( int i =0 ; i< A.length() ; i++){
			if( A.charAt(i)== '0'){
				sub.add(1);
			}
			else{
				sub.add(-1);
			}
		}
		
		// use the regular kadane algorithm ( also keep track of index ) 
		for ( int i=0; i< sub.size() ; i++){
			
			if (max_so_far+ sub.get(i) >=0){
				max_so_far = max_so_far + sub.get(i);
				tail =i;
			}		
			else {
				max_so_far =0;
				head = i+1;
			}
			if ( max_so_far > max){
				max = max_so_far;
				l = head;
				r = tail;		
			}
			
		}
		if( head == -1 || tail ==-1){
			return result;
		}
		
		result.add(l+1);
		result.add(r+1);
		
		return result;
    }
}
