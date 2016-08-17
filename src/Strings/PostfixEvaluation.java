package Strings;

import java.util.Stack;

/**
 * Created by vinaykl on 2/23/16.
 */
public class PostfixEvaluation {
    public static void main(String[] args){
        String[] op = {"5", "1", "2", "+", "4", "*", "+", "-3", "-"};
        System.out.println("Value of the expression is " + evalPostfixExpression(op));
    }
    public static int evalPostfixExpression(String[] op ){
        Stack st = new Stack();
        if(op.length ==1){
           return Integer.parseInt(op[0]);
        }
        // Step 1 : Push the input into the stack
        for(String str: op ){
            if(IsOp(str) ==1)
            {
                int z = 0;
                Integer y = (Integer) st.pop();
                Integer x = (Integer) st.pop();
                switch (str) {
                    case "+":
                         z = x + y;
                         break;
                    case "-":
                         z = x - y;
                         break;
                    case "*":
                         z = x * y;
                         break;
                    case "/":
                         z = x / y;
                         break;
                }
                st.push(z);
            }
            else if(IsOp(str)==2)
            {
            	Integer value = Integer.parseInt(str);
                st.push(value);
            }
        }
        return (int) st.pop();
    }
    public static int IsOp(String s) {
    	if(s.charAt(0)>='0' && s.charAt(0)<='9' || s.charAt(0)<='-' && s.length()>1 && s.charAt(1)>='0' && s.charAt(1)<='9')
        {
        	//System.out.println(s);
            return 2;
        }
        else
        {
        	//System.out.println(s+"returning 1");
            return 1;
        }
    }
}
