package logicalProgramsAshutosh;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
	     int n=123;
	     int a=n;
	     int b=0;
	     int c;
	     while(a!=0)
	     {
	    	 c=a%10;
	    	 b=b*10+c;
	    	 a=a/10;
	     }
	     System.out.println("Reverse Number:"+b);
		
	}

}
