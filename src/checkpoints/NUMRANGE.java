package checkpoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NUMRANGE {
	public static void main(String args[]){
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(94, 21, 6, 30, 70, 57, 78, 27, 18, 41, 36, 15, 95, 24, 2, 55, 25, 48));
		int b=46;
		int c =369;
		int res = numRange(A,b,c);
		System.out.println(res);
	}
	public static int numRange(ArrayList<Integer> a, int b, int c) {
		int counter =0;
		int result =0;
		for(int i =0; i< a.size(); i++){
				result = a.get(i);
				if( result >= b && result <= c){
					counter++;
				}
				int k =i+1;
				while(k< a.size()){
					result = result+ a.get(k);
					if( result >= b && result <= c){
						counter++;
					}
					k++;
				}
		}
		
		
		return counter;
	}
}
