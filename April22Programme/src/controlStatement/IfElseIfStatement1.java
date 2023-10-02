package controlStatement;

public class IfElseIfStatement1 
{
int budget = 150000;
public void a1()
{
	if(budget>=100000 && budget<=150000)
	{
		System.out.println("I want to buy Bullet");
	}
	else if(budget>=50000 && budget<=100000)
	{
		System.out.println("i want to buy Pulser");
    }
	else if (budget>=50000 && budget<=80000)
	{
		System.out.println("i want to buy Activa");
	}
	else
	{
		System.out.println("I dont buy any of Vehicle");
	}
}
public static void main(String[]args)
{
	IfElseIfStatement1 s = new IfElseIfStatement1();
	s.a1();
}
}
