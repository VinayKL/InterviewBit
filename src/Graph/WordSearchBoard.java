package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class WordSearchBoard {
	public static void main(String args[]){
		ArrayList<String> input = new ArrayList<String>( Arrays.asList("ABCE","SFCS","ADEE"));
		String word = "ABCD";
		int result = exist(input,word);
		System.out.println(result);
	}
	public static int exist(ArrayList<String> a, String b) {
		int result =0;
		int bcounter = 0;
		for( int i =0 ; i< a.size() ; i++){
			for( int j =0 ; j < a.get(i).length() ; j++){
				char temp = a.get(i).charAt(j);
				ArrayList<Integer> res = new ArrayList<Integer>();
				if( b.charAt(0) == temp){
					DFS(i,j,b,bcounter+1,a,res);
					if( res.size() !=0){
						result =1;
						break;
					}
				}
			}
		}
		return result;
	}
	private static void DFS(int row, int col, String b, int counter, ArrayList<String> a ,ArrayList<Integer> res) {
		if( counter == b.length()){
			res.add(1);
			return;
		}
		
		int rowv[] = new int[]{ -1,0,0,1};
		int colv[] = new int[]{ 0,-1,1,0};
		
		for( int k =0 ; k < 4 ; k++){
			int row1 = row + rowv[k];
			int col1 = col + colv[k];
			if( check ( row1, col1, b , a, counter)){
				counter++;
				DFS(row1,col1,b,counter,a,res);
				counter--;
			}
		}
		return;
		
	}
	private static boolean check(int row, int col, String b, ArrayList<String> a, int counter) {
		return (row >= 0) && (col >=0) && (row < a.size()) && ( col < a.get(0).length()) && a.get(row).charAt(col) == b.charAt(counter);
	}
}
