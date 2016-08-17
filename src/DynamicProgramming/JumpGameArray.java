package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class JumpGameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input =new ArrayList<Integer>(Arrays.asList(2,3,1,1,4));
		int result = canJump(input);
		System.out.println(result);
	}
	public static int canJump(ArrayList<Integer> a) {
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
		if(map.get(0)==true){
			return 1;
		}
		else{
			return 0;
		}
		
	}
}
