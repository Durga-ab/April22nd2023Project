package allLogicalProgram;

import java.util.Scanner;

public class PrimeNumberScanner 
{
   int n;
   int i;
   int j;
   
   public void a1()
   {
	   Scanner s = new Scanner (System.in);
	   System.out.println("Please Enter The Number");
	   int n=s.nextInt();
	   s.close();
	   
	   for(i=n;i<=n;i++)
	   {
		   for(j=2;j<=i;j++)
		   {
			   if(i%j==0)
			   {
				   break;
			   }
		   }
		   if(i==j)
		   {
			  
			   System.out.println("This is Prime number");
		   }
		   else
		   {
			   System.out.println("This is not Prime Number");
		   }
	   }
   }
   public static void main(String[]args)
   {
	   PrimeNumberScanner s = new PrimeNumberScanner();
	   s.a1();
   }
}
