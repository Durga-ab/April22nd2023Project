package whileLoop;

public class ReverseNumber 
{
 int reverse = 0;         // Initialization
 int number = 3456;
 
 public void a1()
 {
	 while(number!=0)    //Condition        //1. rev= 0*10+3456%10=6     num=3456/10=345 
	 {                                      //2. rev=6*10+345%10=65      num=345/10=34
		 reverse=reverse*10+number%10;      //3. rev=65*10+34%10=654     num=34/10=3
		 number=number/10;                  //4. rev=654*10+3%10=6543    num=3/10=0.3....false..here while loop stop
	 }
	 System.out.println("Reverse Number="+reverse);
 }
 public static void main(String[]args)
 {
	 ReverseNumber s = new ReverseNumber();
	 s.a1();
 }
}
