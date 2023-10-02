package ForLoop_NestedForLoop;

import java.util.Scanner;

public class ForLoop6
{
	 int a;
	 
		 public  void m1() 
		 {
			 System.out.println("......Welcome To The Even And Odd Number......");

		     System.out.println("--------------------------------------------------------");

		     System.out.println("Please Enter Any Number Between 1100 To 1900");

			 System.out.println("Enter a Number");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			scan.close();
			
			
			//for(int b=1100; b<=1900;b++)
			{//
			
				if(a>=1100 && a<=1900) 

				{

					if((a%2)==0)

					{

					System.out.println("You have Entered An Even Number ");

					}

					else

					{

						System.out.println("You have Entered An odd Number ");

					}

				}

				else

				{

					System.out.println("You Have Entered Invalid Number");

				}

			}
		 }
		 


		public static void main(String[] args)
		{  
			
			ForLoop6 v = new ForLoop6();     //if(number%2==0)
			 v.m1();
		
	}

	}

