package basicProgramming;

public class DefaultConstructor 
{
  String name;
  long mobno;
  
  public void a1()
  {
	  name = "Durga";
	  mobno = 7057002229l;
	  System.out.println("Name = " + name);
	  System.out.println("Mobile NUmber = "+ mobno);
  }
  
  public static void main(String[]args)
  { // we have to not provide constructor but that time compilation compiler automatically called as 
	 // Default Constructor.
	  DefaultConstructor abc = new DefaultConstructor();
	  abc.a1();
  }
  
}
