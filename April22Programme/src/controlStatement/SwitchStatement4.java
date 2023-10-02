package controlStatement;

public class SwitchStatement4 
{
 char Product = 'A';
 public void a1()
 {   System.out.println("Welcome Mam..Our New Cosmetic Brand Store");
     System.out.println("What you can Buy?");
	 switch(Product)
	 {
	 case'A':System.out.println("Milani Foundation(Shade 202)-1700/-");break;
	 case'B':System.out.println("lakeme Absolute Primer-450/- ");
	 case'C':System.out.println("Kay Beauty Lipstick (Shade 002)-750/-");
	 case'D':System.out.println("Huda Beauty Conceler (shade 24)-300/-");
	 case'E':System.out.println("NY Bae Blush(shade Rose Pink)-600/-");
	 
	 default: System.out.println("Not Avaiable Foundation In this Shade");
	 
	 }
	 System.out.println("..Thank you Please Visit Again..");
 }
 public static void main (String[]args)
 {
	 SwitchStatement4 s = new SwitchStatement4();
	 s.a1();
 }
}
