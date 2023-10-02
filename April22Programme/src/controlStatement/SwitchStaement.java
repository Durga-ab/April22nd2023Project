package controlStatement;

public class SwitchStaement 
{
int day = 3;  //Test Value//variable
public void a1()
{ //week of day
switch (day)
{
case 1 :System.out.println("Today is Monday");
case 2 :System.out.println("Today is Tuesday");
case 3 :System.out.println("Today is WednesDay");break;
case 4 :System.out.println("Today is Thurseday");
case 5 :System.out.println("Today is Friday");
case 6 :System.out.println("Today is Saturday");
case 7 :System.out.println("Today is Sunday");

default:System.out.println("No one Day HodiDay");
}
}
public static void main(String[]args)
{
	SwitchStaement s = new SwitchStaement();
	s.a1();
}
}
