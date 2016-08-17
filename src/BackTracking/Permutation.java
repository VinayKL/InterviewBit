package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3));
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result = permute(input);
		System.out.println(result);
		
		
	}
	public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		compute(result,0,a.size(),a);		
		return result;
		
	}
	public static void compute(ArrayList<ArrayList<Integer>> result, int a, int b,ArrayList<Integer> temp ){
		if(a==b){
			ArrayList<Integer> temp1 = new ArrayList<Integer>(temp);
			result.add(temp1);
		}
		
		for( int i = a; i<b ; i++){
			swap(a,i,temp);
			compute(result,a+1,b,temp);
			swap(a,i,temp);
		}
	}
	public static void swap(int i , int j, ArrayList<Integer> temp1){
		Integer temp = temp1.get(i);
		temp1.set(i, temp1.get(j));
		temp1.set(j, temp);
	}

}
