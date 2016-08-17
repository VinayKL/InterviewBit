package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MinSumPathinMatrix {
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>>input = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1,3,2));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(4,3,1));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(5,6,1));
		input.add(row1);
		input.add(row2);
		input.add(row3);
		int result = minPathSum(input);
		System.out.println(result);
		
	}
	public static int minPathSum(ArrayList<ArrayList<Integer>> a) {
		int result=0;
		int [][]dyna = new int[a.size()][a.get(0).size()];
		for (int[] row: dyna){
			 Arrays.fill(row, -1);
		}   
		int row = a.size()-1;
		int col = a.get(0).size()-1;
		result = compute(a,row,col,dyna);
		return result;
	}
	public static int compute(ArrayList<ArrayList<Integer>> a,int row, int col, int [][]dyna){
		//System.out.println("I am in row "+row+" Col "+ col);
		if(row ==0 && col ==0){
			return a.get(0).get(0);
		}
		if( row <0 || col <0){
			//System.out.println(" Returned the end.");
			return Integer.MAX_VALUE; 
		}
		if(dyna[row][col] != -1){
			//System.out.println("Already there for row"+row+" col "+ col+" Returning "+dyna[row][col]);
			return dyna[row][col];
			
		}else{
			dyna[row][col] = a.get(row).get(col)+ Math.min(compute(a,row-1,col,dyna),compute(a,row,col-1,dyna));
			//System.out.println("Not there. Computed for row"+ row+ " col " + col + "ans " + dyna[row][col]);
		}
		return dyna[row][col];
	}
	
}
