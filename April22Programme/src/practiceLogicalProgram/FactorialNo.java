package practiceLogicalProgram;

public class FactorialNo 
{
	double no=5;
	double fact=1;
	public void a1()
	{
		
		for(double i=0;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[]args)
	{
		FactorialNo s= new FactorialNo();
		s.a1();
	}
}
