package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MinJumps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input =new ArrayList<Integer>(Arrays.asList(33, 21, 50, 0, 0, 46, 34, 3, 0, 12, 33, 0, 31, 37, 15, 17, 34, 18, 0, 4, 12, 41, 18, 35, 37, 34, 0, 47, 0, 39, 32, 49, 5, 41, 46, 26, 0, 2, 49, 35, 4, 19, 2, 27, 23, 49, 19, 38, 0, 33, 47, 1, 21, 36, 18, 33, 0, 1, 0, 39, 0, 22, 0, 9, 36, 45, 31, 4, 14, 48, 2, 33, 0, 39, 0, 37, 48, 44, 0, 11, 24, 16, 10, 23, 22, 41, 32, 14, 22, 16, 23, 38, 42, 16, 15, 0, 39, 23, 0, 42, 15, 25, 0, 41, 2, 48, 28));
		int result = jump(input);
		System.out.println(result);
	}
	public static int jump(ArrayList<Integer> a) {
		HashMap<Integer,Boolean> map = new HashMap();
		for(int k =0 ; k< a.size()-1; k++){
			map.put(k,false);
		}
		map.put(a.size()-1,true);
		for( int i= a.size()-2; i>=0 ; i--){
			boolean val = false;
			if((a.get(i) + i) == (a.size()-1)){
				val = true;
			}
			int temp =i+ a.get(i);
			for( int j =i+1 ; j<= Math.min(temp, map.size()-1) ; j++){
				if(map.get(j) == true){
					val = true;
				}
			}
			map.put(i, val);
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		compute(0,0,result,a,map);
		//System.out.println(result);
		return Collections.min(result);
	}
	public static void compute(int val,int counter, ArrayList<Integer> result, ArrayList<Integer> a,HashMap<Integer,Boolean> map){
		if( val == a.size() -1 ){
			System.out.println("Adding "+ counter);
			result.add(counter);
		}
		else if( val > a.size()-1){
			return;
		}
		else if( val < a.size()-1){
			int temp = a.get(val);
			System.out.println("Temp is" + temp);
			for( int i = val+1 ; i <= Math.min(val+temp, a.size()-1) ; i++){
				System.out.println(" Current val is" + val+ "calling with " + (val+i) +"and  "+ (counter+1));
				compute(i, counter+1,result, a,map);
				//counter = counter-1;
			}
		}
	}
}
