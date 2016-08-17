package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Largest {
	public static void main(String args[]){
		String a;
		//List<Integer> A = new ArrayList<Integer>(Arrays.asList(3,30,34,5,9));
		//List<Integer> A = new ArrayList<Integer>(Arrays.asList(8,89));
		//List<Integer> A = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
		//List<Integer> A = new ArrayList<Integer>(Arrays.asList(980, 674, 250, 359, 98, 969, 143, 379, 363, 106, 838, 923, 969, 880, 997, 664, 152, 329, 975, 377, 995, 943, 369, 515, 722, 302, 496, 124, 692, 993, 341, 785, 400, 113, 302, 563, 121, 230, 358, 911, 437, 438, 494, 599, 168, 866, 689, 444, 684, 365, 470, 176, 910, 204, 324, 657, 161, 884, 623, 814, 231, 694, 399, 126, 426));
		//List<Integer> A = new ArrayList<Integer>(Arrays.asList(472, 663, 964, 722, 485, 852, 635, 4, 368, 676, 319, 412));
		//List<Integer> A = new ArrayList<Integer>(Arrays.asList(472, 485,  4,  412));
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(9, 999,99,9998,9999));
		//A.add(9);
		//A.add(99);
		//A.add(999);
		//A.add(9999);
		//A.add(9998);
		
		a = largestNumber(A);
		System.out.println(a);
	}
	// Hint : Given 2 numbers X and Y : check which is greater XY or YX.
	// Order based on that.
	static String largestNumber(List<Integer> a) {
		String number = null;
		List<Integer> b =new ArrayList(a);
		int temp = 0;
		int temp1 = 0;
		// get the first digit of the number
		for(int i=0; i< b.size()-1 ;i++){
			for(int j =i+1 ; j<b.size(); j++){
				temp = compare((int)b.get(i),(int)b.get(j));
				if( temp ==1){
					temp1 = (int)b.get(i);
					b.set(i,b.get(j));
					b.set(j,temp1);
				}
			}
		}
		for(int i=0;i<b.size();i++){
			if(number == null){
				number = String.valueOf(b.get(i));
			}
			else{
				number = number + String.valueOf(b.get(i));
			}
			
		}
		// Check if all the digits are equal to 0. first one 0 means all are 0;
		if( b.get(0) ==0){
			return "0";
		}else{
			return number;
		}
		
	}
	public static int compare(int a, int b){
		int result;
		int temp1 = 0;
		int temp2 = 0;
		temp1 = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
		temp2 = Integer.valueOf(String.valueOf(b) + String.valueOf(a));
		if(temp2 > temp1){
			return 1;
		}
		else{
			return 0;
		}
	}
	public int getfirstdigit(int num){
		int number1=0;
		number1 = num;
		while (number1 > 9) {
	        number1 /= 10;
	    }
		return number1;
	}
	public static void println(List A){
		int size = A.size();
		for( int i=0;i<size ; i++){
			System.out.println(A.get(i));
		}
		
	}
}
