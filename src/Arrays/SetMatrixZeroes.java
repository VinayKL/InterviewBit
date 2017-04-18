package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1,1,1,1));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(1,1,1,1));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(1,0,1,1));
		input.add(row1);
		input.add(row2);
		input.add(row3);
		System.out.println(input);
		setZeroes(input);
		System.out.println(input);
	}
	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
		boolean flagC = false;
		boolean flagR = false;
		
		
		
		for( int i =0 ; i<a.size(); i++){
			if( a.get(i).get(0) == 0){
				flagC= true;
				break;
			}
		}
		for( int i =0 ; i<a.get(0).size(); i++){
			if( a.get(0).get(i) == 0){
				flagR= true;
				break;
			}
		}
		
		
		
		for( int i=1; i< a.size(); i++){
			for( int j=1 ; j<a.get(0).size() ; j++){
				if( a.get(i).get(j) == 0){
					
					a.get(i).set(0, 0);
					a.get(0).set(j,0);
					
				}
			}
		}
		
		
		// 
		for(int i=1; i< a.size(); i++){
			for( int j =1 ; j <a.get(0).size(); j++){
				if( a.get(i).get(0) == 0 || a.get(0).get(j) ==0){
					a.get(i).set(j, 0);
				}
			}
		}
		
		if( flagC == true){
			for( int i =0 ; i< a.size() ; i++){
				a.get(i).set(0, 0);
			}
		}
		
		if( flagR == true){
			for( int i = 0 ; i< a.get(0).size() ;i++){
				a.get(0).set(i, 0);
			}
		}
		
	}

}
