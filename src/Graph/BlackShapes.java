package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class BlackShapes {
	public static void main(String args[]){
		ArrayList<String> input = new ArrayList<String>(Arrays.asList("000X000","00XX0X0","0X000X0"));
		int result = black(input);
		System.out.println(result);
	}
	public static int black(ArrayList<String> a) {
		int count =0;
		Stack<point> vkl = new Stack();
		int row = a.size();
		int col = a.get(0).length();
		boolean visited [] [] = new boolean[row][col];
		for( int i=0 ; i < row; i++){
			for( int j=0 ; j< col ; j++){
				visited[i][j] = false;
			}
		}
		for( int i = 0 ; i < row ; i++){
			for( int j =0; j < col ; j++){
				if( a.get(i).charAt(j) == 'X' && visited[i][j] == false){
					DFS( a , i , j , visited);
					count++;
				}
			}
		}
		return count;
	}
	private static void DFS(ArrayList<String> a, int i, int j, boolean[][] visited) {
		visited[i][j] = true;
		int rowv[] = new int[]{ -1,0,0,1};
		int colv[] = new int[]{ 0,-1,1,0};
		
		for( int k =0 ; k< 4 ; k++){
			if( check( a , i + rowv[k] , j+ colv[k], visited)){
				DFS( a , i + rowv[k] , j+ colv[k], visited);
			}
		}
		
	}
	private static boolean check(ArrayList<String> a, int i, int j, boolean[][] visited) {
		return ( i >= 0) && (j >=0) && (i < a.size()) && (j < a.get(0).length()) && (visited[i][j] == false) && (a.get(i).charAt(j) == 'X');
	}
	
}

