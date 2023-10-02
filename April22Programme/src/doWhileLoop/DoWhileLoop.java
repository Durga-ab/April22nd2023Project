package doWhileLoop;

public class DoWhileLoop 
{
 int i = 1;
 
 public void a1()
 {
	 do
	 {
		 System.out.println(i);
		 i++;
	 }while(i<=10);
 }
 public static void main(String[]args)
 {
	 DoWhileLoop s = new DoWhileLoop();
	 s.a1();
 }
}
