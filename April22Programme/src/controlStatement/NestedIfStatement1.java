package controlStatement;

public class NestedIfStatement1 
{
int a =20;
int b = 10;
public void a1()
{
	if(a++==20)
	{System.out.println("Right Credential");
	
		if(--a==10)
		{
			System.out.println("Wrong Credential");
		}
	}
}
public static void main(String[]args)
{
	NestedIfStatement1 s = new NestedIfStatement1();
	s.a1();
}
}
