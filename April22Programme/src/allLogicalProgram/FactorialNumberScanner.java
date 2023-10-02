package allLogicalProgram;

import java.util.Scanner;

public class FactorialNumberScanner 
{
 int number;
 int fact=1;
 int i;
 
 public void a1()
 {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Please Enter Number");
	 number=s.nextInt();
	 s.close();
	 
	 for(i=1;i<=number;i++)
	 {
		 fact=fact*i;
	 }
	 System.out.println("Factorial no:" +fact);
 }
 public static void main(String[]args)
 {
	 FactorialNumberScanner w=new FactorialNumberScanner();
	 w.a1();
 }
}
