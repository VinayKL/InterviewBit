package DynamicProgramming;

class Stairs1 {
	public static void main(String args[]){
		System.out.println(climbStairs(4));
	}
	public static int climbStairs(int a) {
		int result[] = new int[a+1];
		if( a ==0){
			return 0;
		}
		if( a == 1){
			return 1;
		}
		result[0]=1;
		result[1]=1;
		for( int i= 2 ; i <= a ; i++){
			result[i] = result[i-1]+ result[i-2];
		}
		return result[a];
	}
}
public class Stairs extends Stairs1{
	
}