package ForLoop_NestedForLoop;

public class Forloop2 
{
  int a ;
  
  public void a1()
  { //print list of even no..
	//print list of odd no..  
	  System.out.println("List of Even no");
	  
	  for(a=1100; a<=1900; a++)
	  {
 		  if(a%2==0)
		  {
			 System.out.println("Even Number:"+a); 
		  }
 		  else
		  {
			  System.out.println("odd Number:"+a);
		  }
	  }
	  
  }
  public static void main(String[]args)
  {
	  Forloop2 s = new Forloop2();
	  s.a1();
  }
}
