package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class wordLadder2 {

	public static void main(String args[]){
		String start = "hit";
		String end = "cog";
		ArrayList<String> set =  new ArrayList<String>();
		set.add("hot");
		set.add("dot");
		set.add("dog");
		set.add("lot");
		set.add("log");
		System.out.println(ladderLength(start,end,set));
		
	}
	
	public static ArrayList<ArrayList<String>> findLadders(String start, String end, ArrayList<String> dictV) {
		int result =0;
		Queue<Word> que = new LinkedList<Word>();
		Word st = new Word(start,1);
		que.offer(st);
		dictV.add(end);
		
		
		while(!que.isEmpty()){
			Word s= que.poll();
			String curr = s.word;
			if( curr.equals(end) ){
				
				result = s.length;
				return result;
			}
			int ld = s.length;
			int length = curr.length();
			char[] st1 = new char[length];
			
			for(int i=0 ;i < length ; i++){
				char c = curr.charAt(i);
				for( char ch = 'a'; ch <= 'z' ;ch ++){
					if ( ch == c){
						
					}else{
						
						st1 = curr.toCharArray();
						st1[i] = ch;
					}
					
					String st2 = new String(st1);
					if(dictV.contains(st2)){
						que.add(new Word(st2,ld+1));
						dictV.remove(st2);
					}
					st1[i] = c;
				}
				
				
			}
		}
		return result;
		
	}
}
class Word{
	String word;
	int length;
	public Word(String word,int lenght){
		this.word = word;
		this.length = lenght;
	}
}
