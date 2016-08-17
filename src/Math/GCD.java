package Math;

import java.util.ArrayList;

public class GCD {
	public static void main(String args[]){
		int A= 3;
		int B = 9;
		System.out.println(gcd(A,B));
	}
	public static int gcd(int a, int b) {
		if( a==0){
			return b;
		}
		if( b==0){
			return a;
		}
		int result =1;
		ArrayList<Integer> first = new ArrayList();
		ArrayList<Integer> second = new ArrayList();
		for( int i=1 ; i <= a; i++){
			if( a % i ==0){
				first.add(i);
			}
		}
		for( int i=1 ; i <= b; i++){
			if( b % i ==0){
				second.add(i);
			}
		}
		//System.out.println(first);
		//System.out.println(second);
		int i=0;
		int j=0;
		while( i < first.size() && j < second.size()){
			if( first.get(i) == second.get(j)){
				if( first.get(i) > result){
					result = first.get(i);

				}
				i++;
				j++;
			}
			else if( first.get(i) < second.get(j)){
				i++;
			}
			else if( first.get(i) > second.get(j)){
				j++;
			}
		}
		return result;
	}
}
