package controlStatement;

public class NestedIfStatement
{
int a = 200;
int b = 50;
int c = 309;
int d = 400;
public void a1()
{
	if(a>b && c>d)
	{
	System.out.println("True");	
	
	if(b>d && d>a)
	{
		System.out.println("False");
	}
	}
	System.out.println("Smart");
}
public static void main(String[]args)
{
	NestedIfStatement s = new NestedIfStatement();
	s.a1();
}
}
