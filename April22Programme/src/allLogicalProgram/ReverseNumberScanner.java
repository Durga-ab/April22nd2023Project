package allLogicalProgram;

import java.util.Scanner;

public class ReverseNumberScanner 
{
  int n;
  int a=n;
  int b=0;
  int c;
  
  public void a1()
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Pleae Enter Number");
	  int a = s.nextInt();
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
	  ReverseNumberScanner s = new ReverseNumberScanner();
	  s.a1();
  }
}
