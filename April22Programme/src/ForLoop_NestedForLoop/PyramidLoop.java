package ForLoop_NestedForLoop;

public class PyramidLoop 
{
	int n=4;
	  public void a1()
	  {

		  {
			  for(int i=1;i<=n;i++)
			  {
				  for(int j=1;j<=(n-i);j++) 
				  {
					  
				 System.out.print("  "); 
				  }
				  for(int k=1;k<=(2*i)-1;k++)
				  {
				  System.out.print("* ");
			  }
				  System.out.println( );
			  }
		  }
		  }
	  public static void main(String[]args)
	  {
		  PyramidLoop s = new PyramidLoop();
		  s.a1();
	  }
	  
}
