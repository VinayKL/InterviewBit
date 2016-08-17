package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
 * Important take aways
 * Array[i][j]   =  list.get(i).charAt(j)
 * To access a block we need
 * for( int k =0 ; k < 9 ; k++){
 * 			int x = k / 3;
		    int y = k % 3;
			HashSet<Character> Block = new HashSet();
			for(int i = 3*x; i< 3*x+3; i++){
				for(int j = y*3 ; j < y*3 +3 ; j++){
					char ch = a.get(j).charAt(i);
 */
public class Sudexo {
	public static void main(String args[]){
		ArrayList <String> a = new ArrayList<String>(Arrays.asList("53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"));
		//System.out.println(a);
		int flag = isValidSudoku(a);
		if(flag ==1){
			System.out.println("Is a valid sudexo");
		}
		else{
			System.out.println("Is not a valid sudexo");
		}
	}
	public static int isValidSudoku(final List<String> a) {
		for(int i =0 ; i< 9 ; i++){
			HashSet<Character> Row = new HashSet();
			for(int j =0 ; j< 9 ; j++){
				char ch = a.get(i).charAt(j);
				if(ch == '.'){
					
				}else{
					if(Row.contains(ch)){
						return 0;
					}
					else{
						Row.add(ch);
					}
				}
			}
		}
		for(int i =0 ; i< 9 ; i++){
			HashSet<Character> Coloumns = new HashSet();
			for(int j =0 ; j< 9 ; j++){
				char ch = a.get(j).charAt(i);
				if(ch == '.'){
					
				}else{
					if(Coloumns.contains(ch)){
						return 0;
					}
					else{
						Coloumns.add(ch);
					}
				}
			}
		}
		for( int k =0 ; k < 9 ; k++){
			int x = k / 3;
		    int y = k % 3;
			HashSet<Character> Block = new HashSet();
			for(int i = 3*x; i< 3*x+3; i++){
				for(int j = y*3 ; j < y*3 +3 ; j++){
					char ch = a.get(j).charAt(i);
					if(ch == '.'){
						
					}else{
						if(Block.contains(ch)){
							return 0;
						}
						else{
							Block.add(ch);
						}
					}
				}
				
			}
		}
		return 1;
	}
}
