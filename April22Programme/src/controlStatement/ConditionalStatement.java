package controlStatement;

public class ConditionalStatement 
{
 int a ;
 
 ConditionalStatement (int b)
 {
	 a=b;
 }
 public void a1()
 { //If Statement
	 if (a>=0)//  std.syntax.....if(){statement}
	 {
		 System.out.println("You have Entered Positive Number");
	 }
 }
 public static void main(String[]args)
 {
	 ConditionalStatement b= new ConditionalStatement (10);
	 b.a1();
	 
 }
}
