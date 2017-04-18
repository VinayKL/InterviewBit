package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lengthOflastWord {
	public static void main(String args[]){
		String s = "HelloW";
		int len =0;
		
		len =length(s);
		System.out.println(len);
	}
	private static int length(String s) {
		
		int len = s.length();
	
		
		
		List a = null;
		String.valueOf(a.get(0));
		Collections.sort(a);
		// TODO Auto-generated method stub
		String[] splitArray = s.split("\\s+");
		int result =0;
		int size = splitArray.length -1;
		result = splitArray[size].length();
		
		
		return result;
	}
	
	
}
