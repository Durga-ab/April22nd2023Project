package practiceLogicalProgram;

public class FibonnaciSeries 
{
	public static void main (String[]args)
	{
	int n=20;
	int a=0;
	int b=1;
	int c;
	int i=0;
	while(i<n)
	{
		System.out.print(" " +a);
		c=a+b;
		a=b;
		b=c;
		i++;
		
	}
	}

}
