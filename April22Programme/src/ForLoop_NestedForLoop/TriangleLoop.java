package ForLoop_NestedForLoop;

public class TriangleLoop 
{
	
		public void a1() 
		{
			
			for (int i =1; i<=5; i++) 
			{
				for (int j=1; j<=i; j++) 
				{
					System.out.print("* ");  
				}
				System.out.println();
			}
		}
		public static void main(String[]args)
		{
			TriangleLoop a = new TriangleLoop();
			a.a1();
		}

	}

