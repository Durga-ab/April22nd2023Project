package basicProgramming;

public class MainStaticNonStaticMethod 
{
public static void main(String[]args)
{
	System.out.println("Main Method Is The Brain Of Class");
	
	staticmethod();
	
	MainStaticNonStaticMethod AllMethod = new MainStaticNonStaticMethod ();
	
	AllMethod.nonstaticmethod();
}
public static void staticmethod()
{
	System.out.println("It Is Static In Nature");
}
public void nonstaticmethod()
{
	System.out.println("To call non static method into main method it is mandotory to create objet");
}

}
