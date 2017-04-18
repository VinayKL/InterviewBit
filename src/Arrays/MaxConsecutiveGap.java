package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxConsecutiveGap {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(10);
		input.add(5);
		
		System.out.println(maximumGap(input));
	}
	public static int maximumGap(final List<Integer> a) {
		if( a.size()<2){
			return 0;
		}
		Collections.sort(a);
		ArrayList<Integer> diff = new ArrayList<Integer> ();
		for( int i=0; i< a.size()-1 ;i++){
			diff.add(a.get(i+1)- a.get(i));
		}
		return Collections.max(diff);	
	}
}
