package controlStatement;

public class NestedIfStatement3
{
int money = 101;
public void a1()
{
	if(money>300&&money<=100)
	{
		if(money>100&&money<=300)
		{
			System.out.println("I will buy phone");
		}
		
	}
	System.out.println("i have no money");
}
public static void main(String[]args)
{
	NestedIfStatement3 a = new NestedIfStatement3();
	a.a1();
}
}
