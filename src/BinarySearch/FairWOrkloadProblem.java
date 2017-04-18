package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FairWOrkloadProblem {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
		int workers = 3;
		System.out.println(workload(input,workers));
	}
	public static int workload(ArrayList<Integer> input, int workers){
		int result =0;
		int total = 0;
		int max =0 ;
		
		ArrayList<Integer>workloads = new ArrayList<Integer>();
		
		// Get the upper and lower bounds to get started with 
		max = input.get(0);
		for( int i =0 ; i< input.size() ;i++){
			total = total + input.get(i);
			if( input.get(i) >= max){
				max =  input.get(i);
			}
		}
		
		System.out.println("Upper is "+ total + " lower is "+ max);
		
		int mid =0; 
		while ( max <  total){
			mid = (max + total) / 2;
			int res =  compute( input, mid);
			System.out.println(res);
			if( res <= workers){
				total = mid;
			}else{
				max = mid+1;
			}
		}
		
		return max-1;
	}
	private static int compute(ArrayList<Integer> input, int marker) {
		int counter =0;
		int value =0;
		for ( int i=0 ;i <input.size() ;i++){
			value = value + input.get(i);
			if( value >= marker){
				counter++;			
				value = input.get(i);
			}
		}
		if( value >0){
			counter++;
		}
		
		return counter;
	}
}
