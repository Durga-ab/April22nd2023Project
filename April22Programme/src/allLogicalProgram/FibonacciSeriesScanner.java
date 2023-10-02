package allLogicalProgram;

import java.util.Scanner;

public class FibonacciSeriesScanner 
{
 int n;
 int a=0;
 int b=1;
 int c;
 int i;
 
 public void a1()
 {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Please Enter Number");
	 n=s.nextInt();
	 s.close();
	 
	 for(i=0;i<n;i++)
	 {
		 System.out.print(" "+a);
		 c=a+b;
		 a=b;
		 b=c;
	 }
 }
 public static void main(String[]args)
 {
	 FibonacciSeriesScanner w= new FibonacciSeriesScanner();
	 w.a1();
 }
}
