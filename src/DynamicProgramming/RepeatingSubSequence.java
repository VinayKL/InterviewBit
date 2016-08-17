package DynamicProgramming;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RepeatingSubSequence {
	public static void main(String args[]){
		String input = "abbac";
		int result = anytwo(input);
		System.out.println(result);
	}
	public static int anytwo(String a) {
		int result =0;
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for( int i =0; i< a.length() ; i++){
			if(map.containsKey(a.charAt(i))){
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			}else{
				map.put(a.charAt(i), 1);
			}
		}
		StringBuilder b = new StringBuilder();
		for ( int j =0 ; j <a.length() ; j++){
			if( map.get(a.charAt(j)) >1){
				b.append(a.charAt(j));
			}
		}
		b.toString();
		if( isPalindrome(b)){
			int t1 = Collections.max(map.values());
			if( t1 > 2){
				result =1;
			}else{
				result =0;
			}
		}else{
			result =1;
		}
		return result;
	}
	private static boolean isPalindrome(StringBuilder b) {
		for( int i =0 , k = b.length() -1; i< k; i++, k--){
			if( b.charAt(i) != b.charAt(k)){
				return false;
			}
		}
		return true;
	}
}
