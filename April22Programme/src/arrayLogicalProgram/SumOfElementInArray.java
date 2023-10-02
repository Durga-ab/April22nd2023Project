package arrayLogicalProgram;

public class SumOfElementInArray 
{
	public static void main(String[] args) 
	{
		int a []  = {1,2,3,4,5,6,7};
		
		int sum=0;
		
		for(int value:a)
		{
			sum=sum+value;//0+1=1  1+2=3
		}
		System.out.println(sum);
		
	}

}
