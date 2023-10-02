package practiceLogicalProgram;

public class SumOfArrayMissingNumber 
{
	public static void main(String[]args)
	{
		int a[]= {11,12,13,15};
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
		int sum2=0;
		for(int i=11;i<=15;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		System.out.println(sum2-sum1);
	}

}
