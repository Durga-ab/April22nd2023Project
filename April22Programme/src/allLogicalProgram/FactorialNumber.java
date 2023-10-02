package allLogicalProgram;

public class FactorialNumber 
{
	//Mathetatical operation of multiplying a no. with all the smaller no.
	//ex:5!=5*4*3*2*1=120
	double number=5;
	double fact=1;
	
	public void a1()
	{
		for(double i=1;i<=number;i++) // 1(2) 2(3) 3(4) 4(5) 5(6)
		{
			fact=fact*i;          //1*2*3*4*5=120
		}
		System.out.println("Factorial Number:" +fact);
	}
	public static void main(String[]args)
	{
		FactorialNumber s = new FactorialNumber();
		s.a1();
	}
}
