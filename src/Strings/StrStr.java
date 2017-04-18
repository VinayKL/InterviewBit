package Strings;

public class StrStr {
	public static void main(String args[]){
		String haystack ="bbbabbabbb";
		String needle = "bba";
		System.out.println(strStr(haystack,needle));
	}
	public static int strStr(final String haystack, final String needle) {
		int result = -1;
		int size = haystack.length();
		int len = needle.length();
		if( size == 0 || len ==0){
			return -1;
		}
		int i=0;
		int j=0;
		while( i < size){
			if( haystack.charAt(i) == needle.charAt(j)){
				// We got a match. Check whether from this point can we reach the end of sub string
				while( i < size && j < len){
					if( haystack.charAt(i) == needle.charAt(j)){
						//Success. Keep going
						i++;
						j++;
					}else{
						// this is not the right solution
						break;
					}
					
				}
				if( j == len){
					// We got the answer
					result = i -j;
					break;
				}
				else{
					// IMPORTANT STEP
					// Resetting 'i' back to the first value after the partial match was found.
					i = i-j+1;
					j=0;
				}
				
			}else{
				i++;
			}
			
		}
		return result;
	}
}
