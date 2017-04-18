package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;



public class MergeSorted {
	public static void main(String args[]){
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(-1,2));
		System.out.println(merge(a,b));
	}
	public static ArrayList merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		int i =0;
		int j=0;
		int M= a.size();
		int N = b.size();
		while(i < a.size() && j <N){
			System.out.println(i + " " + a.size() + " "+a.get(i) + " "+ b.get(j));
			if( a.get(i) <= b.get(j)){
				System.out.println(a);
				i++;
				
			}
			else if(a.get(i) > b.get(j)){
				a.add(i, b.get(j));
				System.out.println(a);
				j++;
				i++;
			}
		}
		while(j <N){
			a.add(i, b.get(j));
			j++;
			M++;
		}
		return a;
	}
}
