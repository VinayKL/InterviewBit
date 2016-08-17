package Bit;

public class number1bits {
	public static int numSetBits(long a) {
	    int counter;
	    counter = 0;
	    for(int i=0; i<32; i++){
	        if(getBit(a, i) == true){
	            counter++;
	        }
	    }
	    return counter;
	    
	}
	public static boolean getBit(long a, int i){
	        return (a & (1 << i)) != 0;
	}
	public static void main(String args[]){
		long a;
		int count;
		count = numSetBits(11);
		System.out.println(count);
	}
}
