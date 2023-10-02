package controlStatement;

public class IfElseStatement4 
{//using FLipping Operator
 int a =18;
 public void a1()
 {
	 if(~a<=(-20))   //(-(n+1))  //(-(18+1))=-19
	 {
		System.out.println("Flipping operation is done"); 
	 }
	 else
	 {
		 System.out.println("Flipping operation is not done");
	 }
 }
 public static void main(String[]args)
 {
	 IfElseStatement4 s = new IfElseStatement4();
	 s.a1();
 }
}
