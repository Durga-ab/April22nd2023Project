package basicProgramming;

public class CoronaForm 
{
 //Declaration
	String name;
	long mobno;
	long Aadharno;
	String Address;
	boolean vaccinated;
	
	//Initialization
	CoronaForm(String Fullname1,long Mobno1,long Aadharno1,String Address1, boolean Vaccinated1)
	{
		name = Fullname1;
		mobno = Mobno1;
		Aadharno = Aadharno1;
		Address = Address1;
		vaccinated = Vaccinated1;
		
	}
	
	//Usage
	public void printForm()
	{
		System.out.println("....Corona Details 2022-2023....");
		System.out.println("....GOvernment of India....");
		System.out.println("[1] Name = "+name);
		System.out.println("[2] Mobile Number = "+ mobno);
		System.out.println("[3] Aadhar = " + Aadharno);
		System.out.println("[4] Adress = "+ Address);
		System.out.println("[5] Vaccinated = " + vaccinated);
	}
	public static void main(String[]args)
	{
		CoronaForm DurgaSoundhiya = new CoronaForm("Durga Soundhiya",7057002229l,2435142546l,"Gunjalwadi", true);
		DurgaSoundhiya.printForm();
		
		CoronaForm NisaKarpe = new CoronaForm("Nisha Karpe", 8180825823l,324254655534l,"Janta nagar",false);
		NisaKarpe.printForm();
	}
}
