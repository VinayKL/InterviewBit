package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestSubSequence {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15));
		int result = lis(input);
		System.out.println(result);
	}
	public static int lis(final List<Integer> a) {
		int size = a.size();
		int[] result = new int[size];
		for( int i=0; i< result.length ; i++){
			result[i] = 1;
		}
		for( int i =1 ; i < result.length ; i++){
			int max = result[i];
			for( int j = 0 ; j< i; j++){
				if( a.get(j) < a.get(i)){
					if(  result[i]+result[j] > max){
						max = result[i]+result[j];
					}
					
				}
			}
			result[i] = max;
		}
		int max = result[0];
		for( int i=1;i<result.length; i++){
			if( result[i] > max){
				max= result[i];
			}
		}
		return max;
	}
	
}
