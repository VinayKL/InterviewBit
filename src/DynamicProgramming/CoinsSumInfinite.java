package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinsSumInfinite {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3));
		int sum = 5;
		int result = coinchange2(input,sum);
		System.out.println(result);
		
	}
	public static int coinchange2(ArrayList<Integer> a, int b) {
		int [] sum = new int[b+1];
		int[] possible = new int[b+1];
		sum[0]= 0;
		possible[0] = 0;
		for( int i =1 ; i< b+1; i++){
			sum[i] = Integer.MAX_VALUE;
		}
		for( int i =1 ; i<= b; i++){
			int counter =0;
			for( int j = 0 ; j < a.size() ; j++){
				if( a.get(j) <= i){
					int temp = sum[i-a.get(j)];
					if( temp+1 < sum[i]){
						sum[i] = temp+1;
					}
					counter++;
				}
			}
			possible[i] = counter;
		}
		for( int i=0; i< sum.length ; i++){
			System.out.print(sum[i]+" ");
		}
		System.out.println();
		for( int i=0; i< possible.length ; i++){
			System.out.print(possible[i]+" ");
		}
		System.out.println();
		return possible[b];
    }
}
