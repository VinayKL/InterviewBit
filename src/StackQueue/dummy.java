package StackQueue;

public class dummy {
	public static void main(String args[]){
		  StackImplemantation vkl = new StackImplemantation();
		  vkl.push(10);
		  vkl.push(9);
		  System.out.println(vkl.getMin());
		  vkl.push(8);
		  System.out.println(vkl.getMin());
		  vkl.push(7);
		  System.out.println(vkl.getMin());
		  vkl.push(6);
		  System.out.println(vkl.getMin());
		  vkl.pop();
		  System.out.println(vkl.getMin());
		  vkl.pop();
		  System.out.println(vkl.getMin());
		  vkl.pop();
		  System.out.println(vkl.getMin());
		  vkl.pop();
		  System.out.println(vkl.getMin());
		  vkl.pop();
		  System.out.println(vkl.getMin());
		  
		  
	   }
}
