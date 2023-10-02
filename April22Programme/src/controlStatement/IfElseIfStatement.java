package controlStatement;

public class IfElseIfStatement 
{
int marks = 78;
public void a1()
{
	if (marks>=65 && marks<=100)
	{
		System.out.println("First class with distiction");
	}
	else if(marks>=60 && marks <60)
	{
		System.out.println("First Class");
	}
	else if (marks>=55 && marks <60)
	{
		System.out.println("Second Class");
	}
	else if (marks>=40 && marks <55)
	{
		System.out.println("Third class");
		
	}
	else
	{
		System.out.println("Fail");
	}
}
public static void main(String[]args)
{
	IfElseIfStatement s =new IfElseIfStatement();
	s.a1();
}
}
