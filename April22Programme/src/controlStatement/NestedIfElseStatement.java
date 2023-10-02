package controlStatement;

public class NestedIfElseStatement 
{
//Blood Donation
//Age>21
//weight>48
//HB>10
	byte Age = 44;
	byte weight = 50;
	int HB=6;
	public void a1()
	{
		if(Age>21)
		{
          if(weight>48)
        {
        	System.out.println("You are eligible for Donation");
        }
        
		}
		else
			
		{
			System.out.println("Not valid for Blood Donation");
		}
	}
	public static void main(String[]args)
	{
		NestedIfElseStatement w = new NestedIfElseStatement();
		w.a1();
	}
}
