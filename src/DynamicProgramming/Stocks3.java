package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stocks3 {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,4,5,7,6,3,2,9));
		int output = maxProfit(input);
		System.out.println(output);
	}
	public static int maxProfit(final List<Integer> a) {
		int result =0;
		int size = a.size();
		if( size <= 1){
			return 0;
		}
		int [] div1 = new int[size];
		int [] div2 = new int[size];
		
		int min = a.get(0);
		div1[0] =0;
		for( int i =1 ; i <size ; i ++){
			 min = Math.min(a.get(i), min);
			 div1[i] = Math.max(div1[i-1], a.get(i)- min);	
		}
		result =0;
		int max = a.get(size-1);
		for( int i = size-2 ; i >=0 ; i--){
			max = Math.max(max, a.get(i));
			div2[i] = Math.max(div2[i+1], max - a.get(i));
		}
		div2[size-1]=0;
		result = div1[0]+div2[0];
		for( int i=0; i< size ;i++){
			int temp = div1[i]+div2[i];
			if( temp > result){
				result = temp;
			}
		}
		return result;
		
	}
	// One more way --> Without DP
	
	public static int maxProfitdup(final List<Integer> a) {
		int result =0;
		int size = a.size();
		if( size <= 1){
			return 0;
		}
		int [] div1 = new int[size];
		int [] div2 = new int[size];
		
		for( int i =0 ; i <size ; i ++){
			int M = 0;
			int N = i;
			div1[i] = compute(a,M,N); 
		}
		for( int i =0 ; i <size ; i ++){
			int M = i;
			int N = size;
			div2[i] = compute(a,M,N); 
		}
		result = div1[0]+div2[0];
		for( int i=1; i< size ;i++){
			int temp = div1[i]+div2[i];
			if( temp > result){
				result = temp;
			}
		}
		return result;
		
	}
	public static int compute( final List<Integer>a, int M , int N){
		int result =0;
		if( M == N){
			return 0;
		}
		int min =a.get(M);
		for(int i = M ;i < N;i++){
			result = Math.max(result, a.get(i)- min);
			min = Math.min(a.get(i), min);
		}
		if(result < 0){
		    return 0;
		}
		return result;
	}
}
