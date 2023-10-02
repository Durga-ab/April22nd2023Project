package basicProgramming;

public class InstanceVariable 
{
  byte a = 100;  //instance variable declare inside method body but outside the method body
  short b = 3267;//instance variable/Global variable/Class variable/Non Static variable
  int c = 35574567; //instance variable
  
  public void nonstatic()
  {
	  System.out.println(a); // instance variable called in only non static method
	  System.out.println(b);
	  System.out.println(c);
  }
  
  public static void main(String[]args)
  {
	  InstanceVariable abc = new InstanceVariable();
	  abc.nonstatic();
  }
}
