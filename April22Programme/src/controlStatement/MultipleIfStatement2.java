package controlStatement;

public class MultipleIfStatement2 
{
int a = 200;//divide by even no
int b = 37;//odd no
int c = 7;//week day

public void a1() {
if(a%2==0)
{
System.out.println("you have printed even no");
}
if(b%2!=0)
{
System.out.println("you have printed odd no");	
}
if(c==7)
{
	System.out.println("Sunday");
}

}
public static void main(String[]args)
{
	MultipleIfStatement2 s = new MultipleIfStatement2();
	s.a1();
}
}
