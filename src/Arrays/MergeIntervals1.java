package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

// Merge  overlapping intervals

public class MergeIntervals1 {
	public static void main(String args[]){
		ArrayList<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(1,19));
		input.add(new Interval(2,6));
		//input.add(new Interval(6,7));
		input.add(new Interval(8,10));
		input.add(new Interval(15,18));
		
		//input.add(new Interval(4,7));
		//input.add(new Interval(8,9));
		
	
		for( int i =0 ; i< input.size() ; i++){
			System.out.print(input.get(i).start + "-" + input.get(i).end +  "   ");
		}
		System.out.println();
		ArrayList<Interval> result =  merge(input);
		for( int i =0 ; i< result.size() ; i++){
			System.out.print(result.get(i).start + "-" + result.get(i).end+ "  ");
		}
		
	}
	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
			ArrayList<Interval> result = new ArrayList<Interval>();
			Stack<Interval> sk = new Stack();
			if(intervals.size() ==0 || intervals.size()==0){
				return intervals;
			}
			
			sk.push(intervals.get(0));
			for(int i= 1; i< intervals.size() ;i++){				
				Interval temp = sk.pop();
				//printInterval(temp);
				if( temp.end < intervals.get(i).start){
					sk.push(temp);
					sk.push(intervals.get(i));
				}	
				else if(intervals.get(i).end > temp.end){
					temp.end = intervals.get(i).end;		
					sk.push(temp);
				}
				else{
					sk.push(temp);
				}
						
			}
			
			while(!sk.isEmpty()){
				result.add(sk.pop());
			}
			Collections.reverse(result);
			return result;
    }

	
	public static void printInterval(Interval in){
		System.out.println(in.start+" "+in.end);		
	}
}
