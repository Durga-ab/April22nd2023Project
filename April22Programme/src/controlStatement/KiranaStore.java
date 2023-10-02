package controlStatement;

public class KiranaStore
{
	
		static String item1; 
		static int q1; 
         static int q2;
        static int q3;
        static int q4;
        static int q5;
		static int y1; 
		static int y2;
		static int y3;
		static int y4;
		static int y5;
		static int b1;
		
		public void product()
		{
			int b; b =1;
			System.out.println("\n ||Welcome To Jay Shankar Kirana Store||");
			System.out.println("-----------------------------------------");
			System.out.println("Please Find Below Product List\n");
			System.out.println("1. Sugar  - Rs.40/Kg\n"+
								"2. Tea 	  - Rs.120/Kg\n"+
								"3. Rice	  - Rs.70/Kg\n"+
								"4. Soap	  - Rs.50/Pkt\n"+
								"5. Maggi  - Rs.80/Pkt\n");
			System.out.println("-----------------------------------------");
			System.out.println(" 	          Invoice                	 ");
			System.out.println("Date:15/06/2023			Bill No."+b++);
			
		}

		public void sugar(String i1, int x1)
		{
			item1 =i1; q1=x1; y1= (x1*40); 
			if(q1!=0)
			if(item1=="Sugar")
				if(q1>0)
				{
					System.out.println(item1 +"	"+"  40		 "	+q1 +"	 "+y1);
				}
				else
				{
					System.out.println("Please Enter Valid Quantity Of Sugar");
				}
			else
			{
				System.out.println("Sorry You Have Entered Wrong Input, Please Enter Input As Sugar");
			}
		}

		public void tea(String i1, int x2)
		{
			item1 =i1; q2 = x2; y2= (x2*120);
			if(q2!=0)
			if(item1=="Tea")
				if(q2>0)
				{
					System.out.println(item1 +"	"+"  120		 "	+q2 +"	 "+y2);
				}
				else
				{
					System.out.println("Please Enter Valid Quantity Of Tea");
				}
			else
			{
				System.out.println("Sorry You Have Entered Wrong Input, Please Enter Input As Tea");
			}
		}

		public void rice(String i1, int x3)

		{
			item1 =i1; q3 = x3; y3= (x3*70);
			if(q3!=0)
			if(item1=="Rice")
				if(q3>0)
				{
					System.out.println(item1 +"	"+"  70		 "	+q3 +"	 "+y3);
				}
				else
				{
					System.out.println("Please Enter Valid Quantity Of Rice");
				}
			else
			{
				System.out.println("Sorry You Have Entered Wrong Input, Please Enter Input As Rice");
			}
		}
		
		public void soap(String i1, int x4)

		{
			item1 =i1; q4 = x4; y4= (x4*50);
			if(q4!=0)
			if(item1=="Soap")
				if(q4>0)
				{
					System.out.println(item1 +"	"+"  50		 "	+q4 +"	 "+y4);
				}
				else
				{
					System.out.println("Please Enter Valid Quantity Of Soap");
				}
			else
			{
				System.out.println("Sorry You Have Entered Wrong Input, Please Enter Input As Soap");
			}
		}
		
		public void maggi(String i1, int x5)

		{
			item1 =i1; q5 = x5; y5= (x5*80);
			if(q5!=0)
			if(item1=="Maggi")
				if(q5>0)
				{
					System.out.println(item1 +"	"+"  80		 "	+q5 +"	 "+y5);
				}
				else
				{
					System.out.println("Please Enter Valid Quantity Of Rice");
				}
			else
			{
				System.out.println("Sorry You Have Entered Wrong Input, Please Enter Input As Rice");
			}
		}
		
		public void total()
		{
			int t1;
			t1 = (y1+y2+y3+y4+y5);
			System.out.println("		Total    =       "+t1);
		}
	}


