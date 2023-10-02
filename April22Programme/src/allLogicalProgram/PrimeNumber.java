package allLogicalProgram;

public class PrimeNumber 
{
  //prime number
  //check number is prime or not
  //Logic-if the no.is the divisible by only 1 & itself.
  //& not divisible by any other number
	
	int a = 5;
	int b = 0;
	int c = 0;
	int d = 0;
	
	public void a1()
	{
		for(c=2;c<5;c++)
		{
			b=a%c;
			if(b==0)
			{
				System.out.println(a+"is not prime number");
				d=d+1;
				break;
						
			}
		}
		if(d==0)
		{
			System.out.println(a+"is prime number");
		}
	}
	public static void main(String[]args)
	{
		PrimeNumber s = new PrimeNumber();
		s.a1();
	}
}
