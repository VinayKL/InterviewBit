package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MinSumPathinTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>>input = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(2));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(3,4));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(6,5,7));
		ArrayList<Integer> row4 = new ArrayList<Integer>(Arrays.asList(4,1,8,3));
		input.add(row1);
		input.add(row2);
		input.add(row3);
		input.add(row4);
		int result = minimumTotal(input);
		System.out.println(result);
	}
	public static int minimumTotal(ArrayList<ArrayList<Integer>> a) {
		int result =0;
		int row = a.size()-1;
		int col = a.get(row).size()-1;
		int [][]vkl = new int[row][col];
		for (int[] row1: vkl){
			 Arrays.fill(row1, -1);
		}
		result = compute(a,row,col,0,0,vkl);
		return result;
	}
	public static int compute(ArrayList<ArrayList<Integer>> a, int row, int col, int t1, int t2, int [][]vkl){
		//System.out.println("I am in row "+t1+" Col "+ t2);
		if( t1 == row ){
			return a.get(t1).get(t2);
		}
		if(t1 > row || t2> col){
			//System.out.println(" Returned the end.");
			return Integer.MAX_VALUE;
		}
		if( vkl[t1][t2] != -1){
			//System.out.println("Already there for row"+t1+" col "+ t2+" Returning "+vkl[t1][t2]);
			return vkl[t1][t2];
		}
		else{
			vkl[t1][t2] = a.get(t1).get(t2) + Math.min(compute(a,row,col,t1+1,t2,vkl), compute(a,row,col,t1+1,t2+1,vkl));
			//System.out.println("Not there. Computed for row"+ t1+ " col " + t2 + "ans " + vkl[t1][t2]);
		}
		return vkl[t1][t2];
	}
}
