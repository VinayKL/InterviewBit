package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class substringConcatenation {
	public static void main(String args[]){
		ArrayList<String> b = new ArrayList();
		//b.add("foo");
		//b.add("bar");
		b.add("c");
		//String a = "barfoothefoobarman";
		String a = "c ";
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = findSubstring(a,b);
		System.out.println(result);
	}
	public static ArrayList<Integer> findSubstring(String a, final List<String> b) {
		
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		// create a HashMap of all the elements in the List
		
		// get the length
		int size = b.get(0).length();
		if( b.size()==1 && a.equals(b.get(0))){
			result.add(0);
			return result;
		}
		//System.out.println("size is"+a.length());
		boolean flag =true;
		for(int i =0 ; i < a.length() ; i++){
			
			HashMap<String,Integer> Map = new HashMap<String,Integer>();
			for(String str:b){
				if( Map.containsKey(str)){
					Map.put(str,Map.get(str)+1);
				}else{
					Map.put(str, 1);
				}
				
			}
			int j=i;
			if( j+size < a.length()){
				flag = true;
			}else{
				flag = false;
			}
			while(flag){
				
				//System.out.println(j);
				String next = a.substring(j, j+size);
				//System.out.println(next);
				if(Map.containsKey(next)){
					int temp = Map.get(next);
					if(temp > 0){
						//System.out.println("decremented the count by 1");
						Map.put(next, Map.get(next)-1);
					}else if ( temp == 0){
						// already been visited.So come out.
						break;
					}
				}else{
					break;
				}
				// exit conditions
				j = j + size;
				//System.out.println("Incremented" + j);
				if( j+size <= a.length()){
					flag = true;
				}else{
					flag = false;
				}
			}
			
			// check if the all HashMap values has 1 as value. Then add the index to result;
			boolean flag1= true;
			Set set = Map.entrySet();
			Iterator it = set.iterator();
			while(it.hasNext()){
				Map.Entry m = (Map.Entry) it.next();
				int k = (int) m.getValue();
				if(k != 0){
					flag1 = false;
				}
			}
			if( flag1== true){
				result.add(i);
			}
		}
		// first get all the individual strings in and put it in the Hashmap
		return result;
	}
}
