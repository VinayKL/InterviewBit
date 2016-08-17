package Bit;

public class OnlySetBit {
	public static void main(String args[]){
		int value = 4;
		int position =0;
		position = callmethos(value);
		System.out.println(position);
	}

	private static int callmethos(int value) {
		// TODO Auto-generated method stub
		int result =0;
		for(int i=0 ; i< 32 ; i++)
		{
			if((value & (1 << i)) == 0){
				result++;	
			}
			else {
				result++;
				return result;
			}
				
		}
		return result;
	}

}
