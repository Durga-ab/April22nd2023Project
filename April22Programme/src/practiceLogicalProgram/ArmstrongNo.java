package practiceLogicalProgram;

public class ArmstrongNo 
{
	public static void main(String[]args)
	{
		int n=371;
		int a=n;
		int b=0;
		int c;
		
		while(a>0)
		{
			c=a%10;
			b=b+(c*c*c);
			a=a/10;
		}
		if(n==b)
		{
			System.out.println("This is Armstrong no");
		}
		else
		{
			System.out.println("This is no Armstrong no");
		}
	}

}
