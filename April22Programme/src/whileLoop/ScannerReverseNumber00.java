package whileLoop;

import java.util.Scanner;

public class ScannerReverseNumber00 
{
	int n;
    int a=n;
    int b=0;
    int c;
	public void a1()
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the Number");
		int a= s.nextInt();
		s.close();
		
	     while(a>0)
	     {
	    	 c=a%10;
	    	 b=b*10+c;
	    	 a=a/10;
	     }
	     System.out.println("Reverse Number:"+b);
		
	}
	public static void main(String[]args)
	{
		ScannerReverseNumber00 s = new ScannerReverseNumber00();
		s.a1();
	}

	 
}
