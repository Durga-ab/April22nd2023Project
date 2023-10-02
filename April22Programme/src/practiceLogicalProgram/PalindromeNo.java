package practiceLogicalProgram;

public class PalindromeNo 
{
	public static void main(String[]args)
	{
		int n=191;
		int a= n;
		int b=0;
		int c;
		
		while(a>0)
		{
			c=a%10;
			b=b*10+c;
			a=a/10;
		}
		if(b==n)
		{
			System.out.println("This is palindrome no");
		}
		else
		{
			System.out.println("This is not palindrome nu");
		}
	}

}
