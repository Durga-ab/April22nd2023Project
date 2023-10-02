package basicProgramming;

public class ArgumentConstructor1 
{
 //Declaration
	String name;
	long mobno;
	String email;
	byte age;
	
	//Initialization + Usage
	ArgumentConstructor1()
	{
		name = "Durga Soundhiya";
		mobno = 7057002229l;
		email = "durgasoundhiya55555@gmail.com";
		age = 23;
		System.out.println("....Personal Information....");
		System.out.println("Name = " + name + "\n" + "Mobile Number = " + mobno + "\n" + " Email ="
				+ email + "\n" + "Age = "+ age );
		System.out.println("....Thank you....");
		
	}
	
	ArgumentConstructor1(int a)
	{
		name = "Mrunal thakur";
		mobno = 70570777779l;
		email = "mrunalthakur@gmail.com";
		age = 32;
		System.out.println("....Personal Information....");
		System.out.println("Name = " + name + "\n" + "Mobile Number = " + mobno + "\n" + " Email ="
				+ email + "\n" + "Age = "+ age );
		System.out.println("....Thank you....");
		
		
	}
	
	ArgumentConstructor1(int a , String name)
	{
		name = "Ashutosh Bhujbal";
		mobno = 7709631644l;
		email = "ashubhujbal754@gmail.com";
		age = 29;
		System.out.println("....Personal Information....");
		System.out.println("Name = " + name + "\n" + "Mobile Number = " + mobno + "\n" + " Email ="
				+ email + "\n" + "Age = "+ age );
		System.out.println("....Thank you....");
		
	}
	 public static void main(String[]args)
	 {
		 new ArgumentConstructor1();
		 new ArgumentConstructor1(10);
		 new ArgumentConstructor1(100,"Me");
	 }
}
