package HashMap;

import java.util.HashSet;

public class ColorfulNumber {
	public static void main(String args[]){
		System.out.println(colorful(23));
	}
	public static int colorful(int a) {
	    HashSet<Integer> temp = new HashSet<Integer>();
	    String val = String.valueOf(a);
	    // i = length of subsequence
	    for( int i =1 ; i<= val.length(); i++){
	    	// j = to get the actual subsequence
	    	for( int j=0 ; j+i <= val.length() ; j++){
	    		// get the different sub sequences
	    		String curr = val.substring(j,j+i);
	    		int s = Integer.valueOf(curr);
	    		int res = compute(s);
	    		if( temp.contains(res)){
	    			return 0;
	    		}else{
	    			temp.add(res);
	    		}
	    		
	    	}
	    	
	    }
	    return 1;
	}
	public static int compute(int res){
		int pro=1;
		while( res != 0){
			int temp = res %10;
			res = res /10;
			pro = pro*temp;
		}
		return pro;
	}
}
