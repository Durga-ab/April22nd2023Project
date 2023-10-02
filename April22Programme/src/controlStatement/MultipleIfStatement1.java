package controlStatement;

public class MultipleIfStatement1 
{
int a = 20;//above 18 plus citizen
int b = 12;//even number
int c = 13;//odd number
public void a1()
{
	if(a>=18)
	{
		System.out.println("Eligible For Vote");
	} 
	if(b%2==0)
	{
		System.out.println("Always Print Even Number");
	}
	if(c%2==1)
	{
		System.out.println("print negative number");
	}
}
public static void main(String[]args)
{
	MultipleIfStatement1 m = new MultipleIfStatement1();
	m.a1();
}
}
