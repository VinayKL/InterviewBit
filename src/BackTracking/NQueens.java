package BackTracking;

import java.util.ArrayList;

public class NQueens {
	public static void main(String args[]){
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		int input = 4;
		result = solveNQueens(input);
		System.out.println(result);
	}
	public static ArrayList<ArrayList<String>> solveNQueens(int a) {
		ArrayList<ArrayList<String>> result =  new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> finalRes =  new ArrayList<ArrayList<String>>();
		compute(result,finalRes,0,a,0);
		return finalRes;
	}
	
	public static void compute(ArrayList<ArrayList<String>> result,ArrayList<ArrayList<String>> finalRes,int col,int a,  int con2){
		//System.out.println("Loop");
		if( col>=a){
			//System.out.println(" Adding to the output");
			ArrayList<ArrayList<String>> temp =  new ArrayList<ArrayList<String>>(result);
			finalRes.addAll(temp);
		}
		
		for(int j=0;j<a;j++){
			//System.out.println(col+" "+ j +" ");
			
			ArrayList<String> temp = new ArrayList<String>();
			for( int s = 0 ;s <a ; s++){
				temp.add(".");
			}
			result.add(temp);
			//System.out.println(result);
			if( Possible(col,j,a,result)){	
				
				result.get(col).set(j, "Q");
				//System.out.println(result);
				compute(result,finalRes,col+1,a,j);
				//System.out.println("BackTracking");	
				result.remove(result.size()-1);
				//System.out.println(result);
			}
			else{
				result.remove(col);
				//System.out.println(" Couldnt get in");
			}
		}
			
			
	}	
	public static boolean Possible(int i,int j , int a, ArrayList<ArrayList<String>> result){
		int m =0;
		int n =0;
		for( m = i ,n=j-1 ; n >=0 ; n--){
			//System.out.println(result);
			//System.out.println("Sha" + m + " " + n);
			if(result.get(m).get(n) == "Q"){
				return false;
			}
		}
		for( m =i-1 , n =j; m >=0 ; m--){
			if(result.get(m).get(n) == "Q"){
				return false;
			}
		}
		for(m =i-1, n=j+1; m>=0 && n<a ; m--,n++){
			//System.out.println("m "+m +" n " + n);
			if(result.get(m).get(n) == "Q"){
				return false;
			}
		}
		for(m =i-1 , n =j-1 ; m>=0 && n>=0 ; m--,n--){
			if(result.get(m).get(n) == "Q"){
				return false;
			}
		}
		return true;
	}

}


