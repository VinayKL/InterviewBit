package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class PointsOnStraightLine {
	private static final Object Slope = null;
	public static void main(String args[]){
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,1,1));
		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(1,1,1));
		int result =0;
		result = maxPoints(A,B);
		System.out.println(result);
		
		
	}
	public static int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
		int result = 0;
		if(a.size() != b.size()){
			System.out.printf(" Error in the data points");
		}
		if(a.size() == 1){
			return 1;
		}
		
	
		for(int i =0 ; i <a.size() ; i++){
			HashMap<Double,Integer> Map = new HashMap<Double,Integer>(); 
			int x = a.get(i);
			int y = b.get(i);
			for(int j =0 ; j<a.size(); j++){
				if( i == j){
					continue;
				}
				int x1 = a.get(j);
				int y1 = b.get(j);
				//System.out.println(x + "  "+  y +"  "+ x1 + "  " + y1);
				double slope1 =0.0;
				if( y == y1){
					 slope1 = 0.0;
				}
				else{
					slope1 = (1.0 * (y1 - y) )/(x1 - x);
				}
				
				//System.out.println(Math.abs(slope1));
				if(Map.containsKey(slope1)){
					Map.put(slope1, Map.get(slope1)+1);
				}
				else{
					Map.put(slope1,2);
				}	
			}
			int temp =0;
			if ( Map.values().size() == 0){
				temp = 0;
			}else{
				temp= Collections.max(Map.values());
			}
			
			if( temp >= result){
				result = temp;
			}
		}
		return result;
	}
}
