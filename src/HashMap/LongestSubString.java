package HashMap;

import java.util.HashMap;

public class LongestSubString {
	public static void main(String args[]){
		String A = "bbbbb";
		int result = lengthOfLongestSubstring(A);
		System.out.println(result);
	}
	public static int lengthOfLongestSubstring(String a) {
		int result =0;
		if(a.length()==1){
			return 1;
		}
		
		
		
		for( int i =0 ; i< a.length(); i++){
			int counter =0;
			HashMap< Character, Integer> map = new HashMap<Character,Integer>();
			for(int j = i ; j < a.length() ; j++){
				if(map.containsKey(a.charAt(j))){
					break;
				}else{
					map.put(a.charAt(j), 1);
					counter++;
				}
			}
			if( counter > result){
				result = counter;
			}
		}
		
		return result;
	}

}
/* given
 * 
 *   int count = 0;
        int max = 0;
	    int n = A.length();
	    HashMap<Character, Integer> hashMap = new HashMap<>();
	    char c;
	    int prevIndex;
	    
	    for (int i = 0; i < n; i++) {
	        
	        c = A.charAt(i);
	        
	        if (hashMap.containsKey(c)) {
	            prevIndex = hashMap.get(c);
	            count = Math.min(count + 1, i - prevIndex);
	            hashMap.put(c, i);
	        } else {
	            count++;
	            hashMap.put(c, i);
	        }
	        
	        max = Math.max(max, count);
	    }
	    
	    return max;
	    */
