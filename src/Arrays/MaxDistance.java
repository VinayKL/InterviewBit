package Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class MaxDistance {
	public static void main(String args[]){
		List<Integer> input = new ArrayList<Integer> ( Arrays.asList(3,2,1));
		System.out.println(maximumGap(input));
	}
	public static int maximumGap(final List<Integer> a) {
		if( a.size() ==1){
	        return 0;
	    }
		int result  = -1;
		if(  a == null){
			return -1;
		}
		int min[] = new int[a.size()];
		int max[] = new int[a.size()];
		min[0] = a.get(0);
		max[a.size()-1] =a.get(a.size()-1);
		for(int i =1 ;i < a.size(); i++){
			min[i] = Math.min(min[i-1], a.get(i));
		}
		for(int i = a.size()-2 ;i >=0 ; i--){
			max[i] = Math.max( max[i+1], a.get(i));
		}
		int i =0 ;
		int j =0;
		while ( i < a.size() && j <a.size()){
			if( min[i]< max[j]){
				result = Math.max( result, j- i);
				j = j +1;
			}else{
				i = i +1;
			}
		}
		return result;
	}
}
