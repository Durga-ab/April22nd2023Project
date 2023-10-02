package controlStatement;

import java.util.Scanner;

public class ScannerStatement4 
{
	
		int x;
		int y;
		ScannerStatement4()
		{
			x=1000;
			y=100;
			
		}
		public void lessgreater()
		{
			Scanner s1 = new Scanner(System.in);
			x=s1.nextInt();
			s1.close();
			  
			if(x < y)
			{
				System.out.println("x is less than y");
			}
			else
			{
			System.out.println("x is greater than y");
			}

}
		public static void main(String[]args)
		{
			ScannerStatement4 a = new ScannerStatement4 ();
			a.lessgreater();
		}
}
