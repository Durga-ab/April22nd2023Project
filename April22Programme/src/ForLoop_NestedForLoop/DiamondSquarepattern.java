package ForLoop_NestedForLoop;

public class DiamondSquarepattern 
{
public void a1()
	
	{
		int n= 5;
		
		for(int i =1; i<=n; i++)
		{
			for(int j= 1; j<=n-i;j++)
			{
				System.out.print(" ");
			}
			 for(int j=1; j<=2*i-1; j++)
			 {
				 System.out.print("*"); 
			 }
			 System.out.println();
		}
		
		for(int i=n; i>=1; i--)
		{
			for(int j= 1; j<=n-1;j++)
			{
				System.out.print(" ");
			}
			 for(int j=1; j<=2*i-1; j++)
			 {
				 System.out.print("*"); 
			 }
			 System.out.println();
		}
	}

 public static void main(String[]args)
 {
			DiamondSquarepattern s = new DiamondSquarepattern();
	        s.a1();
 }
}
