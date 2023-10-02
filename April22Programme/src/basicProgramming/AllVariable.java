package basicProgramming;

public class AllVariable 
{
 int a = 424242;  // Instance variable
 static byte b = 123; //  Static Variable
 
 public static void main(String[] args) 
 {
	 char a = 'a';
	 System.out.println(a);// local variable
	 a2();
	 AllVariable abc = new AllVariable();
	 abc.a1();
	
 }
 
 public void a1 ()
 {
	 System.out.println(a); // instance variable
	 System.out.println(b); //Static variable
 }
 
 public static void a2 () 
 {
	 System.out.println(b); //Static variable
 }
 
	 
}
