package practiceLogicalProgram;

public class SumOfDigit 
{
	public static void main(String[]args)
	{
		int no=1234;
		int sum=0;
		
		while(no>0)
		{
			sum=sum+no%10;
			no=no/10;
		}
		System.out.println(sum);
		
	}

}
