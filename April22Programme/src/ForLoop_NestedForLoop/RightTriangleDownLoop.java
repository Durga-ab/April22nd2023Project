package ForLoop_NestedForLoop;

public class RightTriangleDownLoop 
{
	int i;
	int j;
	int k;
	
	    public void a1()
		{
		for(i=1;i<=4;i++)
		{
			for( j=1;j<=i;j--)
			{
				System.out.print(" ");
				
			}
				for(k=1;k<=i;k++)	
				{
					System.out.print("*");
				}
				 System.out.println(); 
		  }		 
		}	
		
	
         public static void main(String[]args)
         {
        	 RightTriangleDownLoop s = new RightTriangleDownLoop();
        	 s.a1();
         }
		 
}
