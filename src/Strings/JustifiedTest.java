package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class JustifiedTest {
	public static void main(String args[]){
		ArrayList<String> input = new ArrayList<String>(Arrays.asList("This", "is", "an", "example", "of", "text", "justification."));
		int b = 14;
		ArrayList<String> output = fullJustify(input,b);
		System.out.println(output);
	}
	public static ArrayList<String> fullJustify(ArrayList<String> a, int b) {
		ArrayList<String> output = new ArrayList<String>();
		int temp = 0;
		String tempstr = null;
		int counter = 0;
		int counter2 =0;
		for( int i = 0 ; i< a.size();i++){
			temp = temp+a.get(i).length();
			System.out.println("i is "+i+" temp is"+temp);
			if(temp >= b){
				temp = temp - a.get(i).length();
				i = i-1;
				System.out.println(temp+" "+b);
				int vkl = b - temp;
				counter = (i+1) - counter;
				int vkl1 =vkl / counter;
				System.out.println(vkl+" "+counter+" "+vkl1);
				for( int j=counter2; j < counter ;j++ ){
					System.out.println("In"+j);
					tempstr = tempstr + a.get(j);
					for( int k =0; k< vkl1; k++){
						System.out.println(" entered null spcaes");
						tempstr = tempstr+" ";
					}
				}
				output.add(tempstr);	
				counter2 = i;	
				temp=0;
				tempstr = null;
			}
		}
		
		return output;
		
	}
}
