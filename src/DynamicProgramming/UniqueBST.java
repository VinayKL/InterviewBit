package DynamicProgramming;

public class UniqueBST {
	public static void main(String args[]){
		System.out.println(numTrees(2));
	}
	public static int numTrees(int a) {
	    if( a==0 || a==1){
	        return 1;
	    }
	    int count[] = new int[a+1];
	    count[0] =1;
	    count[1] =1;
	    for(int i=2; i<= a ;i++){
	        for( int j=0 ; j<= i-1; j++){
	            count[i] = count[i]+ count[j]*count[i-j-1];
	        }
	    }
	    return count[a];
	}
}
