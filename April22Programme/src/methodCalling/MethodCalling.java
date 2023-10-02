package methodCalling;

public class MethodCalling 
{
 public static void main(String[]args)
 {
	 System.out.println("Radhe Radhe");
	 a1();
	 MethodCalling abc = new MethodCalling();
	 abc.a2();
	 
 }
 
 public static void a1()
 {
	 System.out.println("Hari Om");
 }
 
 public void a2()
 {
	 System.out.println("SitaRam");
 }
}
