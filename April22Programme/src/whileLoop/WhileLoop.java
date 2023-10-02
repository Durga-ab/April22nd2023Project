package whileLoop;

public class WhileLoop 
{
 // Standard Syntax
	//while(Condition){Statement}
	
	//print 1 to 10 numbers
	int a = 1;
	public void a1()
	{
		while(a<=10)
		{
			System.out.println(a);
			a++;
		}
	}
	public static void main(String[]args)
	{
		WhileLoop s = new WhileLoop();
		s.a1();
	}
}
