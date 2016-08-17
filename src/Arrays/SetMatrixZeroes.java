package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1,0,1));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(1,1,1));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(1,1,1));
		input.add(row1);
		input.add(row2);
		input.add(row3);
		System.out.println(input);
		setZeroes(input);
		System.out.println(input);
	}
	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
		ArrayList<ArrayList<Integer>> input1 = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i< a.size() ;i++){
			int flag =0;
			for( int j=0 ; j < a.get(i).size(); j++){
				if( a.get(i).get(j)==0){
					ArrayList<Integer> row11 = new ArrayList<Integer>();
					row11.add(i);
					row11.add(j);
					input1.add(row11);
				}
			}
		}	
		for( int v =0 ; v<input1.size() ;v++ ){
			int i = input1.get(v).get(0);
			int j = input1.get(v).get(1);
			for( int k=0 ; k<a.get(0).size(); k++){
				a.get(i).set(k,0);
			}
			for( int m =0 ; m < a.size() ; m++){
				a.get(m).set(j, 0);
			}	
				
		}
	}

}
