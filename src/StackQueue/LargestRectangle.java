package StackQueue;
import java.util.Arrays;
import java.util.Stack;
import java.util.ArrayList;


public class LargestRectangle {
	public static void main(String args[]){
		System.out.println(largestRectangleArea(new ArrayList<Integer>(Arrays.asList(2,1,5,6,2,3))));
	}
	public static int largestRectangleArea(ArrayList<Integer> a) {
		int result=0;
		if( a.size()==0){
			return 0;
		}
		if(a.size() ==1){
			return a.get(0);
		}
		Stack sk = new Stack();
		int i =0;
		while( i < a.size()){
			if( sk.isEmpty() || a.get((int)sk.peek()) < a.get(i)){
				sk.push(i);
				i++;
			}
			else{
				int curr = (int)sk.pop();
				int h =  a.get(curr);
				int b = sk.empty()?i: i - (int)sk.peek() -1;
				result =Math.max(result, h*b);
			}
			
		}
		while( ! sk.isEmpty()){
			int curr = (int)sk.pop();
			int h =  a.get(curr);
			int b = sk.empty()?i: i - (int)sk.peek() -1;
			result =Math.max(result, h*b);
		}
		return result;
	}
}
