package BackTracking;

import java.util.ArrayList;

public class Combinations {
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int n = 4;
		int k = 4;
		result = combine(n,k);
		System.out.println(result);
	}
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		compute(result,n,k,1,temp);
		return result;
	}
	public static void compute(ArrayList<ArrayList<Integer>> result, int n, int k, int counter,ArrayList<Integer> temp){
		if(k==0){
			ArrayList<Integer> temp1 = new ArrayList(temp);
			result.add(temp1);
			return;
		}
		for(int i =counter ; i<= n ; i++){
			temp.add(i);
			compute(result,n,k-1,i+1,temp);
			temp.remove(temp.size()-1);
		} 
	}
}
