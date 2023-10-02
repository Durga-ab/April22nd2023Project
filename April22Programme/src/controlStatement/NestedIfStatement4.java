package controlStatement;

public class NestedIfStatement4 
{
int a = 22;//req=find the odd no
public void a1()
{
	if(a%2==0)
	{
	System.out.println("Even number");
	if(a%2!=0)
	{
		System.out.println("Odd number");
	}
	}
}
public static void main(String[]args)
{
	NestedIfStatement4 d= new NestedIfStatement4();
	d.a1();
}
}
