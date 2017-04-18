package BinarySearch;

public class PowerXY {
	public static void main(String args[]){
		System.out.println(pow(71045970,41535484,64735492));
	}
	public static int pow(int x, int n, int d) {
		
		long value = compute(x,n,d);
		long s =(long) (value % d);
		System.out.println(s);
		if( s < 0){
			return (int) (s+d);
		}
		else{
			return (int) s;
		}
		
	}
	private static long compute(int x, int n, int d) {
		
		if( x ==0){
			return 0;
		}
		if( n ==0){
			return 1;
		}
		long temp = compute(x,n/2,d);
		long var =0;
		if( n%2 ==0){
			var = temp*temp;
		}else{
			if( x>0){
				var =  x * temp * temp;
			}else{
				var =  (temp*temp) / x;
			}
			
		}
		return var ;
	}
}
