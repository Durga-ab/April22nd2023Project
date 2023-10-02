package practiceLogicalProgram;

public class Largestnumber 
{
	public static void main(String[]args)
	{
		int a=10;
		int b=20;
		int c=30;
		
		int largest= a>b?a:b;
		int largest1=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest1);
	}

}
