package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class SteppingNumbers {
	public static void main(String args[]){
		int a = 0;
		int b = 200;
		ArrayList<Integer> result = stepnum(a,b);
		System.out.println(result);
	}
	public static ArrayList<Integer> stepnum(int a, int b) {
		ArrayList<Integer> result = new ArrayList();
		if( a ==0 ){
			result.add(0);
			a = 1;
		}
		for( int i = a ; i<= b ; i++){
			//System.out.println(i);
			boolean flag= true;
			Stack<Integer> s = new Stack();
			int cur = i;
			while(cur > 0){
				int temp = cur %10;
				cur = cur /10;
				//System.out.println(" Got "+ temp);
				s.push(temp);
			}
			int v1 = s.pop();
			while(! s.isEmpty()){
				int v2 = s.pop();
				if( Math.abs(v1- v2) != 1){
					flag = false;
					break;
				}
				v1 = v2;
			}
			if( flag == true){
				result.add(i);
			}
		}
		
		return result;
	}
}
