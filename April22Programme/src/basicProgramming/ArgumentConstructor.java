package basicProgramming;

public class ArgumentConstructor 
{
 //Declaration
	char letter;
	String Name;
	int pincode;
	
	// Initialization + Usage
	// ConstructorName(Value){}
	
	ArgumentConstructor(char symbol)
	{
		letter = 'A';
		Name = " Ashutosh";
		pincode = 422605;
		System.out.println("Character = " + letter);
		System.out.println("Name = "+ Name);
		System.out.println("Pincode = "+ pincode);
	}
	
	public static void main(String[]args)
	{
		//how should call constructor into main method
		//with Arument Constructor
		
		// new ConstructorName (Value);
		new ArgumentConstructor('a');
	}
	
}
