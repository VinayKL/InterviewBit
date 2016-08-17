package StackQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PostfixEvaluation {
	public static void main(String args[]){
		ArrayList<String> input = new ArrayList<String> (Arrays.asList("5", "1", "2", "+", "4", "*", "+", "3", "-"));
		int result = evalRPN(input);
		System.out.println(result);
	}
	public static int evalRPN(ArrayList<String> a) {
		Stack vkl = new Stack();
		for( int i =0 ; i < a.size() ; i++){
			String s = a.get(i);
			//System.out.println(s);
			if(s.equals("+") ||s.equals("-")||s.equals("/")||s.equals("*") ){
				int op1 = (int) vkl.pop();
				int op2 = (int) vkl.pop();
				int result = 0;
				if( s.equals("+")){
					result = op2 + op1;
				}else if(s.equals("-")){
					result = op2 - op1;
				}else if( s.equals("/")){
					result = op2 / op1;
				}else if( s.equals("*")){
					result = op2 * op1;
				}
				vkl.push(result);
			}else {
				 int temp = Integer.parseInt(s);
				 vkl.push(temp);
			}
		}
		return (int) vkl.pop();
	}
}
