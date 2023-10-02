package allLogicalProgram;

public class ReverseNumber
{
 int n = 312;
 int a=n;
 int b=0;
 int c;
 
 public void a1()
 {
	 while(a>0)
	 {
		 c=a%10;
		 b=b*10+c;
		 a=a/10;
	 }
	 System.out.println(b);
 }
 
 public static void main(String[]args)
 {
	 ReverseNumber s = new ReverseNumber();
	 s.a1();
 }
}
