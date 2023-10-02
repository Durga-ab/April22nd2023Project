package controlStatement;

public class NestedIfElseStatement3
{
	short bikeno=2239;
	String bikename = "Yamaha";
	
	public void a1()
	{
		if(bikeno==2229)
		{
			if(bikename!="HFDelux")
			{
				System.out.println("Yahi hain vah Gadi");
			}
			else
			{
				System.out.println("Yah vah gadi hain ki nahi");
			}
		}
		else
		{
			System.out.println("Nahi yah vah bike nahi");
		}
	}
	public static void main(String[]args)
	{
		NestedIfElseStatement3 w = new NestedIfElseStatement3();
		w.a1();
	}
	
}
