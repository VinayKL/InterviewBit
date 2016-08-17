package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Given_Anagram {
	public class Solution {
		public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
		    
		    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		    HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
		    int i = 1;
		    
		    for (String str : A) {
		        
		        char [] array = str.toCharArray();
		        Arrays.sort(array);
		        String sorted = new String(array);
		        
		        if (hashMap.containsKey(sorted)) {
		            ArrayList<Integer> list = hashMap.get(sorted);
		            list.add(i);
		        } else {
		            ArrayList<Integer> list = new ArrayList<>();
		            list.add(i);
		            hashMap.put(sorted, list);
		        }
		        
		        i++;
		        
		    }
		    
		    for (Entry<String, ArrayList<Integer>> entrySet : hashMap.entrySet()) {
		        res.add(entrySet.getValue());
		    }
		    
		    return res;
		    
		}
	}

}
