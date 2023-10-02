package logicalProgramsAshutosh;

public class ArmStrongNumber 
{
	public static void main(String[] args) 
	{ 
		int n=153;
		int a=n;
		int b= 0;
		int c;
		while(a!=0)
		{
			c=a%10;
			b=b+(c*c*c);
			a=a/10;
		}
		if(n==b)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("Not a ArmStrong Number");
		}
	}

}
