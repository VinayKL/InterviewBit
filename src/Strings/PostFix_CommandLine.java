package Strings;

import java.util.ArrayList;
import java.util.Stack;

public class PostFix_CommandLine {
    public static void main(String[] args){
    	ArrayList<String> ar = new ArrayList<String>();
    	if(args.length>1)
    	{
    		for(int i=0;i<args.length;i++){
    			ar.add(args[i]);
    		}
    	}
        System.out.println("Value of the expression via CL is " + evalPostfixExpression(ar));
    }
    public static int evalPostfixExpression(ArrayList ar ){
        Stack st = new Stack();
        if(ar.size() ==1){
           return Integer.parseInt((String) ar.get(0));
        }
        // Step 1 : Push the input into the stack
        for(int i =0 ;i<ar.size() ;i++ ){
            if(IsOp((String) ar.get(i)) ==1)
            {
                int z = 0;
                Integer y = (Integer) st.pop();
                Integer x = (Integer) st.pop();
                switch ((String) ar.get(i)) {
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
            else if(IsOp((String) ar.get(i))==2)
            {
            	Integer value = Integer.parseInt((String) ar.get(i));
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
