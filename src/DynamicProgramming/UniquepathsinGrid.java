package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class UniquepathsinGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>>input = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(0,0,0));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(0,1,0));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(0,0,0));
		input.add(row1);
		input.add(row2);
		input.add(row3);
		int result = uniquePathsWithObstacles(input);
		System.out.println(result);
	}
	public static int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> a) {
	ArrayList<Integer>counter = new ArrayList();
	if(a.size() ==0){
		return 0;
	}
	int row = a.size()-1;
	int col = a.get(0).size()-1;
	compute(a,row,col,counter,0,0);
	return counter.size();
	}
	public static void compute(ArrayList<ArrayList<Integer>> a,int row, int col, ArrayList<Integer> counter,int t1, int t2){
		if( row ==t1 && col==t2){
			//System.out.println("Incremeted the counter");
			counter.add(1);
			return;
		}
		if(t1>row || t2 >col){
			return;
		}
		if(a.get(t1).get(t2)==1){
			return;
		}else{
			compute(a,row,col,counter,t1+1,t2);
			compute(a,row,col,counter,t1,t2+1);
		}
	}
}
