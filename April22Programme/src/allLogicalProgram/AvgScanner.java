package allLogicalProgram;

import java.util.Scanner;

public class AvgScanner
{
	public void m1()        
	{
		int a;
		int b;
		int c;
		int d;
		int e;  
                                                           //avg=sum of values/number of values
        System.out.println("enter number");       //double data type to use because avg result also point value
        Scanner scan = new Scanner(System.in);
		      a = scan.nextInt();
              b = scan.nextInt();
              c = scan.nextInt();
              d = scan.nextInt();
              e = scan.nextInt();  
		     scan.close();  

		int sum  = a+b+c+d+e;
		System.out.println("toatl marks ="  +  sum);

		double avg=sum /5.0;
		System.out.println("averge marks ="  +  avg);
	}
	public static void main(String[] args)
	{
		AvgScanner v = new AvgScanner();
		v.m1();

	}

}

