package Math;

import java.util.ArrayList;

public class PrimeSum {
	public static void main(String args[]){
		int input =  4;
		ArrayList<Integer> result = primesum(input);
		System.out.println(result);
	}
	public static ArrayList<Integer> primesum(int a) {
		ArrayList<Integer> result = new ArrayList();
		ArrayList<Integer> prime = new ArrayList();
		boolean primeTest[] = new boolean[a];
		primeTest[0] = false;
		primeTest[1] = false;
		for( int k=2 ; k < a ; k++){
			primeTest[k] = true;
		}
		int test=0;
		for( int i = 2 ; i< primeTest.length ; i++){
			if ( primeTest[i] == true){
				test = i;
				int j=2;
				int multest = j * test;
				while( multest <= a-1){
					primeTest[multest] = false;
					j++;
					multest = j* test;
				}
			}
		}
		for( int i=0; i < primeTest.length ; i++){
			if( primeTest[i] == true){
				prime.add(i);
			}
		}
		for( int i = 0; i< prime.size() ; i++  ){
			int temp = prime.get(i);
			if( prime.contains(a-temp)){
				result.add(temp);
				result.add(a-temp);
				break;
			}
		}
		return result;
    }
}
