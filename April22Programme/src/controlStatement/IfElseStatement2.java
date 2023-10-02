package controlStatement;

public class IfElseStatement2 
{
static int a = 3200000;
static int b =21000000;
static int c = 2300000;
static int d = 3400000;

public static void a1()
{
	if(a<b&&b>a)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("False");
	}
	if(a>c&&d>a)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
		
}
public static void main(String[]args)
{
	a1();
}

}
