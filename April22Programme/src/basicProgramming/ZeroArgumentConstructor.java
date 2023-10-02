package basicProgramming;

public class ZeroArgumentConstructor 
{
  // Declaration
	String name;
	long mobno;
	byte age;
	
	//Initialization + Usage
	//ConstructorName(){}
	ZeroArgumentConstructor()// Non Argument Constructor/Non Parameterized Constructor
	{
		name = "Durga";
		mobno = 7057002229l;
		age = 23;
		System.out.println("Name = " + name);
		System.out.println("Mobile No = " + mobno);
		System.out.println("Age = "+ age);
		
		
	}
	
	public static void main (String[]args)
	{ // How should call constructor into main method
	// new Constructor name ():	
		new ZeroArgumentConstructor();
	}
}
