package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FairWOrkloadProblem {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
		int workers = 5;
		System.out.println(workload(input,workers));
	}
	public static int workload(ArrayList<Integer> input, int workers){
		int result =0;
		int total = 0;
		ArrayList<Integer>workloads = new ArrayList<Integer>();
		for( int i =0 ; i< input.size() ;i++){
			total = total + input.get(i);
		}
		int partmax = total / workers;
		int count = 0;
		for( int i =0; i < input.size(); i++){
			count = count + input.get(i);
			if( count > partmax){
				count = count - input.get(i);
				workloads.add(count);
				count = input.get(i);
			}
		}
		if( count >0){
			workloads.add(count);
		}
		System.out.println(workloads);
		if( workloads.size() > workers){
			workloads.set(workers-1, workloads.get(workers-1)+ workloads.get(workers));
		}
		result = Collections.max(workloads);
		return result;
	}
}
