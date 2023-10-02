package controlStatement;

import java.util.Scanner;

public class ScannerStatement5 
{

	int money = 101;
	public void a1()
	{
		System.out.println("MONEY");
		Scanner s = new Scanner(System.in);
		money=s.nextInt();
		System.out.println("money");
		s.close();
		if(money>300&&money<=100)
		{
			if(money>100&&money<=300)
			{
				System.out.println("I will buy phone");
			}
			
		}
		System.out.println("i have no money");
	}
	public static void main(String[]args)
	{
		ScannerStatement5 a = new ScannerStatement5();
		a.a1();
	}
}
