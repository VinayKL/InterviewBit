package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _3Sum_0 {
	public static void main(String args[]){
		System.out.println(threeSum(new ArrayList<Integer>( Arrays.asList(-1,0,1,2,-1,-4))));
	}
	public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
		 ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>() ;
		
		Collections.sort(a);
		for( int i =0 ; i< a.size() ; i++){
			int j =i+1;
			int k = a.size()-1;
			while( j< k){
			    int temp = a.get(i)+a.get(j)+a.get(k);
			    if( temp == 0){
			        ArrayList<Integer> temp1 = new ArrayList<Integer>();
			        temp1.add(a.get(i));
			        temp1.add(a.get(j));
			        temp1.add(a.get(k));
			        if( result.contains(temp1)){
			        	
			        }else{
			        	result.add(temp1);
			        }
			        
			    }
			    if( 0 < temp){
			        k--;
			    }else{
			        j++;
			    }
			}
		}
		return result;
	}
}
