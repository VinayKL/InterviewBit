package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList b = new ArrayList(Arrays.asList(1,2,3));
		ArrayList c = new ArrayList(Arrays.asList(4,5,6));
		ArrayList d = new ArrayList(Arrays.asList(7,8,9));
		a.add(b);
		a.add(c);
		a.add(d);
		
		ArrayList<ArrayList<Integer>> v = new ArrayList<ArrayList<Integer>>();
		printlist(a);
		v = diagonal(a);
		printlist(v);
		
	}
	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
		int size = a.size() * 2 -1;
		//System.out.println(size);
		for( int i =0 ; i< size ; i++){
			ArrayList<Integer> w = new ArrayList<Integer>();
			//System.out.println(i);
			//logic here
			int j,k;
			if ( i < a.size() ){
				for( j = 0 , k = i;j< a.size() && k >= 0 ; j++, k--)
				{
					//System.out.println( j +" " + k);
					w.add(a.get(j).get(k));
				}
				b.add(w);
			}
			else{
				//System.out.println(" I am here"+ i +Math.floorMod(i, a.size()));
				for(j = (Math.floorMod(i, a.size())) +1, k =a.size()-1 ; j< a.size() && k >= 0 ; j++, k--){
					//System.out.println( j +" " + k);
					w.add(a.get(j).get(k));
						
				}
				b.add(w); 
			}
			
			// logic end
		}
		return b;
	    
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
