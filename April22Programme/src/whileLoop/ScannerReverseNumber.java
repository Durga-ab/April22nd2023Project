package whileLoop;

import java.util.Scanner;

public class ScannerReverseNumber 
{
int Reverse = 0;
int Number;

public void a1()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Please Enter Number");
	int Number=s.nextInt();
	s.close();
	
	int Reverse = 0; // initialization
	while(Number!=0) //Condition
	{
		Reverse = Reverse*10+Number%10; 
		Number=Number/10;
		
	}
	System.out.println("Reverse Number:"+Reverse);
 
	}

public static void main(String[]args)
{
	ScannerReverseNumber s = new ScannerReverseNumber();
	s.a1();
}
}
