package basicProgramming;

public class KiranaStore 
{
	//Declration
	int billno;
	int amount;
	int srno;
	String Item;
	int Quantity;
	int Rate;
	int TotalAmount;
	KiranaStore()
	{
		billno = 210;
		System.out.println("Provide below details:" + "\n" +"billno:" + billno);

		System.out.println("..WELCOME.." );
	}
	public void customer(int srno1,String Item1,int Quantity1, int Rate1, int TotalAmount1)
	{
		System.out.println("\n" + "SR.No:"+srno1 +"\n" + "Item:"+Item1 + "\n" + "Quantity:"+Quantity1+ "\n" +"Rate:"+Rate1 + "\n" +"Total Amount:"+TotalAmount1);
		switch(billno)
		{
		case 210:
			if(amount>=20 && amount<=100) 
			{
				System.out.println("\n"+"Item List:" + "\n" + "Sugar" + "\n" + "Salt" + "\n" +"soap" + "\n" + "Colgate" + "\n" + "Maggy" + "\n" + "Tea Powder" + "\n" + "Goundnut");
			}
          break;
			
		default:System.out.println("Sorry for Inconvience");
		}
	}
	public static void main(String[]args)
	{
		KiranaStore v = new KiranaStore();
		v.customer(1,"Tea Powder",2,45,90);
	}
	

}
