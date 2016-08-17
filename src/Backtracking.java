import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Backtracking {
	public static void main(String args[]){
		String a = "23";
		ArrayList<String> result = new ArrayList<String>();
		result = letterCombinations(a);
		System.out.println(result);
		
	}
	public static ArrayList<String> letterCombinations(String a) {
		ArrayList<String> result = new ArrayList<String>();
		//HashMap<Integer, Set> Map = new HashMap<Integer,Set>();
		//Map =initialize();
		//System.out.println(Map);
		System.out.println(a.charAt(0)-'2');
		
		return result;
	}
	public static HashMap<Integer, Set> initialize(){
		HashMap<Integer, Set> Map = new HashMap<Integer,Set>();
		HashSet<Character> set = new HashSet();
		set.add('a');
		set.add('b');
		set.add('c');
		Map.put(2,set);
		set.clear();
		set.add('d');
		set.add('e');
		set.add('f');
		Map.put(3,set);
		set.clear();
		set.add('g');
		set.add('h');
		set.add('i');
		Map.put(4,set);
		set.clear();
		set.add('j');
		set.add('k');
		set.add('l');
		Map.put(5,set);
		set.clear();
		set.add('m');
		set.add('n');
		set.add('o');
		Map.put(6,set);
		set.clear();
		set.add('p');
		set.add('q');
		set.add('r');
		set.add('s');
		Map.put(7,set);
		set.clear();
		set.add('t');
		set.add('u');
		set.add('v');
		Map.put(8,set);
		set.clear();
		set.add('w');
		set.add('x');
		set.add('y');
		set.add('z');
		Map.put(9,set);
		
		return Map;
	}
}
