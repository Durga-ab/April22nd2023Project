package ForLoop_NestedForLoop;

public class Forloop1 
{
public static void main(String[]args)
{
	//print evan no=1100-1900
	//print odd no = 1100-1900
	
	  System.out.println("List of Even no");

	for(int a=1100;a<=1900;a++)
	{
	  if(a%2==0)
	  {
		  System.out.println("Even no:" + a);
	  }
	}
	
	  System.out.println("List of Odd no");

	
	for(int a=1100; a<=1900; a++)
	{
		if(a%2!=0)
		{
			System.out.println("Odd N0:" + a);
		}
	}
}
}
