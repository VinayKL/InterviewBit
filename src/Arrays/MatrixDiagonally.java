package Arrays;

public class MatrixDiagonally {
	public static void main(String[] args){
		Integer Matrix[][] =new Integer [4][5];
		int i,j;
		int k=1;
		int RC =4;
		int CC = 5;
		for(i = 0;i<RC;i++)
		{
			for(j =0 ; j< CC ; j++)
			{
				Matrix[i][j] = k++;
			}
		}
		System.out.println("We have the matrix initialized");
		for(i = 0;i<RC;i++)
		{
			for(j =0 ; j< CC ; j++)
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}
		// step 1: go row step
		// Stopping is when we reach 1st row. So k> 0 
		for( i = 0; i< RC ; i++)
		{
			j =0;
			k = i;
			while(k>= 0)
			{
				System.out.print(Matrix[k][j]+" ");
				k--;
				j++;
			}
			System.out.println();
		}
		
		// step 2 - Go to Coloumn step
		// Stopping is when we reach last colouimn. So j< CC
		for( i = 1; i< CC ; i++)
		{
			j =i;
			k = 3;
			while(j< 5)
			{
				System.out.print(Matrix[k][j]+" ");
				k--;
				j++;
			}
			System.out.println();
		}
		
	}
}
