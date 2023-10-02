package controlStatement;

public class IfElseStatement 
{
int a = 400;//city to city distance in KM
public void a1()
{
if(a<=350)
{
	System.out.println("Amravati to Nagpur Distance");
}
else
{
	System.out.println("Amravati to Mumbai Distance");
}
}
public static void main(String[]args)
{
	IfElseStatement m = new IfElseStatement();
	m.a1();
}
}
