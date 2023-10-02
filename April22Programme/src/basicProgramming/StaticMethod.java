package basicProgramming;

public class StaticMethod 
{
public static void main(String[]args)
{
	System.out.println("I Am the Boss");
	//How to call static method in main method
	//Method Name();
	addition();
	substraction();
	multiplication();
	division();
}
public static void addition ()
{
	System.out.println("10+10=20");

}
public static void substraction()
{
	System.out.println("20-10=10");
}
public static void multiplication()
{
	System.out.println("10*10=100");
}
public static void division()
{
	System.out.println("20/2=10");
}
}
