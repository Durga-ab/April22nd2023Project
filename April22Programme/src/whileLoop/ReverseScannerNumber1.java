package whileLoop;

import java.util.Scanner;

public class ReverseScannerNumber1 
{
 int rev=0;
 int num;
 
 public void a1()
 {
	 Scanner s = new Scanner (System.in);
	 System.out.println("Please Enter Number");
	 int num=s.nextInt();
	 s.close();         
	 
	 int rev =0;
	 while(num!=0)
	 {
		rev=rev*10+num%10;
		num=num/10;
	 }
	 System.out.println("Reverse number:"+rev);
 }
 public static void main(String[]args)
 {
	 ReverseScannerNumber1 s = new ReverseScannerNumber1();
	 s.a1();
 }
}
