package Strings;

public class ZigZag {
	public static void main(String args[]){
		String input = "AB";
		int rows = 1;
		System.out.println(convert1(input,rows));
	}
	public static String convert(String a, int b) {
		StringBuilder result = new StringBuilder();
		if( b==1){
			return a;
		}
		String vkl[] = new String[b];
		int assign = 0;
		int flag = 1;
		int i=0;
		while( i < a.length()){
			if(  vkl[assign] == null){
				vkl[assign] = Character.toString(a.charAt(i));
			}else{
				vkl[assign] = vkl[assign]+a.charAt(i);
			}
			if( flag ==1){
				assign++;
				if( assign == b-1){
					flag =0;
				}
			}else if( flag ==0){
				assign--;
				if( assign==0){
					flag=1;
				}
			}
			i++;
		}
		for( int j=0; j < b ; j++){
			if( vkl[j] == null){
				
			}else{
				result.append(vkl[j]);
			}
			
		}
		return result.toString();
	}
	
	public static String convert1(String s, int numRows) {
        if( s== null){
            return null;
        }
        if( s.length() == 0 || s.length() ==1 || numRows ==1){
            return s;
        }
        String res[] = new String[numRows];
        int j =0;
        boolean flag = true;
        for( int i = 0 ; i< s.length() ; i++){
            if( flag == true){
                if(res[j] == null){
                    res[j]=  Character.toString(s.charAt(i));
                }else{
                    res[j] += s.charAt(i);
                }
                j++;
                if( j== numRows-1){
                    flag = false;
                }
            }
            else if( flag == false ){
                if(res[j] == null){
                    res[j]=  Character.toString(s.charAt(i));
                }else{
                   res[j] += s.charAt(i); 
                }
                
                j--;
                if( j==0){
                    flag = true;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for( int k =0 ; k< res.length ; k++){
            result = result.append(res[k]);
        }
        return result.toString();
    }
}
