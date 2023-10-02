package controlStatement;

public class IfElseStatement1 
{
int a = 30;
int b = 25;

public void a1()    
{
	if(a>b||b<a)
	{
	System.out.println ("true");
	}
	else
	{
		System.out.println("false");
	}

}
public static void main(String[]args)
{
	IfElseStatement1 s = new IfElseStatement1();
	s.a1();
}
}
