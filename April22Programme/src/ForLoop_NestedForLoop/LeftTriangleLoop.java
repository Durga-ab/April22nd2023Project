package ForLoop_NestedForLoop;

public class LeftTriangleLoop 
{
	
	int a;
	int b;
	
	public void a1()
	{
		
	for(int a=1; a<=4;a++) 
	{
		for(int b=1; b<=a;b++) 
		{				
	         System.out.print(" * ");
        } 
	      System.out.println(" ");
	
	}
	}	
        public static void main(String[]args)
        {
        	LeftTriangleLoop w = new LeftTriangleLoop();
        	w.a1();
        }
}


