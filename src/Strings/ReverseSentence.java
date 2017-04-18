package Strings;

public class ReverseSentence {
	public static void main(String args[]){
		String input = " Truth is a   complicated paradigm";
		System.out.println(reverseWords(input));
	}
	public static String reverseWords(String a) {
		if( a.length() ==1){
			return a;
		}
		
		char result[] = a.toCharArray();
	    int length = result.length;
	    int i =0;
	    
	    char a1 = result[0];
	    while( i < length){
	    	int start = i ;
	    	int end = 0;
	    	while( i < length && result[i] != ' ' ){
	    		i++;
	    	}
	    	end = i-1;
	    	while( start < end){
	    		Character temp = result[start];
	    		result[start] = result[end];
	    		result[end] = temp;
	    		start++;
	    		end--;
	    	}
	    	i++;
	    }
	    int start =0;
	    int end = result.length-1;
	    while( start < end){
	    	Character temp = result[start];
    		result[start] = result[end];
    		result[end] = temp;
    		start++;
    		end--;
	    }
	    String res =String.valueOf(result);
	    res = res.replaceAll("\\s+", " ");	
	    res = res.trim();
	    return  res;
	}
}
