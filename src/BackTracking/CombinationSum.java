package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class CombinationSum {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10,1,2,7,6,1,5));
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int sum = 8;
		result = combinationSum(input,sum);
		System.out.println(result);
	}
	public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		
		//HashSet<Integer> hash1 = new HashSet(a);
		
		//ArrayList<Integer> c = new ArrayList<Integer>(hash1);
		Collections.sort(a);

		compute(result,temp,0,b,a);
		
		return result;
	}
	public static void compute(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> temp, int num, int sum ,ArrayList<Integer> a ){
		if(sum ==0){
			ArrayList<Integer> new1 = new ArrayList<Integer>(temp);
			if(result.contains(new1)){
				
			}else{
				result.add(new1);
			}
			
			return;
		}
		for(int i=num;i<a.size();i++){
			if(sum < a.get(i) ){
				return;
			}
			temp.add(a.get(i));
			compute(result,temp,i+1,sum-a.get(i),a);
			temp.remove(temp.size()-1);
		}
	}
}
