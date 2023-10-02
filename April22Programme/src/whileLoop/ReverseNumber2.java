package whileLoop;

public class ReverseNumber2 
{
int rev=0;
int num=56;
public void a1()
{
	                      //1.rev=0*10+56%10=0+6=6     num=56/10=5
	while(num!=0)         //2.rev=6*10+5%10=60+5=65    num=5/10=0.5....false
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println("Reverse Number:"+rev);
}
public static void main(String[]args)
{
	ReverseNumber2 s = new ReverseNumber2();
	s.a1();
}
}
