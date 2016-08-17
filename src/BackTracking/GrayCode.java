package BackTracking;

import java.util.ArrayList;

public class GrayCode {
	public static void main(String args[]){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int input = 10;
		result = grayCode(input);
		System.out.println(result);
	}
	public static ArrayList<Integer> grayCode(int a) {
		
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("0");
		temp.add("1");
		for(int i=0 ; i< a-1 ; i++){
			compute(temp);
			
		}
		ArrayList<Integer> result = new ArrayList(temp);
		return result;
	}
	public static void compute(ArrayList<String> temp){
		
		
		ArrayList<String> L1 = new ArrayList<String>(temp);
		ArrayList<String> L2 = new ArrayList<String>();
		
		for(int i=0;i<temp.size(); i++){
			L2.add(i, temp.get(temp.size()-1-i));
		}
		
		for(int j=0;j<L1.size();j++){
			String res = "0" + String.valueOf(L1.get(j));
			L1.set(j, res);
		}
		
		for(int j=0;j<L2.size();j++){
			L2.set(j, "1" + String.valueOf(L2.get(j)));
		}
		
		temp.clear();
		temp.addAll(L1);
		temp.addAll(L2);
	}
}
