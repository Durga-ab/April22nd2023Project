package methodCalling;

public class Argument 
{
 public void a1()
 {
	 System.out.println("Shree Shivay namostubhyam");
 }
 public void a2(String name)
 {
	 System.out.println("Mahadev");
 }
 public void a3(String name,int no)
 {
	 System.out.println("Ram Ram Jay Raja Ram 108");
 }
 public static void main(String[]args)
 {
	 Argument abc = new Argument();
	 abc.a1();
	 abc.a2("Shivay");
	 abc.a3("Sita",10);
 }
}
