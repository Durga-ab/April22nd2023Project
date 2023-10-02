package controlStatement;

public class NestedIfElseStatement2 
{
int a = 500;
int b = 200;
public void a1()
{
	if(a==b)
	{
		if(a!=b)
		{
		System.out.println("Condition is valid");	
		}
	}
	else
	{
		System.out.println("condition is not valid");
	}
}
public static void main(String[]args)
{
	NestedIfElseStatement2 s = new NestedIfElseStatement2();
	s.a1();
}
}
