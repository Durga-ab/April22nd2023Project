package controlStatement;

public class IfStatement 
{
int a ;

IfStatement(int s)
{
	a=s;
}
public void a1()
{
	if(a!=0)
	{
	System.out.println("You have enter negative number");	
	}
		
}
public static void main(String[]args)
{
	IfStatement m = new IfStatement(+2);
	m.a1();
}
}
