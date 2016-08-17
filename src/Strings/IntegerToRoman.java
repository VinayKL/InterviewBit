package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntegerToRoman {
	public static void main(String args[]){
		int input = 3;
		String result = intToRoman(input);
		System.out.println(result);
	}
	public static String intToRoman(int a) {
		String result=null;
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1,"I");
		map.put(4, "IV");
		map.put(5,"V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100,"C");
		map.put(400, "CD");
		map.put(500,"D");
		map.put(900, "CM");
		map.put(1000,"M");
		ArrayList<Integer> factors = new ArrayList<Integer>(Arrays.asList(1000,900,500,400,100,90,50,40,10,9,5,4,1));
		int divident =0;
		while(a!= 0){
			for( int i=0;i<factors.size();i++){
				if(factors.get(i) <=a ){
					//divident = a / factors.get(i);
					a = a - factors.get(i);
					//.out.println(divident+ " "+ a + " " + factors.get(i));
					if(result == null){
						result = map.get(factors.get(i));
					}else{
						result = result + map.get(factors.get(i));
					}
					
					break;
				}
			}
		}
		return result;
	}
}
