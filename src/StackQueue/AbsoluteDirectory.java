package StackQueue;

public class AbsoluteDirectory {
	public static void main(String args[]){
		String A = "/a/./b/../../c/";
		String result;
		result = simplifyPath(A);
		System.out.println(result);
	}
	public static String simplifyPath(String a) {
		String A;
		int counter =0;
		String B[] = a.split("/");
		for(String s : B){
			//System.out.println(s);
			counter++;
		}
		A = "/"+B[counter-1];
		//System.out.println(B[counter-1]);
		if(B[counter-1].equals("..")){
			//System.out.println("true");
			return "/";
		}
	    return A;
	}
}
