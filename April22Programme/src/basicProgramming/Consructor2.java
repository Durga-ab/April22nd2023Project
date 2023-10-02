package basicProgramming;

public class Consructor2 
{
 long mobno;
 float percentage;
 double weight;
 char alphabate;
 
 Consructor2()
 {
	mobno = 7057002229l;
	percentage = 72.6f;
	weight = 48.56d;
	alphabate = 'D';
	
 }
 
 public void a3()
 {
	 System.out.println("Mobile Number = " + mobno);
	 System.out.println("Final Year Percentage = " + percentage);
	 System.out.println("Weight " + weight);
	 System.out.println("Character " + alphabate);
 }
 
 public static void main(String [] args)
 {
	 Consructor2 mno = new Consructor2();
	 mno.a3();
 }
}
