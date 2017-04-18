package Strings;

public class PowerOf2 {
	public static void main(String args[]){
		String input = "147573952589676412928";
		System.out.println(power2(input));
		
	}
	public static int power1(String a) {
		int result =1;
		double input = Double.parseDouble(a);
		while( input != 1){
			double temp = input % 2;
			input = input /2;
			if( temp != 0 ){
				result = 0;
				break;
			}
		}
		return result;
	}
	public static int power2(String a) {
		
		Long result =(long) 1;
		Long input = Long.parseLong( a);
		
		result = (input & (input-1));
		System.out.println(result);
		if( result ==0){
			return 1;
		}else{
			return 0;
		}
	}
	public static int power(String a) {
		double result =1;
		double input = Double.parseDouble(a);
		if( input == 2 ){
			return 1;
		}
		result = Math.log(input)/Math.log(2);
		
		result = result %2;
		if( result ==0){
			return 1;
		}else{
			return 0;
		}
	}
}
