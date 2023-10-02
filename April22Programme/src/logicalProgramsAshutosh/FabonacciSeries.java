package logicalProgramsAshutosh;

public class FabonacciSeries 
{
	public static void main(String[] args) 
	{
		int n=10;
		int a=0;
		int b=1;
		int c;
		int i=0;
		System.out.println("Fabonacci Series");
		System.out.print(a);
		System.out.print(" "+b);
		while(i<=n)
		{
			c=a+b;
			a=b;
			b=c;
			i++;
			System.out.print(" "+c);
		}
		
		
		
	}

}
