package controlStatement;

import java.util.Scanner;

public class ScannerStatement 
{
 String name;
 long mobno;
 int age;
 public void a1()
 {
	 System.out.println("Enter Below Details to Open Bank Account Unioun Bank");
	System.out.println("Enter Your Fullname");
	 Scanner s1 = new Scanner(System.in);  //std syntax
	 name=s1.nextLine();
	 System.out.println("Enter Your Name:"+name);
	 System.out.println("Enter Your Mobile No");
	 mobno=s1.nextLong();
	 System.out.println("Enter Your Mobile No:"+mobno);
	 System.out.println("Enter Your Age");
	 age=s1.nextShort();
	 System.out.println("Enter Your Age:"+age);
	 System.out.println("Thank you");
	 s1.close();
	 
 }
 public static void main(String[]args)
 {
	 ScannerStatement s = new ScannerStatement();
	 s.a1();
 }
}
