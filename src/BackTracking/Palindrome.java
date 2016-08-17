package BackTracking;

import java.util.ArrayList;

public class Palindrome {
	public static void main(String args[]){
		String a = "aababb";
		ArrayList<ArrayList<String>> List = new ArrayList<ArrayList<String>>();
		List = partition(a);
		System.out.println(List);
	}
	public static ArrayList<ArrayList<String>> partition(String a){
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		if(a.length() == 0 || a == null){
			return result;
		}
		ArrayList<String> temp = new ArrayList();
		working(a,0,result,temp);
		
		return result;
	}
	public static void working(String a,int Start,ArrayList<ArrayList<String>> result ,ArrayList<String> temp){
		if(a.length() == Start){
			ArrayList<String> temp1 = new ArrayList<String>(temp);
			result.add(temp1);
			return;
		}
		
		for(int i = Start+1; i<= a.length(); i++){
			String S= a.substring(Start,i);
			if(Palindrome(S)){
				temp.add(S);
				working(a,i,result,temp);
				temp.remove(temp.size()-1);
			}
		}
	}
	public static boolean Palindrome(String a){
		int length = a.length();
		int begin =0;
		int end = length-1;
		int middle = (begin + end )/ 2;
		int i=0;
		for( i =0; i<= middle ; i++){
			if(a.charAt(begin) == a.charAt(end)){
				begin++;
				end--;
			}else{
				break;
			}
		}
		if(i == middle+1){
			return true;
		}else{
			return false;
		}
	}
}
