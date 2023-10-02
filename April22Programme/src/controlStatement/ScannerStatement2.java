package controlStatement;

import java.util.Scanner;

public class ScannerStatement2 
{
	int marks = 78;
	public void a1()
	{
		System.out.println("Result");
		Scanner s = new Scanner(System.in);
		marks=s.nextInt();
		
		s.close();
		
		if (marks>=65 && marks<=100)
		{
			System.out.println("First class with distiction");
		}
		else if(marks>=60 && marks <60)
		{
			System.out.println("First Class");
		}
		else if (marks>=55 && marks <60)
		{
			System.out.println("Second Class");
		}
		else if (marks>=40 && marks <55)
		{
			System.out.println("Third class");
			
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[]args)
	{
		ScannerStatement2 s =new ScannerStatement2();
		s.a1();
	}
}
