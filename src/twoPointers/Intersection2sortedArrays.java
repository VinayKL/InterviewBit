package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection2sortedArrays {
	public static void main(String args[]){
		System.out.println(intersect(new ArrayList<Integer>(Arrays.asList(10000000)),new ArrayList<Integer>(Arrays.asList(10000000))));
	}
	public static ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int start1 = 0;
		int start2 = 0;
		int end1 =a.size();
		int end2 =b.size();
		
		while( start1 < end1 && start2<end2){
			System.out.println(a.get(start1) + "\n"+ b.get(start2));
			if(a.get(start1).intValue() == b.get(start2).intValue() ){
				result.add(a.get(start1));
				start1++;
				start2++;
			}else if(a.get(start1).intValue() >b.get(start2).intValue() ){
			
				start2++;
			}else {
				
				start1++;
			}
		}
		
		return result;
	}
}
