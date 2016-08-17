package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotate90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList b = new ArrayList(Arrays.asList(1,2,3));
		ArrayList c = new ArrayList(Arrays.asList(4,5,6));
		ArrayList d = new ArrayList(Arrays.asList(7,8,9));
		a.add(b);
		a.add(c);
		a.add(d);
		printlist(a);
		rotate(a);
		printlist(a);
		
	}
	public static void rotate(ArrayList<ArrayList<Integer>> a) {
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>(a.size());
		for( int i=0;i<a.size() ; i++){
			ArrayList d = new ArrayList(a.get(i).size());
			ArrayList e = new ArrayList(a.get(i));
			for(int j =0 ; j< e.size() ; j++){
				//System.out.println(e.get(j));
				d.add(e.get(j));
			}
			b.add(d);
		}
		//printlist(b);
		for(int i =0 ;i<b.size(); i++){
			ArrayList c = new ArrayList(b.get(i));
			for( int j = 0 ; j< c.size(); j++){
				//System.out.println("I am here");
				int k = b.size() - i -1;
				//System.out.println(k);
				//System.out.println(c.get(j));
				//System.out.println(a.get(j));
				a.get(j).set(k, (Integer) c.get(j));
				}
		}
	}
	public static void printlist(ArrayList<ArrayList<Integer>> A){
		int size = A.size();
		for( int i=0;i<size ; i++){
			ArrayList d = A.get(i);
			for( int j =0 ; j< d.size() ; j++){
				System.out.print(d.get(j)+ " ");
			}
			System.out.println();
		}
		
	}
}

/* Without creating a copy approach
matrix[i][j] = matrix[len - j - 1][i];
matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
matrix[len - i - 1][len - j - 1] = matrix[j][len - i - 1];
matrix[j][len - i - 1] = tmp;   */
