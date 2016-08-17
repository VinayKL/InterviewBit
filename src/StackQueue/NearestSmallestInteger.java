package StackQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NearestSmallestInteger {

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34, 35, 27, 42, 5, 28, 39, 20, 28));
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = prevSmaller(input);
		System.out.println(result);

	}
	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<Integer> vkl = new Stack<Integer>();
		result.add(-1);
		vkl.push(-1);
		vkl.push(arr.get(0));
		for( int i=1 ; i<arr.size() ; i++){
			//System.out.println(vkl);
			while(vkl.peek() >= arr.get(i) ){
				vkl.pop();
			}
			
			result.add(vkl.peek());
			
			 arr.get(i);
			vkl.push(arr.get(i));
		}
		return result;
    }
}
