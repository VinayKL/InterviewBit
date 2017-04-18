package DynamicProgramming;
import java.util.ArrayList;
import java.util.Arrays;


public class EqualAveragePartition {
	public static ArrayList<ArrayList<Integer>> avgset(ArrayList<Integer> a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int sum =0;
		for(int i=0;i<a.size();i++){
			sum+=a.get(i);
		}
		if( sum % 2 ==1){
			return result;
		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		boolean res =compute(a,a.size()-1,result , temp,sum/2);	
		System.out.println(res);
		return result;
    }
	// plain Yes or No - Recursive
	public static boolean compute(ArrayList<Integer> a,int k, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp, int sum){
		if( sum ==0){
			return true;
		}
		if( k==0 && sum != 0){
			return false;
		}
		if( a.get(k)>sum){
			return compute(a,k-1,result,temp,sum);
		}
		return compute(a,k-1,result,temp, sum ) || compute(a,k-1,result,temp, sum - a.get(k));	
	}

	// Plain yes or no - Dynamic
	
	public static boolean computedyna(ArrayList<Integer> a){
		boolean res = false;
		
		int sum =0;
		for(int i=0;i<a.size();i++){
			sum+=a.get(i);
		}
		if( sum % 2 ==1){
			return false;
		}
		
		boolean arr[][] = new boolean[(sum/2)+1][a.size()+1];
		
		/*
		 *  here the logic is like this
		 *  X axis will the sum possible and Y axis will tell subsets upto the jth index will give a solution or not
		 */
		
		// first row is true because all the combinations will have a sum =0  as there can null array []
		for( int i =0 ; i< a.size()+1; i++){
			arr[0][i] =true;
		}
		// first column is 0 because any sum cannot be achieved with null array except 0;
		for(int i =1 ; i<= sum/2; i++){
			arr[i][0] = false;
		}
		
		for( int i=1; i<= sum/2; i++){
			for(int j =1; j<= a.size(); j++){
				// if a sum can be achieved with j-1 elements then i can be achieved with j elements also
				arr[i][j] = arr[i][j-1];
				// above statement handled the true cases. Lets check false case. Summ i may not be achieved j-1 elements but with jth element it can be achieved.
				// Check if add a.get(j-1) element will make a difference.(technically jth element) ( j-1 because 0th row and coloumn is there)
				// to check this go back arr[i - a.get(j-1)] [j-1] . why [j-1]? Because i am going back 1 elements size
				// why if loop ? Boundary checking. It should be withing matrix.
				if( i >= a.get(j-1) ){
					arr[i][j] = arr[i][j] || arr[i-a.get(j-1)][j-1];
				}
			}
		}
		
		return arr[sum/2][a.size()];
	}
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList( 1, 7, 15, 29, 11, 9));
		System.out.println(computedyna(input));
	}
}
