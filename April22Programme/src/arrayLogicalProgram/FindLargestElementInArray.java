package arrayLogicalProgram;

public class FindLargestElementInArray 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		
		int max=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)//10>10=false  , 10>20=false ......
			{
				max=a[i];
			}
		}
		
		System.out.println(max);

			
		
		
	}

}
