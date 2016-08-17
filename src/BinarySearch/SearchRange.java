package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchRange {
	public static void main(String args[]){
		List<Integer> input = new ArrayList<Integer>(Arrays.asList(5,7,7,8,8,10));
		System.out.println(searchRange(input,8));
	}
	public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		ArrayList<Integer>result = new ArrayList<Integer>();
		int begin =-1;
		int end = -1;
		int size = a.size();
		if( size ==0 || a == null){
			result.add(begin);
			result.add(end);
			return result;
		}
		int low =0;
		int high = size -1;
		while( low <= high){
			int mid = (low + high) /2;
			//System.out.println(mid);
			if(( mid ==0 || a.get(mid-1)<b ) && a.get(mid)==b){
				begin = mid;
				break;
			}else if(b > a.get(mid)){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		low= 0;
		high = size-1;
		while(low <= high){
			int mid = (low+high)/2;
			if( ( mid == size-1 || a.get(mid+1)== b) && a.get(mid) > b){
				end = mid;
				break;
			}else if( b < a.get(mid)){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}
		
		result.add(begin);
		result.add(end);
		return result;
		
	}
}
