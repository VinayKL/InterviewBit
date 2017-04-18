package Strings;

public class LongestPalindromeString {
	public static void main(String args[]){
		System.out.println(longestPalindrome1("abb"));
	}
	public static String longestPalindrome(String a) {
			int table[][] = new int[a.length()][a.length()];
			int size =  a.length();
			int start =0;
			int max = 1;
			
			for( int i =0 ;i < size ; i++){
				for(int j=0;j<size; j++){
					table[i][j]=0;
				}
			}
			
			for( int i =0 ; i < size ;i++ ){
				table[i][i] = 1;
			}
			
			for( int i =0; i< size-1 ;i++){
				if( a.charAt(i) == a.charAt(i+1)){
					
					table[i][i+1] = 1;
					start =i;
					max = 2;
				}
			}
			
			for ( int k=3 ; k < size ; k++){
				for( int i =0 ; i< size-k+1 ; i++){
					int j = i+k-1;
					
					if( table[i+1][j-1] ==1 && a.charAt(i) == a.charAt(j)){
						table[i][j] =1;
						if( k > max){
							start= i;
							max =k;
						}
					}
				}
			}
			//printtable(table,size);
			
			return a.substring(start,start+max);
	}
	public static void printtable(int [][]result,int size){
		for( int i =0 ;i < size ; i++){
			for(int j=0;j<size; j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static String longestPalindrome1(String a) {
		int size =  a.length();
		int maxstart =0;
		int max = 1;
		
		
		for( int i=1; i< size; i++){
			// even
			int start = i-1;
			int end =i;
			int counter=0;
			while( start>=0 && end <size && a.charAt(start)==a.charAt(end)){
				
				counter= counter+2;
				if( counter > max){
					max = counter;
					maxstart = start;
					//System.out.println(maxstart+" "+" "+ max+ " "+a.substring(maxstart,maxstart+max));
				}	
				start--;
				end++;
			}
			
			// odd
			int start1 = i-1;
			int end1 = i+1;
			int counter1=1;
			while( start1>=0 && end1 <size && a.charAt(start1)==a.charAt(end1)){
				
				counter1= counter1+2;
				if( counter1 > max){
					max = counter1;
					maxstart = start1;
					//System.out.println(a.substring(maxstart,maxstart+max));
				}
				start1--;
				end1++;
			}
		}
		
		return a.substring(maxstart,maxstart+max);
		
	}
	
}
