package controlStatement;

import java.util.Scanner;

public class ScannerStatement3 
{
	byte Age = 44;
	byte weight = 50;
	int HB=6;
	public void a1()
	{
		System.out.println("Please Enter you age ");
		Scanner s = new Scanner (System.in);
		Age=s.nextByte();
		
		System.out.println("please Enter your Weight");
		weight=s.nextByte();
		
		System.out.println("Enter Your Hemoglobin");
		HB=s.nextInt();
		System.out.println("Enter your hemoglobin="+HB);
		s.close();
		if(Age>21)
		{
        if(weight>48)
        {
        	System.out.println("You are eligible for Donation");
        }
        
		}
		else
			
		{
			System.out.println("Not valid for Blood Donation");
		}
	}
	public static void main(String[]args)
	{
		ScannerStatement3 w = new ScannerStatement3();
		w.a1();
	}
}
