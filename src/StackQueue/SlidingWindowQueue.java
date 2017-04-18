package StackQueue;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Deque;

public class SlidingWindowQueue {
	public static void main(String args[]){
		System.out.println(slidingMaximum(new ArrayList<Integer>(Arrays.asList(1, 3, -1, -3, 5, 3, 6, 7)),3));
	}
	public static ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Deque<Integer> vkl = new LinkedList<Integer>();
		
		for (int i = 0 ; i < a.size() ; i++){
			// to check if it is still valid ( i -b)
			if( !vkl.isEmpty() && vkl.peekFirst() == i-b ){
				vkl.removeFirst();
			}
			
			// if it is less then remove it
			while(!vkl.isEmpty() && a.get(vkl.peekLast()) <= a.get(i)){
				vkl.removeLast();
			}
			
			// adding to the list
			vkl.addLast(i);
			
			// adding to the result
			if( i+1 >= b){
				result.add(a.get(vkl.peekFirst()));
			}
		}
		
		return result;

	}
}
