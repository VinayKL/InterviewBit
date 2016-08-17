package Bit;

public class Division {
	public static int divide(int dividend, int divisor) {
		int result=0;
		while( dividend > divisor)
		{
			divisor = divisor << 1 ;
			result++;
			if( result > Integer.MAX_VALUE)
			{
				return Integer.MAX_VALUE;
			}
		}
		
		return result;
	}
	public static void main(String args[]){
		long a;
		a = divide(2147,1);
		System.out.println(a);
	}
}
