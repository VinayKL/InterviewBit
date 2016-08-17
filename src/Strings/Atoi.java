package Strings;

public class Atoi {
	public static int atoi(final String a) {
		int result =0;
		int temp =0;
		int flag=0;
		for( int i =0 ;i < a.length(); i++)
		{
			temp = a.charAt(i);
			if( temp == 45)
			{
				flag =1;
				continue;
			}
			else if( temp == 43)
			{
				//System.out.println("I am here");
				continue;
			}
			if( temp < 48 || temp > 58)
			{
				continue;
			}
			else 
			{
			//System.out.println(temp);
			result = (int) (result + ( (temp -48) * Math.pow(10,(a.length() -(i+1)))));
			//System.out.println(result);
			}
		}
	    if( flag == 1)
	    {
	    	return -result;
	    }
	    return result;
	    
	}
	public static void main(String args[])
	{
		String S = " +7";
		int k;
		k = atoi(S);
		System.out.println(k);
	}
}
