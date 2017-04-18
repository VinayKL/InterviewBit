package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class addOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(plusOne(input));
		

	}
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int carry =1;
		int i = a.size()-1;
		while ( carry !=0 && i>= 0){
			//System.out.println(i);
			if ( a.get(i)+1 ==10){
				a.set(i,0);
				i = i-1;
			}else{
				carry =0;
				a.set(i, a.get(i)+1);
				break;
			}
			
		}
		//System.out.println("here");
		if(carry != 0){
			//System.out.println("here");
			a.add(0,carry);
		}
		//System.out.println(a);
		int counter =0;
		i=0;
		while( a.get(i) == 0){
			counter++;
			i = i+1;
		}
		return new ArrayList<Integer>( a.subList(counter, a.size()));
	}

}
