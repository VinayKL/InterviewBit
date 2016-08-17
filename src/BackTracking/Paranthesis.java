package BackTracking;

import java.util.ArrayList;

public class Paranthesis {
	public static void main(String args[]){
		ArrayList<String> result = new ArrayList<String>();
		int input = 3;
		result = generateParenthesis(input);
		System.out.println(result);
		
	}
	public static ArrayList<String> generateParenthesis(int a) {
		ArrayList<String> result = new ArrayList<String>();
		if(a ==1){
			result.add("()");
			return result;
		}
		dfs(result,"",a,a);
		return result;
	}
	public static void dfs(ArrayList<String> result, String s, int left, int right){
	    if(left > right)
	        return;
	 
	    if(left==0&&right==0){
	        result.add(s);
	        return;
	    }
	 
	    if(left>0){
	        dfs(result, s+"(", left-1, right);
	    }
	 
	    if(right>0){
	        dfs(result, s+")", left, right-1);
	    }
	}
}
