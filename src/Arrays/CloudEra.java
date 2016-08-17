package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class CloudEra {

	public static void main(String args[]) {
		int k = Sum();
		System.out.println(k);
	}
	public static int Sum()
	{
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,4};

		ArrayList <Integer> A = new <Integer> ArrayList();

		for( int i =0 ;i< arr1.length ;i++)
		{
		    for( int j =0 ; j <arr2.length ; j++)
		     {
		           if( arr1[i] == arr2[j])
		            {
		                 A.add(arr1[i]);
		            }
		     }
		}
		if( A.size() == 0)
		{
		   return -1;
		}
		Collections.sort(A);
		return A.get(0);
		}
}
