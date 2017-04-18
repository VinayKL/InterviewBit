package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WaveArray {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		System.out.println(wave(input));
	}
	public static ArrayList<Integer> wave(ArrayList<Integer> a) {
		Collections.sort(a);
		for( int i = 0 ; i < a.size()-1; i = i +2){
			int temp = a.get(i);
			a.set(i, a.get(i+1));
			a.set(i+1, temp);
		}
		return a;
	}
	public static ArrayList<Integer> wave1(ArrayList<Integer> a) {
		for( int i =1 ; i < a.size()-1; i=i+2){
			if( a.get(i) > a.get(i-1)){
				int temp = a.get(i);
				a.set(i, a.get(i-1));
				a.set(i-1, temp);
			}
			if( a.get(i)> a.get(i+1)){
				int temp = a.get(i);
				a.set(i, a.get(i+1));
				a.set(i+1, temp);
			}
		}
		return a;
	}
}	
