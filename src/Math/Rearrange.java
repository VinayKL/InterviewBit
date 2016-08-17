package Math;

import java.util.ArrayList;
import java.util.Arrays;

public class Rearrange {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(3,2,0,1));
		System.out.println(input);
		arrange(input);
		System.out.println(input);
	}
	public static void arrange(ArrayList<Integer> a) {
		for( int i=0; i<a.size() ; i++){
			a.set(i, a.get(i)+(a.get(a.get(i))%a.size())*a.size());
		}
		for( int i=0;i<a.size();i++){
			a.set(i, a.get(i)/a.size());
		}
	}
}
