package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nextPermutation {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList( 873, 855, 693, 461, 634, 102, 207, 58, 60, 972, 50, 20, 406, 90, 494, 684, 572, 841, 253, 734, 937, 803, 482, 147, 987, 914, 997, 807, 866, 262, 526, 229, 891, 985, 905, 824, 507));
		nextPermutation(input);
		System.out.println(input);
	}
	public static void nextPermutation(ArrayList<Integer> a) {
		int i =0;
		for( i =a.size()-1 ; i>0 ; i--){
			if (a.get(i) <= a.get(i-1)){
				continue;
			}else{
				break;
			}
		}
		
		if( i ==0){
			Collections.sort(a);
			return;
		}
		
		for( i = 0 ; i < a.size()-1 ; i++){
			if (a.get(i) <= a.get(i+1)){
				continue;
			}else{
				break;
			}
		}
		
		if( i ==a.size()-1){
			
			int temp = a.get(a.size()-1);
			a.set(a.size()-1, a.get(a.size()-2));
			a.set(a.size()-2, temp);
			return;
		}
		
		i =a.size()-1 ;
		int ex1 =0;
		while ( i > 0){
			if( a.get(i-1) < a.get(i)){
				ex1 = i-1;
				break;
			}
			i--;
		}
		int min =a.get(ex1+1);
		int ex2 =ex1+1;
		
		for ( int j = ex1+1 ; j < a.size() ; j++){
			
			if( a.get(j) < min && a.get(j) > a.get(ex1)){
				
				min = a.get(j);
				ex2 = j;			
			}
		}

		
		int temp = a.get(ex1);
		a.set(ex1, a.get(ex2));
		a.set(ex2, temp);
		
		
		for ( int j = ex1+1 ; j <  a.size()-1 ; j++){
			for( int k = j+1; k < a.size() ; k++){
				if( a.get(k) < a.get(j)){
					int tem = a.get(k);
					a.set(k, a.get(j));
					a.set(j, tem);
				}
			}
			
		}
		return;
	}
}
