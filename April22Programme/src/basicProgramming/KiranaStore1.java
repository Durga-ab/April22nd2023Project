package basicProgramming;

public class KiranaStore1
{
		static String item; 
		static int a; 
		static int b;
		static int c;
		public static void pohe(String item1, int a1)
		{
            item =item1; a = a1; 

			if(item=="Pohe")

				if(a>0)
				{
					System.out.println(item1 +"	"+"  55	 "	+a +"     	 "+   (a*55));
				}
				else
				{
                	System.out.println("Please Enter Valid Quantity Of Pohe");
				}
           else
			{
				System.out.println("Sorry You Have Entered Wrong Input");
             }
          }
		
		public static void coconut(String item1, int c1)

		{

			item =item1; c = c1;

			if(item1=="Coconut")

				if(c>0)

				{
					System.out.println(item1 +"	"+"  55	 "	+c +"	 "+(c*55));

				}

				else

				{
					System.out.println("Please Enter Valid Quantity Of Cocnonut");
				}

			else
              {
                System.out.println("Sorry You Have Entered Wrong Input");
              }
			}
		public static void main(String [] args)

		{
            System.out.println("Welcome Sir/Maadam");
            
            System.out.println("SR No.101");
            
			System.out.println("Item    Unit Rate    Quantity    Total");

			System.out.println("---------------------------------------");

		   	pohe("Pohe",  2);

			coconut("Coconut", 1);

			System.out.println("---------------------------------------");

			System.out.println("Total amount = (Quantity*Price)");
			
			System.out.println("Thank You ...Visit Again!!!");
           }

}


