package Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxOccuringCharacter {
	public static void main(String args[]){
		String input = " test";
		System.out.println(Compute(input));
	}

	private static char Compute(String input) {
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for( int i =0 ;i <input.length() ; i++){
			Character ch = input.charAt(i);
			if( map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}else{
				map.put(ch, 1);
			}
		}
		int max  = 0;
		Character result = null;
		for( Entry<Character, Integer> entry : map.entrySet()){
			int temp = entry.getValue();
			if( temp >= max){
				max = temp;
				result = entry.getKey();
			}
		}
		return result;
	}
	
}
