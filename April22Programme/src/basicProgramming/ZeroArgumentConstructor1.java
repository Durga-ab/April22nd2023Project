package basicProgramming;

public class ZeroArgumentConstructor1 
{
 char Symbol;
 float Weight;
 byte Height;
 
 ZeroArgumentConstructor1()  // Inotoalization +Usage
 {
	 Symbol = '@';
	 Weight = 48.2f;
	 Height = 6;
	 System.out.println(" Symbol = "+ Symbol);
	 System.out.println("Weight = " + Weight);
	 System.out.println("Height = "+ Height);
	 
 }
 public static void main (String[]args)
 {
	 new ZeroArgumentConstructor1();
 }
}
