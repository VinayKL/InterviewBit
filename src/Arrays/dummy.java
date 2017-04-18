package Arrays;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class dummy {
	public static void main(String args[]){
		HashMap<String,Integer> map = new HashMap();
		map.put("vkl",2);
		map.put("vinay", 23);
		Iterator it = (Iterator) map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair  = (Entry) it.next();
			System.out.println(pair.getKey());
			System.out.println(pair.getValue());
			
		}
	}
}
