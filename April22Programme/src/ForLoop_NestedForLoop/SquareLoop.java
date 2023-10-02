package ForLoop_NestedForLoop;

public class SquareLoop
{
	
	 int i;
	 int j;
	
	
	 public void e1()
	 {
		 for(int i=0;i<5;i++)
		 {
			 for(j=0;j<=5;j++)
			 {
				 System.out.print(" * ");
			 }
			 System.out.println();
		  }
		 }
	 
	
	
	public static void main(String [] args)
	{
		SquareLoop g=new SquareLoop();
		g.e1();
	}

}
	

