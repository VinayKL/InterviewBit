package Strings;

public class CompareVersionNumbers {
	public static void main(String args[]){
		String a = "01";
		String b = "1";
		int result = compareVersion(a,b);
		System.out.println(result);
	}
	public static int compareVersion(String a, String b) {
		int result =0;
		double num11 =0;
		double num22 =0;
		String a1 = null;
		String b1 =null;
		int num1 = a.indexOf(".");
		if( num1 == -1){
			num11 = Double.valueOf(a);
		}else{
			num11 = Double.valueOf(a.substring(0,num1));
			 a1 = a.substring(num1+1);
		}
		int num2 = b.indexOf(".");
		if( num2 ==-1){
			num22 = Double.valueOf(b);
		}else{
			num22 = Double.valueOf(b.substring(0,num2));
			 b1 = b.substring(num2+1);
		}
	 
		
		if( num11 > num22){
			return 1;
		}
		else if(num11 < num22){
			return -1;
		}
		else if( num11 == num22){
			//System.out.println(a1 +" "+ b1 );
			if( a1 ==null &&  b1 ==null){
				return 0;
			}
			else if( a1!= null && b1!=null){
				result = compareVersion(a1,b1);
			}
			else if( a1==null){
				if(Double.valueOf(b1)==0.0){
					return 0;
				}else{
					return -1;
				}
			}
			else if(b1==null){
				if(Double.valueOf(a1) == 0.0){
					return 0;
				}else{
					return 1;
				}
				
			}
		}
		return result;
		
	}
}
