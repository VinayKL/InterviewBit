package StackQueue;

import java.util.Stack;
/*
 * LOGIC
 * keep pushing for anything else than ")".when you encounter a ")" keep popping till you get a "(" keeping in mind
 * 1) You cannot pop out "(" immediatly
 * 2) there should be more than 2 pops
 * At the end stack should not contain any "(" or  ")"
 */
public class Redundant_braces {
	public static void main(String args[]){
		String a = "(a)";
		//a = a.replaceAll("\\s+","");
		System.out.println(a);
		int result = braces(a);
		if(result ==1){
			System.out.println("There are redundant braces");
		}else{
			System.out.println("No redundant braces");
		}
	}
	public static int braces(String a) {
		Stack<Character> sk = new Stack();
		int flag = 0;
		for( int i = 0 ; i<a.length() ; i++){
			char ch = a.charAt(i);
			//System.out.println(" The character is "+ch);
			if( ch == '('){
				//System.out.println("Pushing "+ ch);
				sk.push(ch);
			}else if( ch == ')'){
				char pop1 = (char) sk.peek();
				if( pop1 == '('){
					//System.out.println("There is redudndency");
					flag =1 ;
					break;
				}else {
					int counter =0;
					while((char) sk.pop() != '('){
						counter++;
					}
					if( counter ==1){
						flag =1;
						break;
					}
				}
				
			}else{
				//System.out.println("Pushing "+ ch);
				sk.push(ch);
			}
		}
		if( flag ==1){
			return 1;
		}
		if(sk.contains('(')){
			return 1;
		}else{
			return 0;
		}
	}
}
