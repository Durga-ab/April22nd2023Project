package controlStatement;

public class NestedIfStatement2
{
short a = 250;
short b = 150;
short c = 300;
short d = 100;

public void a1() 
{
	if(a>=b||a<d)
	{
		if(b<c||c>d)
		{
			System.out.println("true");
			
			if(d<c||b<c)
			{
				System.out.println("False");
			}
		}
	}
}
public static void main(String[]args)
{
	NestedIfStatement2 s = new NestedIfStatement2();
	s.a1();
}

}
