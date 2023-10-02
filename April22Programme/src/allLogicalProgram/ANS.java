package allLogicalProgram;

import java.util.Scanner;

public class ANS 
{
	int n;                                         
	int a;                      
	int b=0;                      
	int c;                             

	public void a1()

	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		n = s.nextInt();
		s.close();
     
       
		 a=n;
		while(n>0)
		{
			c=n%10;
			b=b+(c*c*c);
			n=n/10;

		}

		if (a==b)
		{
			System.out.println("This is Armstrong number");
		}

		else 

		{
			System.out.println("This is a not Armstrong number");

		}
	}
	public static void main(String[]args)
	{
		ANS d= new ANS();
		d.a1();
	}

}
