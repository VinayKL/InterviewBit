package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class SumPartition {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(3,1,5,9,12));
		boolean result = Partition(input);
		System.out.println(result);
	}
	public static boolean Partition(ArrayList<Integer> input){
		int sum = 0;
		int size = input.size()-1;
		for(int i =0; i <input.size(); i++){
			sum = sum + input.get(i);
		}
		if(sum % 2 != 0){
			return false;
		}
		int sum1 = sum/2;
		return compute(input,size,sum1);
		
	}
	public static boolean compute(ArrayList<Integer> a, int M, int N){
		if( N ==0){
			return true;
		}
		if( M <= 0 && N!=0){
			return false;
		}
		if( N<0){
			return false;
		}
		return compute(a,M-1,N)  ||compute(a,M-1,N-a.get(M));
	}
	public static boolean DPPartition(ArrayList<Integer> input){
		int size = input.size();
		int sum = 0;
		for(int i =0; i <input.size(); i++){
			sum = sum + input.get(i);
		}
		boolean DP[][] = new boolean[(sum/2)+1][size+1];
		for( int j=0 ; j <size+1; j++){
			DP[0][j] = true;
		}
		for( int i=1; i< (sum/2) +1 ; i++){
			DP[i][0]= false;
		}
		for( int i=1; i< (sum/2) +1 ; i++){
			for( int j =1 ; j < size+1; j++){
				DP[i][j] = DP[i][j-1];
				if( i- input.get(j-1) >=0){
					DP[i][j] = DP[i][j] || DP[i-input.get(j-1)][j-1];
				}
				
			}
		}
		return DP[(sum/2)][size];
	}
}
