package practiceLogicalProgram;

public class Reverseno 

{
	public static void main(String[]args)
	{
		int n=456;
		int a= n;
		int b=0;
		int c;
		
		while(a>0)
		{
			c=a%10;
			b=b*10+c;
			a=a/10;
		}
		System.out.println(b);
	}

}
