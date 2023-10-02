package basicProgramming;

public class Constructor 
{
 //Declartion
	String name;    // Instance Variable
	long mobno;
	byte age;
	String email;
	
//Initialization
	
	Constructor()            //classname(){}
	{
	name = "Durga Soundhiya";
	mobno = 7057002229l;
	age = 23;
	email = "durgasoundhiya55@gmail.com";
	
	}
	
 //Usage
	
	public void a1 ()    //Non Static Method
	{
	 System.out.println("..........Personal Information.........");	
	 System.out.println("Name = "+ name);
	 System.out.println("Mobile Number = "+ mobno);
	 System.out.println("Age = "+ age);
	 System.out.println("Email = "+ email);
	 System.out.println("....Thank you....");
	}
	
	public static void main(String[]args)
	{
		Constructor abc = new Constructor();
		abc.a1();
	}
	
	
}
