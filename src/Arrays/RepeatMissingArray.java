package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RepeatMissingArray {
	public static void main(String args[]){
		ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(2,2));
		ArrayList<Integer> output = repeatedNumber(temp);
		System.out.println(output);
	}
	public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		ArrayList<Integer> output = new ArrayList();
		Collections.sort(a);
		long miss =0;
		long rep = 0;
		long v1 =0;
		long v2 =0;
		if( a.get(0) != 1){
			miss = 1;
		}
		if( a.get(a.size()-1) != a.size()){
			miss = a.size();
		}
		for( int i=0; i< a.size()-1 ; i++){
			v1 = a.get(i);
			v2 = a.get(i+1);
			if(v1 == v2 ){
				rep = a.get(i);
			}
			if( v2 - v1 > 1){
				miss = a.get(i)+1;
			}
		}
		output.add((int) rep);
		output.add((int) miss);
		
		return output;
	}
}
