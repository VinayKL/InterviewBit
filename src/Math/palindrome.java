package Math;

public class palindrome {
	public static void main(String args[]){
		int input = 121321;
		System.out.println(isPalindrome(input));
	}
	public static boolean isPalindrome(int a) {
		int reverse =0;
		int b =a;
		int size = String.valueOf(a).length();
		while(b>0){
			int temp = b %10;
			b = b/10;
			//System.out.println("temp "+ temp + "size "+size);
			reverse = (int) (reverse + (temp * Math.pow(10,size-1)));
			//System.out.println(reverse);
			size--;
		}
		
		if( a != reverse){
			return false;
		}else{
			return true;
		}
	}
}	
