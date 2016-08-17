package Testing;

public class main {
	
	static int size; 
	
	static int frames[];
	main(){
		size =10;
		frames = new int[10];
	}
	public static void required() {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i =0 ; i < size ; i++)
		{
				frames[i] = i;
				//update(i);
		}
		System.out.println("Printfing the contents");
		for(i =0 ; i < size ; i++)
		{
			System.out.print("  "+ frames[i]);
		}
		
	    for (  i = 0; i < size; ++i ) 
	    {
	         k = i;
	        if ( i == 5 ) 
	        {
	            update(k);
	        }
	    }
	    
	}
	private static void update(int frame)
	  {
		int index;
		int i;
	     for ( index=0; index < size; ++index )
	     {
	        if ( frames[index] == frame )
	        {
	            break;
	        }
	     }
	     while ( index-- > 0 )
	     {
		        frames[index+1] = frames[index];
	     }
		 frames[0] = frame;
		 
		 System.out.println("Printfing the contents");
			for(i =0 ; i < size ; i++)
			{
				System.out.print("  "+ frames[i]);
			}
		
	  }
	private static void update1(int frame)
	  {
		int index;
		int i;
	     for ( index=0; index < size; ++index )
	     {
	        if ( frames[index] == frame )
	        {
	            break;
	        }
	     }
	     while ( ++index < size )
	     {
		        frames[index-1] = frames[index];
	     }
		 frames[size-1] = frame;
		 
		 System.out.println("Printfing the contents");
			for(i =0 ; i < size ; i++)
			{
				System.out.print("  "+ frames[i]);
			}
		
	  }


}
