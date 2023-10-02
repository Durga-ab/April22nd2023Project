package practiceLogicalProgram;

public class LargestElementArray 
{
	public static void main(String[]args)
	{
		int a[]= {10,20,30};
		int max=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
