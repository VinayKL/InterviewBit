package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstMissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList b = new ArrayList(Arrays.asList(1,1,1));
		//ArrayList b = new ArrayList(Arrays.asList(1,2,0));
		ArrayList b = new ArrayList(Arrays.asList(3,4,-1,1));
		//ArrayList b = new ArrayList(Arrays.asList(-8,-7,-6));
		//ArrayList b = new ArrayList(Arrays.asList(-8,-7,-6,0,1));
		int result = 0;
		result = firstMissingPositive(b);
		System.out.println(result);
		
	}
	public static int firstMissingPositive(ArrayList<Integer> a) {
		int result = 0;
		// logic
		
		Collections.sort(a);
		int smallest =0;
		int k =0;
		if( a.size() ==1){
			if(a.get(k) > 0){
				smallest = a.get(k);
			}
			else{
				smallest =0;
			}
		}
		
		for( int i =0 ; i< a.size()-1; i++){
			System.out.println(Math.abs(a.get(i))+ " " + Math.abs(a.get(i+1)));
			if( Math.abs(a.get(i)) <= Math.abs(a.get(i+1))){
				if( a.get(i) == 0){
					smallest = a.get(i+1);
					break;
				}
				smallest = a.get(i);
				break;
				
			}
			
		}
		System.out.println(smallest);
		int j =0;
		j = a.indexOf(smallest);
		if(smallest!=0){
			if( j == a.size()-1){
				result = a.get(j);
			}
			for( int i = j; i<a.size()-1; i++){
				if( (a.get(i+1) - a.get(i)) != 1){
					result= a.get(i);
					break;
				}
				else{
					result= a.get(i+1);
				}
			}

		}
				return result+1;
	}
}
