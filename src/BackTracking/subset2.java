package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class subset2 {
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(5,4));
		result = subsetsWithDup(input);
		System.out.println(result);
		
	}
	public static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		result.add(temp);
		Collections.sort(a);
		for( int j=0 ;j < a.size() ; j++){
			compute(result,temp,a,a.get(j),0);
		}
		Collections.sort(result, new Comparator<ArrayList<Integer>>(){

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				// TODO Auto-generated method stub
				for( int i =0 ; i< Math.min(o1.size(), o2.size()); i++){
					
					int cmp = Integer.compare(o1.get(i), o2.get(i));
	                if (cmp != 0)
	                    return cmp;

					
				}
				return Integer.compare(o1.size(), o2.size());
				
			}
			
		}
		);
		return result;
	}
	public static void compute(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> temp,ArrayList<Integer> a,int element,int counter){
		ArrayList<ArrayList<Integer>> new1 = new ArrayList<ArrayList<Integer>>();	
		for( int i=0; i<result.size();i++){
				ArrayList<Integer> temp2 = new ArrayList<Integer>();
				temp2 = (ArrayList<Integer>) result.get(i).clone();
				temp2.add(element);
				
					new1.add(temp2);
			
				//compute(result,temp,a,element,i+1);
			}
		for(ArrayList A: new1){
			if(result.contains(A)){
				
			}else{
				result.add(A);
			}
		}
		
		return;
	}
}
