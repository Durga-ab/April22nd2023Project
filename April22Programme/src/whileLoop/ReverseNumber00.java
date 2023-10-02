package whileLoop;

public class ReverseNumber00 
{
	int n=108;
    int a=n;
    int b=0;
    int c;
	public void a1()
	{
		
	     while(a>0)
	     {
	    	 c=a%10;
	    	 b=b*10+c;
	    	 a=a/10;
	     }
	     System.out.println("Reverse Number:"+b);
		
	}
	public static void main(String[]args)
	{
		ReverseNumber00 s = new ReverseNumber00();
		s.a1();
	}

}
