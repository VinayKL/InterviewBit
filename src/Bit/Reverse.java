package Bit;

public class Reverse {
	public static long reverse(long a) {
	    long sol = 0;
	    for( int i =0; i< 32 ; i++){
	        if( stud(a,i))
	        {
	            sol = (long) (sol + Math.pow(2,31-i));
	        }
	    }
	    return sol;
	}
	public static boolean stud(long a, int k)
	{
	    return (a & ( 1 << k)) !=0;
	}
	public static void main(String args[]){
		long a;
		a = reverse(3);
		System.out.println(a);
	}
}
