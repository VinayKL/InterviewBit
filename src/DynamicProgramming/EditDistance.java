package DynamicProgramming;

public class EditDistance {
	public static void main(String args[]){
		String a = "aaa";
		String b = "aa";
		int result = minDistance(a,b);
		System.out.println(result);
	}
	public static int minDistance(String a, String b) {
		int m = a.length();
		int n = b.length();
		int result = compute(a,b,m,n);
		return result;
	}
	public static int compute(String a, String b, int m , int n){
		int dp[][] = new int[m+1][n+1];
		for( int i =0 ; i <= m ; i++){
			for( int j=0 ; j<= n ; j++){
				if(i ==0){
					dp[i][j] = j;
				}
				else if( j ==0){
					dp[i][j]= i;
				}
				else if( a.charAt(i-1) == b.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1];
				}else{
					dp[i][j] = 1+ min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]);
				}
			}
		}
		return dp[m][n];
		
	}
	private static int min(int v1, int v2, int v3) {
		if( v1 < v2 && v1 <v3){
			return v1;
		}else if( v2< v1 && v2 < v3){
			return v2;
		}else{
			return v3;
		}
	}
	
}
