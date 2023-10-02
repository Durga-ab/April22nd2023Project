package logicalProgramsAshutosh;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int n=123;
		int a=n;
		int b=0;
		int c;
		while(a!=0)
		{
			c=a%10;
			b=b*10+c;
			a=a/10;
		}
		if(b==n)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
	}

}
