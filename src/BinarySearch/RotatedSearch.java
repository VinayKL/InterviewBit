package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatedSearch {
	public static void main(String args[]){
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100));;
		System.out.println(search(A,202));
		
	}	
	public static int search(final List<Integer> a, int b) {
		int start =0 ;
		int end = a.size()-1;
		while(start <= end){
			
			int mid = start+(end-start) /2;
			//System.out.println(start + " "+ end + " "+ a.get(start) + " " + a.get(end)+" "+a.get(mid));
			if( b == a.get(mid)){
				return mid;
			}else if(a.get(start) <= a.get(mid)){
				if(a.get(start)<= b && b < a.get(mid)){
					end = mid-1;
				}else{
					start = mid+1;
				}
			}else{
				if(a.get(mid) < b && b <= a.get(end) ){
					start = mid+1;
				}else{
					end = mid-1;
				}
			}
		}
		return -1;
		
	}
	
}
