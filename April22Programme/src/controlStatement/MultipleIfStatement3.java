package controlStatement;

public class MultipleIfStatement3 
{
int weekno = 3;//day of week

public void a1()
{
	if(weekno==5)
	{
	System.out.println("Friday");	
	}
	if(weekno==3)
	{
		System.out.println("Wednesday");
	}
	System.out.println("I am not day of week");
}
public static void main(String[]args)
{
	MultipleIfStatement3 g = new MultipleIfStatement3();
	g.a1();
}
}
