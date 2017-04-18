package StackQueue;

import java.util.ArrayList;
import java.util.Stack;

public class AbsoluteDirectory {
	public static void main(String args[]){
		String A = "/../";
		String result;
		result = simplifyPath(A);
		System.out.println(result);
	}
	public static String simplifyPath(String a) {
		StringBuilder result = new StringBuilder();
		ArrayList<String> res_temp = new ArrayList<String>();
		if(a.charAt(a.length()-1)== '/'){
			a = a.substring(0,a.length()-1);
		}
		
		String chunks[] = a.split("/");
		Stack<String> sk = new Stack();
		for(int i= 0; i< chunks.length; i++){
				if( !chunks[i].equals("") ){
					sk.push(chunks[i]);
				}
		}
		
		int count_back =0;
		
		while(!sk.isEmpty()){
			String curr = sk.pop();
			if( curr.equals(".") ){
				//do nothing
			}else if ( curr.equals("..")){
				count_back++;
			}else{
				if( count_back >0){
					// skip the insertion
					count_back--;
				}else{
					res_temp.add(curr);
				}
			}
		}
		if(res_temp.size() == 0){
			return "/";
		}
		for ( int i = res_temp.size()-1 ; i>=0 ;i--){
			String s = res_temp.get(i);
			result.append("/"+s);
		}
		
		return result.toString();
	}
}
