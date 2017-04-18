package DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;

public class wordBreak2 {
	public static void main(String args[]){
		String a = "catsanddog";
		ArrayList<String> input = new ArrayList<String>();
		input.add("cat");
		input.add("cats");
		input.add("and");
		input.add("sand");
		input.add("dog");
		System.out.println(wordBreak(a,input));
	}
	public static ArrayList<String> wordBreak(String a, ArrayList<String> b) {
	    ArrayList<String>[] res = new ArrayList[a.length()+1];
	    ArrayList<String> temp = new ArrayList<String>();
	    res[0] =temp;
	    for( int i=0 ;i < a.length(); i++){
	        if( res[i] != null){
	            for( int j =i+1; j < a.length()+1 ; j++){
	                String s = a.substring(i,j);
	                if(b.contains(s)){
	                    if( res[j] == null){
	                        ArrayList<String> ss = new ArrayList<String> ();
	                        ss.add(s);
	                        res[j] = ss;
	                    }else{
	                        res[j].add(s);
	                    }
	                }
	            }
	        }
	    }
	    
	    if( res[a.length()] == null ){
	        return new ArrayList<String> ();
	    }else{
	        ArrayList<String> output = new ArrayList<String>();
	        DFS(res, output,"",a.length());
	        Collections.sort(output);
	        return output;
	    }
	}
	public static void DFS(ArrayList<String>[] res ,ArrayList<String> output, String curr, int i ){
	    if( i ==0){
	        String new1 = new String(curr.trim());
	        output.add(new1);
	        return;
	    }
	    for( String s: res[i]){
	        curr = s +" "+curr;
	        DFS(res,output,curr,i-s.length());
	        curr = curr.substring(s.length()+1);
	    }
	}
}
