package controlStatement;

public class SwitchStatement2 
{
 int a =1;   // req.of budget and type of bike
 public void a1()
 {
	 System.out.println("Welcome Sir our Showroom");
	 System.out.println("Budget On Bike");
	 
 switch(a)
 {
 case 1 : System.out.println("Shine-(98000)");
 case 2 : System.out.println("pulsar-(115000)");
 case 3 : System.out.println("unicorn-(105000)");
 case 4 : System.out.println("HFDelux-(97000)");
 case 5 : System.out.println("KTM-(120000)");
 
 default:System.out.println("This Model Not Available");
 
 }
 System.out.println("Thank you for Visit... Sir..");
}
 public static void main(String[]args)
 {
	 SwitchStatement2 s = new SwitchStatement2 ();
	 s.a1();
 }
}
