package Strings;

public class compression {
	public static void main(String args[]){
		String s = "aaaabbbc";
		String res = compress(s);
		System.out.println(res);
	}
	public static String compress( String s){
		String result = null;
		
		int x = s.length();
		int count =0;
		//int i =0;
		for( int i =0 ; i< s.length() ; i++){
			while(s.charAt(i) == s.charAt(i+1))
			{
				i++;
				count++;
			}
			if( result ==null){
				String w = String.valueOf(count);
				result =s.charAt(i) + w;
			}
			else{
				String w = String.valueOf(count);
				result = result+ s.charAt(i) +w;
			}		
		}
		return result;
	}

}
