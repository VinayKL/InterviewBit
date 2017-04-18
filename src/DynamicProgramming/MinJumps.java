package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MinJumps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input =new ArrayList<Integer>(Arrays.asList(0, 46, 46, 0, 2, 47, 1, 24, 45, 0, 0, 24, 18, 29, 27, 11, 0, 0, 40, 12, 4, 0, 0, 0, 49, 42, 13, 5, 12, 45, 10, 0, 29, 11, 22, 15, 17, 41, 34, 23, 11, 35, 0, 18, 47, 0, 38, 37, 3, 37, 0, 43, 50, 0, 25, 12, 0, 38, 28, 37, 5, 4, 12, 23, 31, 9, 26, 19, 11, 21, 0, 0, 40, 18, 44, 0, 0, 0, 0, 30, 26, 37, 0, 26, 39, 10, 1, 0, 0, 3, 50, 46, 1, 38, 38, 7, 6, 38, 27, 7, 25, 30, 0, 0, 36, 37, 6, 39, 40, 32, 41, 12, 3, 44, 44, 39, 2, 26, 40, 36, 35, 21, 14, 41, 48, 50, 21, 0, 0, 23, 49, 21, 11, 27, 40, 47, 49));
		int result = jump(input);
		System.out.println(result);
	}
	public static int jump(ArrayList<Integer> a) {
		if( a.size() ==1){
	        return 0;
	    }
		int max_reach = 0;
		int reach =0;
		int step =0;
		for(int i=0;i<a.size() ;i++){
			if( max_reach <= i && a.get(i)==0){
				return -1;
			}
			if( i > reach){
				step++;
				reach= max_reach;
			}
			max_reach = Math.max(max_reach, a.get(i)+i);
			//System.out.println(max_reach);
		}
		if( max_reach < a.size()){
			return -1;
		}
		return step;
	}
}
