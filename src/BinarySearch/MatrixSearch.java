package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixSearch {
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1,3,5,7));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(10, 11, 16, 20));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(23, 30, 34, 50));
		input.add(row1);
		input.add(row2);
		input.add(row3);
		System.out.println(searchMatrix(input,52));
	}
	public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
		int result =0;
		int size = a.size();
		int row = 0;
		int low =0;
		int high = size-1;
		int size1 = a.get(0).size();
		boolean flag = false;
		while( high >= low){
			int middle = (high + low )/2;
			if( a.get(middle).get(0) <= b && a.get(middle).get(size1-1) >= b){
				row = middle;
				flag = true;
				break;
			}
			if( a.get(middle).get(0) < b ){
				low = middle +1;
			}else if(( a.get(middle).get(0) > b)){
				high = middle-1;
			}
		}
		if( flag == false){
			return 0;
		}
		//System.out.println("Got the row "+ row);
		
		int low1=0;
		int high1 = size1-1;
		while(high1 >= low1){
			int middle1 = (high1+low1) /2;
			if( a.get(row).get(middle1) == b){
				result=1;
				break;
			}
			if( a.get(row).get(middle1) < b){
				low1 = middle1 +1;
			}else{
				high1 = middle1 -1;
			}
		}
		return result;
	}
}
