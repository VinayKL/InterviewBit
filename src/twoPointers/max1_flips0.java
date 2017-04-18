package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class max1_flips0 {
	public static void main(String args[]){
		System.out.println(maxone(new ArrayList<Integer>(Arrays.asList(1,0,0,1,1,0,1,0,1,1,1)),2));
	}
	public static ArrayList<Integer> maxone(ArrayList<Integer> a, int b) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int N= a.size();
		int i=0;
		int left = 0;
		int right  = 0;
		int countZero = 0;
		int max = 0;
		int max_left=0;
		
		while( right < N){
			if( countZero <= b){
				if( a.get(right) ==0){
					countZero++;	
				}
				right++;
			}
			
			if ( countZero > b){
				while(a.get(left) != 0){
					left++;
				}
				left++;
				countZero--;
				
			}
			if( right-left > max ){
				max = right-left;
				max_left = left;
			}
		}
		
		for( int j = max_left ; j< max_left+max ; j++){
			if( a.get(j) == 0){
				result.add(j);
			}
			
		}
		
		return result;
	}
}
