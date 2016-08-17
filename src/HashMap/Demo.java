package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	public static void main(String args[]){
		HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 100);
		map.put(2, 101);
		map.put(3, 102);
		printHashmapValues(map);
		int k = map.get(3);
		System.out.println(k);
		HashMap <Integer,Integer> map2 = new HashMap<Integer,Integer>();
		map2 = (HashMap<Integer, Integer>) map.clone();
		printHashmapValues(map2);
		map.remove(2);
		boolean check = map.containsKey(2);
		if(check){
			System.out.println("Contains the key");	
		}
		boolean check1 = map.containsValue(100);
		if(check1){
			System.out.println("Contains the value");	
		}
		// Keys and values seperatly
		Set s1 = map.keySet();
		Set s2 = (Set) map.values();
		
		HashMap map3 = new HashMap();
		map3.putAll(map2);
		printHashmapValues(map3);
		int size = map3.size();
		System.out.println(size);
		
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
