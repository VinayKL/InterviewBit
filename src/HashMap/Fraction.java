package HashMap;

import java.util.HashMap;

public class Fraction {
	public static void main(String args[]){
		int num = 1;
		int den = -2;
		String result = fractionToDecimalA(num,den);
		System.out.println(result);
		
	}
	public static String fractionToDecimal(int numerator, int denominator) {
		if (numerator == 0)
			return "0";
		if (denominator == 0)
			return "";
	 
		String result = "";
	 
		// is result is negative
		if ((numerator < 0) ^ (denominator < 0)) {
			result += "-";
		}
	 
		// convert int to long
		long num = numerator, den = denominator;
		num = Math.abs(num);
		den = Math.abs(den);
	 
		// quotient 
		long res = num / den;
		result += String.valueOf(res);
	 
		// logic for calculating the decimal part
		// remainder = (num % den) * 10;
		// while( remainder != 0){
		//		ans = remainder / den
		// 		remainder = (remainder % den) * 10
		//		append ans to the decimal part
		
		
		// if remainder is 0, return result
		long remainder = (num % den) * 10;
		if (remainder == 0)
			return result;
	 
		// right-hand side of decimal point
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		result += ".";
		while (remainder != 0) {
			// if digits repeat
			if (map.containsKey(remainder)) {
				int beg = map.get(remainder); 
				String part1 = result.substring(0, beg);
				String part2 = result.substring(beg, result.length());
				result = part1 + "(" + part2 + ")";
				return result;
			}
	 
			// continue
			map.put(remainder, result.length());
			res = remainder / den;
			
			result += String.valueOf(res);
			remainder = (remainder % den) * 10;
			
			
		}
	 
		return result;
	}
	public static String fractionToDecimalA(int numerator, int denominator) {
		String result ="";
		//S1: Check if Num or Den is 0
		if(denominator == 0){
			return "";
		}
		if(numerator == 0){
			return "0";
		}
		
		// S2: check for negative sign
		if( (numerator < 0) ^( denominator <0)){
			result+="-";
		}
		// S3: Divide it
		long num = numerator;
		long den = denominator;
		num = Math.abs(num);
		den = Math.abs(den);
		
		long quo = num /den;
		
		result += quo;
		
		// s4: Check if there is a remainder. *10 for future purposes
		
		long remainder = (num % den) * 10;
		if( remainder  ==0){
			return result;
		}
		
		// S5: Add the remainder
		HashMap<Long,Integer> map = new HashMap<Long,Integer>();
		
		result += ".";
		while ( remainder !=0){
			if(map.containsKey(remainder)){
				// if there is a key then there means there is a recurrence
				// S5 B: break the string between before recurrence and after recurrence
				String before = result.substring(0,map.get(remainder));
				String after = result.substring(map.get(remainder));
				result = before+"("+after+")";
				break;
			}else{
				// S5 A: keep on adding till it is not zero. Map is used for recurrence.result.lenght() is starting point of recurrence
				map.put(remainder, result.length());
				long rem = (remainder/ den);
				result += rem;
				remainder  = (remainder % den)*10;
			}
			
		}
		return result;
				
	}
}
