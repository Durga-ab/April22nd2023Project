package controlStatement;

import java.util.Scanner;

public class ScannerStatement6 
{
	public static void main(String[] args) {
		
 

	long number;
	System.out.println("Enter Your Number:");
	Scanner s =  new Scanner(System.in);
	number = s.nextLong();
	s.close();
	 
	if(number>=0)
	{
		if(number%2==0)
			{
			System.out.println("This is Even NUmber");
			}
			
	}
	else
	{
		System.out.println("This is odd Number");
	}
	 
}}

