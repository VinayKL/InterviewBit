package Strings;

public class Palindrome {
	public static void main(String args[]){
		System.out.println(isPalindrome("1a2"));
	}
	public static int isPalindrome(String a) {
		a = a.toLowerCase();
		int size = a.length();
		if( size == 0){
			return 1;
		}
		int result =1;
		int i =0 ;
		int j = size -1;
		while( i < size && j > 0){
			//System.out.println(i + " "+ j);
			if( !(a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(i)>= '0' && a.charAt(i) <= '9')){
				//System.out.println("i " +i);
				i++;
			}
			else if(!(a.charAt(j) >= 'a' && a.charAt(j) <= 'z'|| a.charAt(j)>= '0' && a.charAt(j) <= '9' )){
				//System.out.println("j "+j);
				j--;
			}
			else if( a.charAt(i) != a.charAt(j)){
				//System.out.println("break");
				result = 0;
				break;
			}
			else if( a.charAt(i)== a.charAt(j)){
				//System.out.println("Continue");
				i++;
				j--;
			}
		}
		return result;
	}
}
