package Trie;

public class usage {
	public static void main(String args[]){
		trie vkl =  new trie();
		vkl.insert("vinay");
		vkl.insert("vin");
		vkl.insert("shru");
		vkl.insert("cfd");
		
		System.out.println(vkl.search("vi"));
		System.out.println(vkl.search("vinay"));
		System.out.println(vkl.startswith("vin"));
		System.out.println(vkl.search("ddcads"));
		
	}

}
