package ForLoop_NestedForLoop;

import java.util.Scanner;

public class ForLoop4 
{  
	int f;
	int l;
	 public void a1()
	 {
		System.out.println(" Please Enter the Number");
		 Scanner s = new Scanner(System.in);
			f=s.nextInt();
			l=s.nextInt();
			s.close();
			
		System.out.println("Even Number");	
		 for(f=1100; f<=1900; f++)
		 {
			 if(f%2==0)
			 {
				 System.out.println(f);
			 }
			 
			 
		 }
		 
		 System.out.println("Odd Number");
		 for(f=1100; f<=1900; f++)
		 {
			if(f%2!=0)
			{
			 System.out.println(l);
			}
		 }
		 System.out.println("This is odd no");
			 
	 }
	
	
	
	public static void main(String[] args) 
	{
		ForLoop4 w = new ForLoop4();
		w.a1();
	}

}
