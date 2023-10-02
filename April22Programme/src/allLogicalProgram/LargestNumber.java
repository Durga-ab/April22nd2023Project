package allLogicalProgram;

import java.util.Scanner;

public class LargestNumber 
{
  public static void main(String[]args)
  {
	  
	  //Logic1
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Enter First Number=");
	  int a=scan.nextInt();
	  
	  System.out.println("Enter Second Number=");
	  int b=scan.nextInt();
	  
	  System.out.println("Enter Third Number=");
	  int c=scan.nextInt();
	  
	  if(a>b && a>c)  //a=10 b=20 c=30
	  {
		  System.out.println(a+"is largest number");
	  }
	  if(b>a && b>c)
	  {
		  System.out.println(b+" is largest number");

	  }	  else
	  {
		  System.out.println(c+" is largest number");
	 }
	  
	  
	  //Logic2 Ternary
	//  a>b?a:b;...a greater than b is true hen print a & if condition false then b print
	  
//	  
//	  int largest1=a>b?a:b; // largest of a>b
//	  int largest2=c>largest1?c:largest1; //largest of c&largest1
//	  //combine  2 variable
//	  int largest=c>(a>b?a:b)?c:(a>b?a:b);
//	  System.out.println(largest+"is largest number");
	  
  }
  
  
  
}
