package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinsSum {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer> ( Arrays.asList(1,3,5));
		int sum =11;
		int result = sum(input,sum);
		System.out.println(result);
	}

	private static int sum(ArrayList<Integer> input, int sum) {
		int DP[] = new int[sum+1];
		DP[0] =0;
		for( int  i = 1 ; i< sum+1; i++){
			DP[i] = Integer.MAX_VALUE;
		}
		for( int i =1 ; i<=sum ; i++){
			for( int j = 0 ; j < input.size() ; j++){
				if( input.get(j) <= i){
					int temp = DP[i - input.get(j)];
					if(  temp+1 < DP[i]){
						DP[i] = temp +1;
					}
				}
			}
		}
		return DP[sum];
	}
	
}
