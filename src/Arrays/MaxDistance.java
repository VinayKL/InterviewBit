package Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class MaxDistance {
	public static void main(String args[]){
		List<Integer> input = new ArrayList<Integer> ( Arrays.asList(1));
		System.out.println(maximumGap(input));
	}
	public static int maximumGap(final List<Integer> a) {
		int result  = -1;
		if(  a == null){
			return -1;
		}
		for( int i =0 ; i  < a.size() ; i ++){
			for( int  j = i ; j < a.size(); j++){
				if( a.get(j) >= a.get(i)){
					int temp = j - i;
					if( temp > result){
						result = temp;
					}
				}
			}
		}
		return result;
	}
}
