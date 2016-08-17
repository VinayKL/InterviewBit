package Arrays;

import java.util.ArrayList;

public class prettyMatrix {
		public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
		    int size =( a *2 ) - 1;
		    int[][] A = new int[size][size];
		    ArrayList<ArrayList<Integer>> Ab = new ArrayList<ArrayList<Integer>>();
		    int upper =size -1;
		    int lower = 0;
		
		    for( int k = 0 ; k < size ; k++)
		    {
		    for( int i =k ; i< size -k ; i++)
		    {
		        for( int j =k ; j < size - k ;j++)
		        {
		            if( i == lower || j == lower || i == upper || j == upper)
		            {
		               A[i][j] = a  ;
		            }
		            
		            
		        }
		    }
		    a =a -1;
	        upper = upper -1;
	        lower = lower +1;
		    }
		    
	     
			
			
		    for( int i =0;i<size ; i++)
		    {
		    	ArrayList<Integer> inner = new ArrayList<Integer>();
		    	for( int j=0; j< size ; j++)
		    	{
		    		inner.add(A[i][j]);
		    	}
		    	Ab.add(inner);
		    }
		    return Ab;
		}
		public static void main(String args[]){
			ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
			B = prettyPrint(4);
			System.out.println(B);
		}
		
}
