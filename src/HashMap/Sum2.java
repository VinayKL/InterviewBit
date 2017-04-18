package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sum2 {
	public static void main(String aargs[]){
		
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5));
		
		int k =-3;
		ArrayList <Integer>B = new ArrayList();
		
		B= twoSumA(A,k);
		Iterator it = B.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
	}
	
	public static ArrayList<Integer> twoSumA(final List<Integer> a, int b) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for( int i = 0 ; i < a.size() ; i++){
			int num = a.get(i);
			if( map.containsKey(b - num)){
				result.add(map.get(b-num)+1);
				result.add(i+1);
				break;
			}else{
				if( map.containsKey(num)){
				}else{
					map.put(num,i);
				}
				
			}
		}
		return result;
		
	}
}
