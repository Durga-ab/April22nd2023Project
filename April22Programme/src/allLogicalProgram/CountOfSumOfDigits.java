package allLogicalProgram;

import java.util.Scanner;

public class CountOfSumOfDigits 
{
  public static void main(String[]args)
  {
	  int number=1234;
	  int sum =0;
//	   Scanner scan = new Scanner(System.in);
//	   System.out.println("Please enter number");
//	    number=scan.nextInt();
	  while(number>0)
	  {
		 sum=sum+number%10;//0+1234%10=4 4+123%10(3)=7 7+12%10(2)=9  9+1%10(1)=10
		 number=number/10; //1234/10=123 123/10=12  12/10=1   1/10=0..condition false
	  }
	  System.out.println("Sum of Digits=" +sum);
  }
}
