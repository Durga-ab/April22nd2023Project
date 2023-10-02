package practiceLogicalProgram;

import java.util.Scanner;

public class LargestNUmberByScanner 
{
	public static void main(String[]args)
	{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int a=scan.nextInt();
	
	System.out.println("Enter second number");
	int b=scan.nextInt();
	
	System.out.println("Enter third number");
	int c=scan.nextInt();
	
//	if(a>b && a>c)
//	{
//		System.out.println(a+"is largest no");
//	}
//	else if(b>a && b>c) {
//		System.out.println(b+"is largets no");
//	}
//	else
//	{
//		System.out.println(c+"is largest no");
//		
//	}
	
	int largest= a>b?a:b;
	int largest1=c>(a>b?a:b)?c:(a>b?a:b);
	
	System.out.println(largest1+ "is largest no");
	
	}
}
