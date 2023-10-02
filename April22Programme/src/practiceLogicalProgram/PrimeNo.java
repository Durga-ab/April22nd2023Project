package practiceLogicalProgram;

public class PrimeNo 
{
	public static void main(String[]args)
	{
		int a=5;
		int b=0;
		int c=0;
		int d=0;
		
		for(c=2;c<5;c++)
		{
			b=a%10;
			if(b==0)
			{
				System.out.println(a+"Is nor priem no");
				d=d+1;
				break;
			}
		}
		if(d==0)
		{
			System.out.println(a+"This is prime no");
		}
	}

}
