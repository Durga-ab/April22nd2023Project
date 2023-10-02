package ForLoop_NestedForLoop;

public class BorderquareLoop1 
{
	int a;
	 int b;

	 public void a1()
	{
		for(a=1;a<=5;a++)
		{
			for(b=1;b<=5;b++)
			{
				if(a==1||a==5||b==1||b==5 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	 public static void main(String[]args)
	 {
		 BorderquareLoop1 s = new BorderquareLoop1();
		 s.a1();
	 }
}
