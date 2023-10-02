package controlStatement;

public class MultipleIfStatement 
{
 int a = 20;//1-75 age people valid for travels..
 int b = 18;//18-onward people valid for vote..
 
 public void a1()
 {
	 if (a>=1&&a<=75)
	 {
		System.out.println("you are valid"); 
	 }
	 if (b<=18)
	 {
		 System.out.println("i am 18+ so..i am valid for vote");
	 }
	 System.out.println("i am valid for both condition");
 } 
 public static void main(String[]args)
 {
	 MultipleIfStatement m = new MultipleIfStatement();
	 m.a1();
 }
}
