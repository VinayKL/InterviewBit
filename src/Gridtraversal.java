
public class Gridtraversal {
	static Integer width;
	static Integer height;
	static int paths;
	public static void main(String args[])
	{
		width = Integer.parseInt(args[0]);
		height = Integer.parseInt(args[1]);
		paths = uniquePaths(width,height);
		System.out.println(" Unique Paths is "+paths);
		
	}
		public static int uniquePaths(int a, int b) {
		    Integer A[] = new Integer[a];
		    for( int  i =0 ; i< a ; i++)
		    {
		        A[i]= 1;
		    }
		    for(int i =1 ;i < b ;i++)
		    {
		        for( int j =1 ;j< a ;j++)
		        {
		            A[j] =A[j] + A[j-1];
		        }
		    }
		    return A[a-1];
	}
}
