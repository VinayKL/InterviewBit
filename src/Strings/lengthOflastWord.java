package Strings;

public class lengthOflastWord {
	public static void main(String args[]){
		String s = "Hello World";
		int len =0;
		
		len =length(s);
		System.out.println(len);
	}
	private static int length(String s) {
		// TODO Auto-generated method stub
		String[] splitArray = s.split("\\s+");
		int result =0;
		for(String name:splitArray){
			result =0;
			for (char c : name.toCharArray()){
			result++;
			}
		}
		
		return result;
	}
	
	
}
