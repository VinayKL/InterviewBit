package Arrays;

import java.util.ArrayList;

public class MergeIntervals {
	public static void main(String args[]){
		ArrayList<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(1,2));
		input.add(new Interval(3,5));
		input.add(new Interval(6,7));
		input.add(new Interval(8,10));
		input.add(new Interval(12,16));
		
		//input.add(new Interval(4,7));
		//input.add(new Interval(8,9));
		
		Interval temp = new Interval(9,14);
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
		int start =  newInterval.start;
		int end = newInterval.end;
		if( start > end){
			int temp = start;
			start = end;
			end = temp;
		}
		if(intervals.isEmpty()){
			intervals.add(new Interval(start,end));
			return intervals;
		}
		if( end < intervals.get(0).start){
			intervals.add(0, new Interval(start,end));
			return intervals;
		}
		if( start >intervals.get(intervals.size()-1).end)
		{
			intervals.add(new Interval(start,end));
			return intervals;
		}
		int i=0;
		while( i< intervals.size()){
			int v1 = intervals.get(i).start;
			int v2 = intervals.get(i).end;
			if( v2 > start && v1<start){
				//System.out.println(v1+ " " + v2);
				//System.out.println(" I am here");
				int newstart = v1;
				int newend =0;
				if(end < v2 ){
					//System.out.println("No changes");
					return intervals;
				}
				while(v1 < end && i> intervals.size()-1){
					i = i+1;
					v1 = intervals.get(i).start;
					v2 = intervals.get(i).end;
					//System.out.println(v1+" "+v2);
				}
				if( i == intervals.size()-1){
					//System.out.println("here");
					newend = end;
				}else{
					i= i -1;
					v2 = intervals.get(i).end;
					newend = v2 > end ?v2 : end;
				}
				
				//System.out.println(" New ones" + newstart+ " "+ newend);
				result.add(new Interval(newstart,newend));
				i =i+1;
				
			}else{
				result.add(intervals.get(i));
				i++;
			}
			
		}
		return result;

    }
}
