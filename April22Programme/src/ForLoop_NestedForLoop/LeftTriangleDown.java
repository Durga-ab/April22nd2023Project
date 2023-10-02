package ForLoop_NestedForLoop;

public class LeftTriangleDown 
{
	int i;
	int j;
	
	public void a1()
	{
		for(i =1;i<=4;i++)
		{
			for( j=4;j>=i;j--)	
			{
				
				System.out.print(" * ");
			}	
				System.out.println("  ");
			
		}
	}
	public static void main(String[]args)
	{
		LeftTriangleDown s = new LeftTriangleDown();
		s.a1();
	}
}

	
	


