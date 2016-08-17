package Strings;

import java.util.HashMap;

public class RomanToInteger {
	public static void main(String args[]){
		String input = "XX";
		int result = romanToInt(input);
		System.out.println(result);
	}
	public static int romanToInt(String a) {
		int result = 0;
		String s = null;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('I',1);
		map.put('L',50);
		map.put('V',5);
		map.put('X',10);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		result=map.get(a.charAt(0));
		//System.out.println(result);
		for(int i=1; i<a.length();i++){
			if(map.get(a.charAt(i)) > map.get(a.charAt(i-1))){
				//System.out.println(result+ " " + map.get(a.charAt(i)) + " " +map.get(a.charAt(i-1)));
				result = result + map.get(a.charAt(i)) -(2 *map.get(a.charAt(i-1)));
				
			}else{
				result = result + map.get(a.charAt(i));
				//System.out.println("here"+result);
			}
			
		}
		
		
		return result;
	}
}
