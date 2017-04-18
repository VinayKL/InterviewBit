package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Median2Arrays {
	public static void main(String args[]){
		System.out.println(findMedianSortedArrays(new ArrayList<Integer>(Arrays.asList(1,4,5)),new ArrayList<Integer>(Arrays.asList(2,3))));
	}
	public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
		//System.out.println(a);
		//System.out.println(b);
		if( a.size() ==0){
			return -1;
		}
		if( a.size()==1){
			return a.get(0)+b.get(0) /2;
		}
		if(a.size() == 2){

			return ((double)Math.max(a.get(0), b.get(0)) + Math.min(a.get(1), b.get(1)))/(double)2;
		}
		
		int m1 = median(a);
		int m2 = median(b);
		
		//System.out.println(m1 + " "+ m2);
		 
		if( m1== m2){
			return m1;
		}
		
	
		if( m1 > m2){
			
			return findMedianSortedArrays(a.subList(0,(int)Math.ceil(a.size()/2)+1),b.subList((int)Math.ceil(a.size()/2), a.size()));
		}else{
			return findMedianSortedArrays(a.subList((int)Math.ceil(a.size()/2), a.size()), b.subList(0, (int)Math.ceil(b.size()/2+1)));
		}
	}
	public static int median(List<Integer> a){
		if (a.size() % 2 ==0){
			return a.get(a.size()/2)+a.get(a.size()-1) / 2;
		}else{
			return a.get(a.size()/2);
		}
	}
}
