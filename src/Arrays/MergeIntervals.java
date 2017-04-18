package Arrays;

import java.util.ArrayList;

// merge an extra interval
public class MergeIntervals {
	public static void main(String args[]){
		ArrayList<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(1,2));
		input.add(new Interval(3,5));
		input.add(new Interval(6,7));
		input.add(new Interval(8,10));
		input.add(new Interval(12,16));
		
		input.add(new Interval(24,27));
		//input.add(new Interval(8,9));
		
		Interval temp = new Interval(4,9);
		for( int i =0 ; i< input.size() ; i++){
			System.out.print(input.get(i).start + "-" + input.get(i).end +  "   ");
		}
		System.out.println();
		ArrayList<Interval> result =  insert(input,temp);
		for( int i =0 ; i< result.size() ; i++){
			System.out.print(result.get(i).start + "-" + result.get(i).end+ "  ");
		}
		
	}
	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		ArrayList<Interval> result = new ArrayList<Interval>();
		
		for(Interval i:intervals){
			if( i.end < newInterval.start){
				result.add(i);
			}else if( newInterval.end < i.start){
				result.add(newInterval);
				// why is this
				// once we add one interval, everything else need to be pushed by 1 to right
				newInterval = i;
			}else if(newInterval.start <= i.end || newInterval.end <= i.start){
				int min = Math.min(newInterval.start, i.start);
				int max =  Math.max(newInterval.end, i.end);
				Interval new1 = new Interval(min,max);
				// when is it added?
				// the new interval created here will be added to result in the second else loop in the next iteration and continues
				newInterval = new1;
			}
		}
		// why is it here?
		// adding the final element
		result.add(newInterval);
		return result;

    }
}
