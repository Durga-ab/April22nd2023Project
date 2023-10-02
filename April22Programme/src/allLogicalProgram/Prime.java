package allLogicalProgram;

public class Prime 
{
 public static void main(String[]args)
 {
	 int a= 5;
	 int b=0;
	 int c=0;
	 int d=0;
	 
	 for(c=2;c<5;c++)
	 {
		 b=a%c;
		 if(b==0)
		 {
			 System.out.println(a+ "this is not prime number");
			 d=d+1;
			 break;
		 }
		
	 }
	 if(d==0)
	 {
		 System.out.println(a+ "This is prime number");
	 }
	 
 }
}
