package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class maxNonNegativeSubArray {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 5, -7, 2, 3));
		System.out.println(maxset(input));
	}
	public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int Max=0;
		int localMax = 0;
		for( int i=0; i<a.size(); i++){
			localMax = localMax+ a.get(i);
			if(localMax <0){
				localMax = 0;
			}
			if(localMax > Max){
				Max=
			}
		}
	}
}
