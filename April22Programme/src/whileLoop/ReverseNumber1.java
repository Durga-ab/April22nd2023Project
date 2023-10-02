package whileLoop;

public class ReverseNumber1
{
 int a=0;
 int b=8975;
 
 public void a1()
 {
	 int a = 0;//.....Intialization
	 while(b!=0)//..Condition
	 {
		 a=a*10+b%10;
		 b=b/10;
	 }
	 System.out.println("Reverse Number:"+a);
 }
 public static void main(String[]args)
 {
	 ReverseNumber1 s = new ReverseNumber1();
	 s.a1();
 }
}
