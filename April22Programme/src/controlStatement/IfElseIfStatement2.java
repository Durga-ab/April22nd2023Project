package controlStatement;

public class IfElseIfStatement2 
{


	
int a = 500;
int b = 400;
public void a1()
{
	if(a>b ||b<=a)
	{
		System.out.println("Great deal");
	}
	else if(b>a ||a<=b)
	{
		System.out.println("Good deal");
	}
	else if (b>a||a<b)
	{
		System.out.println("So So deal");
	}
	else 
	{
		System.out.println("Not Profitable");
	}
}
public static void main(String[]args)
{
	IfElseIfStatement2 s = new IfElseIfStatement2();
	s.a1();
}
}
