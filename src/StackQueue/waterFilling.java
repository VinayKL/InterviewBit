package StackQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class waterFilling {
	public static void main(String args[]){
		System.out.println(trap(new ArrayList<Integer>(Arrays.asList(0,1,0,2,1,0,1,3,2,1,2,1))));
		
	}
	public static int trap(final List<Integer> a) {
		int result =0;
		if( a.size()==0 || a.size() ==1){
			return result;
		}
		int arrmaxr[] = new int[a.size()];
		int arrmaxl[] = new int[a.size()];
		
		arrmaxl[0] = a.get(0);
		
		// Create a max left window
		for(int i = 1;i<a.size() ; i++){
			arrmaxl[i] = Math.max(a.get(i), arrmaxl[i-1]);
		}
		
		arrmaxr[a.size()-1] = a.get(a.size()-1);
		
		// create a max right wondow
		for( int i = a.size()-2; i>=0 ; i--){
			arrmaxr[i] = Math.max(a.get(i), arrmaxr[i+1]);
		}
		
		for(int i= 0 ;i < a.size();i++){
			result  = result + ( Math.min(arrmaxl[i], arrmaxr[i]) - a.get(i) );
		}
		return result;
	}
}
