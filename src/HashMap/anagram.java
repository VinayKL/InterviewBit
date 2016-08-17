package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class anagram {
	public static void main(String aargs[]){
		
		ArrayList<String> A = new ArrayList<String>();
		/*A.add("cat");
		A.add("dog");
		A.add("god");
		A.add("tca"); 
		A.add("b");
		A.add("c"); */
		A.add("caat");
		A.add("taac");
		A.add("dog");
		A.add("god");
		A.add("acta");
		/*
		boolean x = compare("dogo","godo");
		if(x){
			System.out.println("Comparision works");
		}
		 */
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result = anagrams(A);
		for(int i =0; i< result.size(); i++){
			System.out.print(result.get(i)+",");
		}
		System.out.println(); 
		
	}
	public static ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int size = a.size();
		int flag =0;
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i = 0 ; i < a.size() ; i++){
			ArrayList<Integer> A = new ArrayList<Integer>();
			flag =0;
			String x = a.get(i);
			if ( s.contains(i)){
				continue;
			}
			for(int j = i+1; j < a.size() ; j++){
				String y = a.get(j);
				if ( s.contains(j)){
					continue;
				}
				if( compare(x,y)){
					if(A.contains(i+1)){
						A.add(j+1);
					}
					else{
						A.add(i+1);
						A.add(j+1);
					}
					flag =1;
					s.add(j);
				}
			}
			if( flag == 0){
				A.add(i+1);
			}
			result.add(A);
			
		}
		
		
		return result;
	}
	public static boolean compare(String s1, String s2){
		boolean res = true;
		// build the Hash map for the second string
		HashMap <Character,Integer>temp = new HashMap<Character,Integer>();
		int size = s2.length();
		
		int size2 = s1.length();
		if( size2 != size){
			res = false;
			return res;
		}
		
		for( int i =0 ;i < size ; i++){
			char x = s2.charAt(i);
			if(temp.containsKey(x)){
				temp.put(x,temp.get(x)+1);
			}
			else{
				temp.put(x,1);
			}
		}
		// now check for anagram
		
		for(int j=0;j<size2;j++){
			char y = s1.charAt(j);
			if(temp.containsKey(y)){
				if(temp.get(y)>1){
					temp.put(y,temp.get(y)-1);
				}
				else if(temp.get(y) == 1){
					temp.remove(y);
				}
			}
			else{
				res = false;
				break;
			}
		}
		
		
		return res;
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
