package Trie;

import java.util.HashMap;

public class trie {
	private trieNode root;
	public trie(){
		root = new trieNode();
	}
	public  void insert(String input){
		HashMap<Character,trieNode> children = root.children;
		for( int i =0 ;i < input.length() ; i++){
			char ch = input.charAt(i);
			trieNode t;
			if(children.containsKey(ch)){
				//System.out.println(ch + " already there");
				t = children.get(ch);
			}else{
				t = new trieNode(ch);
				children.put(ch, t);
				//System.out.println("added "+ch);
			}
			children = t.children;
			if(  i == input.length()-1){
				t.isaLeaf = true;
			}
		}
	}
	public Boolean search( String s){
		trieNode res = searchst(s);
		if( res != null && res.isaLeaf == true){
			return true;
		}else{
			return false;
		}
	
	}
	public Boolean startswith( String s){
		trieNode res = searchst(s);
		if( res == null){
			return false;
		}
		return true;
	}
	public trieNode searchst(String s){
		HashMap<Character,trieNode> children = root.children;
		trieNode t = null;
		for( int i =0 ; i< s.length() ; i++){
			char ch = s.charAt(i);
			if(children.containsKey(ch)){
				//System.out.println(ch+" found");
				t  = children.get(ch);
				children = t.children;
			}else{
				//System.out.println(ch+ " not found.returning");
				return null;
			}
		}
		return t;
	}
}
