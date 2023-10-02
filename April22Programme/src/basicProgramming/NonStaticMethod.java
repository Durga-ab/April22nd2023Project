package basicProgramming;

public class NonStaticMethod 
{
public void car()
{
	System.out.println("I Love Car");
}
public void painting()
{
	System.out.println("My Hobbies Is Painting");
}
public static void main(String[]args)
{
	//How to call non static method in main method
	//std.syntax
	//Classname objectreferencevariable = new constructor();
	//objectreferencevariable.method name();
	//(Contructor same as Classname)
	NonStaticMethod abc = new NonStaticMethod();
	abc.car();
	abc.painting();
	//in one class we can only one object create 
}
}
