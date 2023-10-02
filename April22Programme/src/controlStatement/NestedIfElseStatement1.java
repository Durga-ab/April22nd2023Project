package controlStatement;

public class NestedIfElseStatement1 
{
int age = 16;
int weight = 34;

public void a1()
{
	if(age>=18)
	{
		System.out.println("Condition 1 satisfied");
		
		if(weight>=35)
		{
			System.out.println("Condition 2 satisfied");
			System.out.println("Your Eligible for to donate blood");
		}
	}
	else
	{
		System.out.println("Your age is not valid to donate the blood");
		
	}
}
public static void main(String[]args)
{
	NestedIfElseStatement1 s = new NestedIfElseStatement1();
	s.a1();
}
}
