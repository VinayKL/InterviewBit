package DynamicProgramming;


// Question : Max only one transaction

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stocks1 {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,4));
		int output = maxProfit(input);
		System.out.println(output);
	}
	public static int maxProfit(final List<Integer> a) {
		int result =0;
		if(a.size() <= 1 ){
		    return 0;
		}
		int min =a.get(0);
		for(int i =0 ;i < a.size();i++){
			result = Math.max(result, a.get(i)- min);
			min = Math.min(a.get(i), min);
		}
		if(result < 0){
		    return 0;
		}
		return result;
	}
}
