package controlStatement;

public class IfStatement1 
{
int a ;

IfStatement1(int c)
{
	a=c;
}
public void a1()
{
	if(a<=0)
	{
	System.out.println("negative No");	
	}
}
public static void main(String[]args)
{
	IfStatement1 n = new IfStatement1(-20);
	n.a1();
}
}
