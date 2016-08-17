package DynamicProgramming;

public class DistinctSubSequences {
	public static void main(String args[]){
		String a = "rabbbit";
		String b = "rabbit";
		int result = numDistinct(a,b);
		System.out.println(result);
	}
	public static int numDistinct(String S, String T) {
		int m = S.length();
		int n = T.length();
		int result[][] = new int[m+1][n+1];
		for( int i =0 ; i <= m ;i++){
			for( int j =0 ; j<= n ; j++){
				if( j==0){
					result[i][j] =1;
				}
				else if( i==0){
					result[i][j] =0;
				}
				else if ( S.charAt(i-1) == T.charAt(j-1)){
					result[i][j] = result[i-1][j-1] + result[i-1][j];
				}
				else{
					result[i][j] = result[i-1][j];
				}
			}
		}
		return result[m][n];
	}
	
}
