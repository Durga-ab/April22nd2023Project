package basicProgramming;

public class Kirana2
{
	
		        int a;
				int BillNO	= 101;
				int SrNo	;
				String Items;
				int Quantity;
				int price;
				int TotalAmount;
				
				public void a1()
				{
					
				switch(BillNO)
				{
				case 101:
					System.out.println("Billno1");
					System.out.println("item=pohe");
					System.out.println("quantity=2");				
					System.out.println("price=50");
					System.out.println("total amount=quantity*price");break;
					
				case 102:
					System.out.println("Billno2");
					System.out.println("item=groundnut");
					System.out.println("quantity=1");				
					System.out.println("price=100");
					System.out.println("total amount=quantity*price");
					
					default : System.out.println("Sorry not found any details");
				}
			}
				
			public static void main(String[] args) {
				System.out.println("Welcome Sir / Mam..");
				Kirana2 v = new Kirana2();
				  v.a1();
			}
			
		}


