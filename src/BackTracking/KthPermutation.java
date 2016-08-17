package BackTracking;

import java.util.ArrayList;

public class KthPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int k = 28;
		//String input = "1234";
		
		String result = getPermutation(n,k);
		System.out.println(result);
	}
	public static String getPermutation(int n, int k) {
		String result = null;
		ArrayList<String> output = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		String input = null;
		for(int i=0;i<n;i++){
			if(input == null){
				input = String.valueOf(i+1);
			}
			else{
				input = input + String.valueOf(i+1);
			}
		}
		
		compute(input,output,0,n);
		//System.out.println(output);
		result = output.get(k-1);
		return result;
	}
	public static void compute(String input,ArrayList<String> output, int l, int r){
		
		if( l == r){
			String temp = new String(input);
			output.add(temp);
		}
		for( int j=l; j< r ; j++){
			input = swap(input,l,j);
			compute(input,output,l+1,r);
			input = swap(input,l,j);	
		}
	}
	public static String swap(String input,int l,int r){
		if( l ==r){
			return input;
		}
		char temp = input.charAt(l);
		char temp1 = input.charAt(r);
		input = input.substring(0,l) + temp1 + input.substring(l+1,r) + temp + input.substring(r+1);
		return input;
	}
}
