package ForLoop_NestedForLoop;

public class ForLoop 
{ //print 1-10 numbers
 int a;
 int b;
 public void a1()
 {
	 for(a=1; a<=10; a++)     //for(initialization;condition;increment/decrement){ }
	 {                        //1(2) 2(3)
		 System.out.println(a);
	 }
	  
	 
	 //print 10-1 numbers
	 for(b=10; b>=1; b--)
	 {
		 System.out.println(b);
	 }
 }
 public static void main(String[]args)
 {
	 ForLoop s = new ForLoop();
	 s.a1();
 }
}
