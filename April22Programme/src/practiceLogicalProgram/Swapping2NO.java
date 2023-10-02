package practiceLogicalProgram;

public class Swapping2NO 
{
	public static void main(String[]args)
	{
		int a=10;
		int b=20;
		
		System.out.println("Before Swa[pping no:"+a+""+b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After Swapping no:"+a+""+b);
	}

}
