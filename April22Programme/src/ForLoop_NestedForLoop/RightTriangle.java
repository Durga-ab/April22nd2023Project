package ForLoop_NestedForLoop;

public class RightTriangle 
{
	int i;
	int j;
	int k;
	
	public void a1(){
		{
		for(i=1;i<=4;i++)
		{
			for( j=4;j>=i;j--)
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
		
	}
		 public static void main(String[] args)
		  {
			 RightTriangle s = new RightTriangle();
			    s.a1();
		  }

}
