package controlStatement;

public class NestedIfElseStatement4 
{
int a = -7;
public void a1()
{
	System.out.println("Even, Odd Or Negative");
	
	if(a>0)
		
	{
	System.out.println("Yes no is Positive");
	
	if(a%2==0)
		
	{
		System.out.println("Yes No is an even no");
	}
	}
	else
	{
		System.out.println("Number is odd");
	}
	
}
public static void main(String[]args)
{
	NestedIfElseStatement4 s = new NestedIfElseStatement4();
	s.a1();
}
}
