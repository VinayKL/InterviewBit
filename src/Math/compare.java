package Math;

public class compare {
	public static int compare(String A, String B){
		A= A.replaceFirst("^0+(?!$)", "");
		B= B.replaceFirst("^0+(?!$)", "");
		//Compare the length. 
		if( A.length() > B.length()){
			return 1;
		}else if(B.length() > A.length()){
			return 2;
		}else{
			// if both are of same length
			for(int i=0;i<A.length();i++){
				if(Integer.valueOf(A.charAt(i)) > Integer.valueOf(B.charAt(i))){
					return 1;
				}
				else if(Integer.valueOf(B.charAt(i)) > Integer.valueOf(A.charAt(i))){
					return 2;
				}else{
					
				}
			}
		}
		// return 0 if both are same value
		return 0;
	}
	
	public static void main(String args[]){
		int result = compare("012345","12345");
		if( result ==0){
			System.out.println("Both are same value");
		}else if(result ==1){
			System.out.println("First number is greater");
		}else{
			System.out.println("Second number is greater");
		}
	}
}
