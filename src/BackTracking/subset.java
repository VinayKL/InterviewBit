package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Clone is very important.
// .get(i) is like reference. Never use that if you don't want it to be modified.

// Also to sort arraylist of arraylist we need
// overload Sort
public class subset  {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result = subsets(input);
		System.out.println(result);
	}
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {		
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		// first one is a null . so add
		result.add(temp);
		
		// subsets of every possible size
		for(int i=0;i<a.size() ;i++){
			calculate(result,a.get(i));
		}
		
		Collections.sort(result, new Comparator<ArrayList<Integer>>() {
	        @Override
	        public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
	            int an = a.size();
	            int bn = b.size();
	            for (int i = 0; i < Math.min(an, bn); i++) {
	                int cmp = Integer.compare(a.get(i), b.get(i));
	                if (cmp != 0)
	                    return cmp;
	            }
	            return Integer.compare(a.size(), b.size());
	        }
	    });
		
		
		return result;
	}
	public static void calculate(ArrayList<ArrayList<Integer>> result,int b){
		
		ArrayList<ArrayList<Integer>> new1 = new ArrayList<ArrayList<Integer>>();
		for(int i =0 ;i <result.size() ;i++){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp = (ArrayList<Integer>) result.get(i).clone();
			//System.out.println(temp);
			temp.add(b);
			//System.out.println(temp);
			new1.add(temp);
			
		}
		result.addAll(new1);
		for( ArrayList<Integer>temp : result){
			Collections.sort(temp);
		}
		//System.out.println("Loop done");
		
	}
	
	

	

	
}
