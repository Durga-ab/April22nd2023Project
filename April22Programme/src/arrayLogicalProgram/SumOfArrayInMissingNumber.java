package arrayLogicalProgram;

public class SumOfArrayInMissingNumber
{
	public static void main(String[]args)
	{
		int a[]= {1,2,4,5};
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of sum1:"+sum1);
		
		for(int i=0;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of sum2:"+sum2);
		
		System.out.println("Missing no:"+(sum2-sum1));
	}

}
