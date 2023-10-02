package ForLoop_NestedForLoop;

public class BorderSquareLoop
{
 int a;
 int b;

 public void a1()
{
	for(a=1;a<=5;a++)
	{
		for(b=1;b<=5;b++)
		{
			if(a>=2 && b>=2 && a<=4 && b<=4 )
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
			
	}
}
 public static void main(String[]args)
 {
	 BorderSquareLoop s = new BorderSquareLoop();
	 s.a1();
 }
}
