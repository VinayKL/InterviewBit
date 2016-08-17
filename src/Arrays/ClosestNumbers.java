package Arrays;

import java.lang.*; 

public class ClosestNumbers 
{
	public static void main(String[] args)
	{
		int length = 10;
		int array[] = {4,45,78,23,89,89,28,98,103,33};
		//{5,4,7,2,1,8,3,6,10,7}
		//{4,45,78,23,89,89,28,58,98,103}
		int stack[] = new int[length*2];
		int tos = -1;
	
		
		
		
		for(int i=1;i<length;i++)
			for(int j=0;j<length-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j]= array[j+1];
					array[j+1]= temp;
				}
			}
		

		
		int temp = Math.abs(array[0]-array[1]);
		stack[++tos] = array[0];
		stack[++tos] = array[1];
		
		for(int i=1;i<length-1;i++)
		{
			if (Math.abs(array[i]-array[i+1]) == 0)
			{
				
				continue;
			}
				
			else if (Math.abs(array[i]-array[i+1]) < temp)
			{
				temp = Math.abs(array[i]-array[i+1]);
				tos = -1;
				stack[++tos] = array[i];
				stack[++tos] = array[i+1];
			}
			
			else if (Math.abs(array[i]-array[i+1]) == temp)
			{
				
				stack[++tos] = array[i];
				stack[++tos] = array[i+1];
			}
			else
			{
				
				continue;
			}
				
		}
		for(int i=0;i<=tos;i++)
		{
			System.out.print(" " + stack[i]);
		}
	}
}