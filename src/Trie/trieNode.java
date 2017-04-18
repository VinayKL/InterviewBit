package Trie;
import java.util.HashMap;

public class trieNode {
	char c;
	HashMap<Character,trieNode> children = new HashMap<Character, trieNode>();
	boolean isaLeaf;
	public trieNode(){
		
	}
	public trieNode(char c){
		this.c = c;
	}
}
