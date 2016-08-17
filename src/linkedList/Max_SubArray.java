package linkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class Max_SubArray {
		public static void main(String args[]){
			
			
			Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            //sc.nextLine();
            //System.out.println(x);
            int n= 0;
            int m =0;
            int max =0;
            ArrayList<Integer> A = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            for( int k =0 ; k < x; k++){
            	A.clear();
            	sc.nextLine();
            	n =sc.nextInt();
            	m =sc.nextInt();
            	sc.nextLine();
            	for( int i = 0 ; i < n ; i++){
            		A.add(sc.nextInt());
            	}
            	max =calmax(A,m);
    			b.add(max);
            }
            for( int j=0; j< b.size();j++){
            	System.out.println(b.get(j));
            }
            
			//int A[]= {3,3,9,9,5};
			
			//int n = 7;
			
		}
		public static int calmax(ArrayList<Integer> a,int n){
			int result =0;
			int sum=0;
			int k =0;
			for( int i =0 ;i < a.size() ; i++){
				for(int j = i ; j < a.size() ; j++){
					k = j;
					sum=0;
					while( k>=i){
						int x;
					    x = (int) a.get(k);
					    sum = sum + x;
						k--;
					}
					sum = sum %n;
					if( sum > result){
						result = sum ;
					}
				}
			}
			return result;
			
		}
}
