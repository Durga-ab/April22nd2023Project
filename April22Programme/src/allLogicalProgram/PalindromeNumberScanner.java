package allLogicalProgram;

import java.util.Scanner;

public class PalindromeNumberScanner 
{
		
 public void  a1 ()
 {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Please Enter Number");
	 int n=s.nextInt();
	 s.close();
	    
	    int a=n;
	    int b=0;
		int c;
	 
	 while(a>0)
	 {
		 c=a%10;
		 b=b*10+c;
		 a=a/10;
	 }
	 if(b==n)
	 {
		 System.out.println(" This is Palindrome number");
	 }
	 else
	 {
		 System.out.println("This is not Palindrome Number");
	 }
 }
 public static void main(String[]args)
 {
	 PalindromeNumberScanner w = new PalindromeNumberScanner();
	 w.a1();
 }
}
