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
		//ArrayList <Integer>A = new ArrayList();
		/*A.add(2);
		A.add(4);
		A.add(5);
		A.add(7);
		A.add(12);
		A.add(21);
		*/
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3));
		
		int k =-1;
		ArrayList <Integer>B = new ArrayList();
		
		 B= twoSum(A,k);
		 Iterator it = B.iterator();
		 System.out.println(it.next());
		 System.out.println(it.next());
	}
	public static ArrayList<Integer> twoSum(final List<Integer> a, int b) {
		ArrayList<Integer> result = new ArrayList();
		HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
		
		Iterator it = a.iterator();
		int counter =1;
		while(it.hasNext()){
			map.put((Integer) it.next(),counter);
			counter++;
		}
		
		//printHashmapValues(map);
		Iterator it1 = a.iterator();
		HashMap<Integer,Integer> map2 = new HashMap();
		
		ArrayList A1 = new ArrayList();
		ArrayList A2 = new ArrayList();
		
		while(it1.hasNext()){
			int temp = (int) it1.next();
			int diff = b - temp;
			if( map.containsKey(diff)){
				/*
				result.add(map.get(temp));
				result.add(map.get(diff));
				*/
				A1.add(map.get(temp));
				A2.add(map.get(diff));
				
			}
			map.remove(temp);
		}
		// find the lowest in A2.get the index of that add it to result.Use same index on A1
		// add it to the result.
		if( A1.isEmpty()){
			return result;
		}
		int index = A2.indexOf(Collections.min(A2));
		result.add((Integer) A1.get(index));
		result.add((Integer) A2.get(index));
		
		return result;
	}
	public static void printHashmapValues(HashMap A){
		Set set = A.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry m = (Map.Entry) it.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}
}
