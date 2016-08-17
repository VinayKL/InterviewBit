package Strings;

public class StringCompression 
{
	
	public static void main(String[] args)
	{
		String Str = new String();
		Str = "aaaabbbbccccccd";
		StringBuffer temp = new StringBuffer();
		int Counter = 0;
		System.out.println(Str);
		
		for(int i =0;i<Str.length();i++)
		{
			if(i != (Str.length()- 1) && Str.charAt(i)==Str.charAt(i+1))
					Counter++;
			else
			{
				Counter++;
				String Str1 = new String();
				char a = Str.charAt(i);
				Str1 += a;
				temp.append(Str1);
				String Str2 = new String();
				Str2 += Counter;
				temp.append(Str2);
				Counter = 0;
			}
		}
		System.out.println(temp);
		
	}

}