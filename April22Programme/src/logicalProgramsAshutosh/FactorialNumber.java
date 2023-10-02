package logicalProgramsAshutosh;

public class FactorialNumber 
{
 public static void main(String[]args)
 {
	 double number=5;
	 double fact=1;
	 for(double i=1;i<=number;i++)
	 {
		 fact=fact*i;
	 }
	 System.out.println("Factorial value:"+fact);
 }
}
