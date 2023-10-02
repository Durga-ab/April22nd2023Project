package basicProgramming;

public class LocalVariable 
{
public static void main(String [] args)
{
	int a = 3435452;     // Local variable call into a method body
	long b = 43546565;   // Local Variable
	char c = '@';        // Local Variable
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	local();
	LocalVariable abc = new LocalVariable();
	abc.localv();
} 
public static void local()
{
	double d = 32.435d;   //Local Variable
	System.out.println(d);

}
public void localv()
{
	float e = 455.432423f; // Local Variable
	System.out.println(e);
}
   //Local variable used in speific all method body (eg: main method,static method,non static method)
}
