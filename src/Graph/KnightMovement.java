package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KnightMovement {
	public static void main(String args[]){
		int M = 4;
		int N = 4;
		int x1 = 1;
		int y1 = 1;
		int x2 = 4; 
		int y2 = 4;
		int result = knight(M,N,x1,y1,x2,y2);
		System.out.println(result);
	}
	public static int knight(int M, int N, int x1, int y1, int x2, int y2) {
		if( x2 > M || y2 > N){
			return -1;
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		boolean visited[][] = new boolean[M][N];
		for( int i =0; i < M ;i++){
			for( int j =0 ; j< N ; j++){
				visited[i][j] = false;
			}
		}
		int dyna[][] = new int [M][N];
		for( int i =0; i < M ;i++){
			for( int j =0 ; j< N ; j++){
				dyna[i][j] = 0;
			}
		}
		ArrayList<ArrayList<Integer>> interm = new ArrayList<ArrayList<Integer>>();
		DFS(M,N,x1-1,y1-1,x2-1,y2-1,result,0,visited,dyna);
		for( int i =0; i < M ;i++){
			for( int j =0 ; j< N ; j++){
				System.out.print(dyna[i][j]+ " ");
			}
			System.out.println();
		}
		return dyna[x1-1][y1-1];
		
	}
	private static int DFS(int M, int N, int x1, int y1, int x2, int y2, ArrayList<Integer> result, int counter, boolean visited[][],int dyna[][]) {
		System.out.println("X and Y " + x1 + " " +  y1);
		if( x1 == x2 && y1 == y2){
			System.out.println("Reachable");
			return 1;
		}
		visited[x1][y1] = true;
		int rowv[] = new int[]{1,2,2,1,-1,-2,-2,1};
		int colv[] = new int[]{-2,-1,1,2,-2,-1,1,2};
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for( int k =0; k < 8 ; k++){
			int row = x1+ rowv[k];
			int col = y1 + colv[k];
			if( check(row,col,visited,M,N)){
				if( dyna[row][col] == 0){
					//visited = new boolean[M][N];
					
					list1.add(DFS(M,N,row,col,x2,y2,result,counter,visited,dyna));	
				}else{
					list1.add(dyna[row][col]);
				}
			}
		}
		if(! list1.isEmpty()){
			dyna[x1][y1] = 1 + Collections.min(list1);
		}
		return dyna[x1][y1];
		
	}
	private static boolean check(int row, int col, boolean[][] visited, int M, int N) {	
		return ( row >=0) && ( col >=0) && ( row < M) && (col < N)  && (visited[row][col] == false);
	}
	
}
