package basicProgramming;

public class Constructor1 
{
	// Declaration
 boolean condition;
 byte no;
 short birthdate;
 int pin;
  
   //Initialization
 Constructor1()
 {
	condition = 2>3;
	no = 55;
	birthdate = 2199;
	pin = 422605;
	
 }
 
 //Usage
 public void a2()
 {
	 System.out.println("Conditional Information = "+condition);
	 System.out.println("Any Number = "+no);
	 System.out.println("BirthDate = "+birthdate);
	 System.out.println("PinCode = "+pin);
 }
 
 public static void main (String[]args)
 {
	 Constructor1 xyz = new Constructor1();
	 xyz.a2();
 }
}
