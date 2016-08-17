package Arrays;

import java.util.ArrayList;

public class close {
	static String closestNumbers(int len, String s) {
        int length = len;
    String[] splited = s.split("\\s+");
    ArrayList<Integer> A = new ArrayList<Integer>();
    for( int i =0 ;i< splited.length ; i++){
        Integer K = Integer.valueOf(splited[i]);
        A.add(K);
    }

    for(int i=1;i<A.size();i++)
		for(int j=0;j<A.size()-i;j++)
		{
			if(A.get(j)>A.get(j+1))
			{
				int temp = A.get(j);
				A.set(j, A.get(j+1));
				A.set(j+1, temp);
			}
		}
    
    int stack[] = new int[length*2];
	int tos = -1;

    int temp = Math.abs(A.get(0)-A.get(1));
	stack[++tos] = A.get(0);
	stack[++tos] = A.get(1);
                        
    for(int i=1;i<length-1;i++)
	{
		if (Math.abs(A.get(i)-A.get(i+1)) == 0)
		{
			continue;
		}
			
		else if (Math.abs(A.get(i)-A.get(i+1)) < temp)
		{
			temp = Math.abs(A.get(i)-A.get(i+1));
			tos = -1;
			stack[++tos] = A.get(i);
			stack[++tos] = A.get(i+1);
		}
		
		else if (Math.abs(A.get(i)-A.get(i+1)) == temp)
		{
			
			stack[++tos] = A.get(i);
			stack[++tos] = A.get(i+1);
		}
		else
		{
			
			continue;
		}
			
	} 
     String res = new String();     
    for(int i=0;i<=tos;i++)
	{
		res = res + stack[i];
        res = res +" ";
	}
    return res;

}
	public static void main(String args[])
	{
		String S = "4 45 78 23 89 89 28 98 103 33";
		String k;
		k = closestNumbers(10,S);
		System.out.println(k);
	}
}
