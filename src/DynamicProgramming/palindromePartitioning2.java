package DynamicProgramming;
import java.util.ArrayList;

public class palindromePartitioning2 {
	
	public static void main(String args[]){
		System.out.println(minCut("aab"));
	}
	public static int minCut(String a) {
		ArrayList <ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> temp =  new ArrayList<String>();
		
		compute(a,0,a.length()-1,temp,result);
		
		int min =Integer.MAX_VALUE;
		for(ArrayList<String> cut: result){
			
			min = Math.min(min, cut.size()-1);
		}
		return min;
	}
	
	public static void compute(String a, int start , int end ,ArrayList<String> temp,ArrayList <ArrayList<String>> result){	
		if( a.length() == start){
			ArrayList<String> vkl = new ArrayList<String>(temp);
			result.add(vkl);	
			return;
		}
		for(int i=start+1; i<= a.length() ; i++){
			String tk =a.substring(start,i);
			if(isPalindrome(tk)){
				
				temp.add(tk);
				compute(a,i,end,temp,result);
				temp.remove(temp.size()-1);		
			}
		}
	}
	
	public static boolean isPalindrome(String a){
		int start =0;
		int end = a.length()-1;
		while( start < end){
			if(a.charAt(start)!= a.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
}
