package basicProgramming;

public class StaticVariable 
{
  static byte a = 112; // Static variable/class varible
  static short b = 3244; // Static variable
  static int c = 4325345; // Static variable
  static char d = 's'; // Static variable
  
  public void a1()
  {
	  System.out.println(a);
	  System.out.println(b);
  }
  
  public static void a2()
  {
	  System.out.println(c);
  }
  
  public static void main(String[]args)
  {
	   StaticVariable sv = new StaticVariable();
	   sv.a1();
	   a2();
	   System.out.println(d);
	   
  }
  
  //static variable we call in to all/ specific method
}
