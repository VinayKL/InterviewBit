package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CaptureRegions {
	public static void main(String args[]){
		ArrayList<ArrayList<Character>> input = new ArrayList<ArrayList<Character>>();
		ArrayList<Character> row1 = new ArrayList<Character>(Arrays.asList('X','O','X','X'));
		ArrayList<Character> row2 = new ArrayList<Character>(Arrays.asList('X','O','O','X'));
		ArrayList<Character> row3 = new ArrayList<Character>(Arrays.asList('X','X','O','X'));
		ArrayList<Character> row4 = new ArrayList<Character>(Arrays.asList('X','O','X','O'));
		input.add(row1);
		input.add(row2);
		input.add(row3);
		input.add(row4);
		
		System.out.println(input);
		solve(input);
		System.out.println(input);
		
	}
	public static void solve(ArrayList<ArrayList<Character>> a) {
		int row = a.size();
		int col = a.get(0).size();
		boolean visited [][] = new boolean[row][col];
		for( int i=0; i< row ; i++ ){
			for(int j =0 ; j< col ; j++){
				visited[i][j] = false;
			}
		}
		for( int i =0 ; i < row ; i++){
			for( int j =0 ; j< col ; j++){
				Character temp = a.get(i).get(j);
				
				if( temp == 'O' && visited[i][j] == false){
					// Identify the region using DFS
					ArrayList<ArrayList<Integer>> region = new ArrayList<ArrayList<Integer>>();
					ArrayList<Integer> temp1 = new ArrayList(Arrays.asList( i,j));
					region.add(temp1);
					DFS(a,i,j,visited,region);
					for( int k = 0 ; k<region.size() ; k++){
						int row1 = region.get(k).get(0);
						int col1 = region.get(k).get(1);
						a.get(row1).set(col1, 'X');
				
					}
				}
			}
		}
	}
	public static void DFS(ArrayList<ArrayList<Character>> a, int row , int col , boolean visited[][], ArrayList<ArrayList<Integer>> region){
		//System.out.println(" row is "+ row + " Col is "+ col);
		// set the visited
		visited [ row][col] = true;
		// check for 4 neighbours
		
		int rowv[] = new int[]{ -1,0,0,1};
		int colv[] = new int[]{ 0,-1,1,0};
		
		if( (row ==0) || (col == 0) || ( row == a.size()-1) || ( col == a.get(0).size()-1)){
			region.clear();
			//System.out.println(" Clearing "+region);
			
		}
		
		for( int i = 0 ; i < 4 ; i++){
			if( check( a, row + rowv[i], col + colv[i], visited)){
				if(((row+rowv[i]) == 0 ) || ((col + colv[i]) == 0) && ((row+rowv[i]) >= a.size()-1) && ( (col + colv[i]) >= a.get(0).size()-1 ) ){
					
					region.clear();
					
					return;
				}else{
					
					ArrayList<Integer> temp = new ArrayList(Arrays.asList((row+rowv[i]),(col + colv[i])));
					//System.out.println(temp);
					region.add(temp);
				}
				//System.out.println("Found a connectivity");
				DFS(a, row + rowv[i], col + colv[i], visited, region);
			}
		}
		
	}
	private static boolean check(ArrayList<ArrayList<Character>> a, int row, int col, boolean[][] visited) {
	
		return (row >= 0 ) && (col >= 0) && (row < a.size()) && ( col < a.get(0).size() ) && (a.get(row).get(col) == 'O') && (visited [row][col] == false ); 
 	}
}
