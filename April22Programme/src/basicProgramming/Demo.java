package basicProgramming;

public class Demo 
{
 // std. syntax non static method
	public void nonstaticmethod()
	{
		System.out.println(" i am the non static method");
	}
	// std.syntax main method
	public static void main(String[]args)
	{
		Demo abc = new Demo();
		abc.nonstaticmethod();
		
		System.out.println("i am the boss");
		//how to call non static method in main method
		//std.syntax
		//Classname objectreferencevariable = new constructor();
		//objectreferencevariable.method name();
		
		
	}
	
}
