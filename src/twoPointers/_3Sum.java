package twoPointers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _3Sum {
	public static void main(String args[]){
		System.out.println(threeSumClosest(new ArrayList<Integer>( Arrays.asList(-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3)), -1));
	}
	public static int threeSumClosest(ArrayList<Integer> a, int b) {
		int result =0 ;
		
		Collections.sort(a);
		int min =Integer.MAX_VALUE;
		for( int i =0 ; i< a.size() ; i++){
			int j =i+1;
			int k = a.size()-1;
			while( j< k){
			    int temp = a.get(i)+a.get(j)+a.get(k);
			    if( temp == b){
			        return b;
			    }
			    int diff = Math.abs(temp -b);
			    if( diff < min){
			        min = diff;
			        result = temp;
			    }
			    if( b < temp){
			        k--;
			    }else{
			        j++;
			    }
			}
		}
		return result;
	}
}
