package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
public class WeightSort {
	
	public static String orderWeight(String strng) {
		// your code
      String splits[] = strng.split(" ");
      
     
      ArrayList<Integer> result = new ArrayList<Integer>();
      for(String s:splits){
        result.add(Integer.valueOf(s));
      } 
      Collections.sort(result, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int s1=0;
		    	int s2=0;
		    	while (o1 > 0) {
		            s1 = s1 + o1 % 10;
		            o1 = o1 / 10;
		        }
		    	while (o2 > 0) {
		            s2 = s2 + o2 % 10;
		            o2 = o2 / 10;
		        }
				return (s2>s1?0:1);
			}
		});
      
      
      String output = "";
      for(int j=0; j< result.size(); j++){
        output = output + result.get(j) + " ";
      }
      
      return output.trim();
	}
	public static void main(String args[]){
		System.out.println(orderWeight("100 93 34"));
	}
}
