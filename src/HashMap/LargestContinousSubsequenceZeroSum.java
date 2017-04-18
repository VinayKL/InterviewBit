package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LargestContinousSubsequenceZeroSum {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1 ,2 ,-3 ,3));
		System.out.println(lszero(input));
	}
	public static ArrayList<Integer> lszero(ArrayList<Integer> a) {
		int sum = 0 ;
		int max_length = 0;
		int start_point =0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for( int i=0; i< a.size() ; i++){
			if(a.get(i) ==0 && max_length ==0){
				max_length =1;
				start_point = i;
			}
			sum = sum+a.get(i);
			if( sum ==0){
				//no need to do Math.max because we know it starts from beginning
				max_length = i+1;
				start_point = 0;
			}
			
			Integer res = map.get(sum);
			if( res == null){
				map.put(sum,i);
			}else{
				if( (i-res)> max_length){
					max_length = i-res;
					start_point = res+1;
				}	
			}
			
		}
		
		return  new ArrayList<Integer>( a.subList(start_point, start_point+max_length));
    }
}
