package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class Container {
	public static void main(String args[]){
		System.out.println(maxArea(new ArrayList<Integer>(Arrays.asList(1,5,4,3))));
	}
	public static int maxArea(ArrayList<Integer> a) {
		int max =0;
		int start =0;
		int end = a.size()-1;
		while(start < end){
			max = Math.max(max, (end- start) * Math.min(a.get(start), a.get(end)));
			if(a.get(start)< a.get(end)){
				start++;
			}else{
				end--;
			}
			
		}
		return max;
	}
}
