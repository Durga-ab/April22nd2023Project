package basicProgramming;

public class CoronaForm1 
{
 //Declaration
	String Name;
	int Pincode;
	String DOB;
	long MobileNo;
	double percentage;
	
//Initialization
	CoronaForm1(String FullName,int Pincode1, String DateofBirth,long MobileNo1 , double Percentage1)
	{
		Name = FullName;
		Pincode = Pincode1;
		DOB = DateofBirth;
		MobileNo = MobileNo1;
		percentage = Percentage1;
	}
	
	//Usage
	public void printform()
	{
		System.out.println("....Personal Information....");
		System.out.println("Name = " + Name);
		System.out.println(" Pincode = " + Pincode);
		System.out.println("DOB = " + DOB);
		System.out.println("MobileNo = " + MobileNo);
		System.out.println("Percentage = " + percentage);
		System.out.println("....Thank You....");
		
	}
	public static void main(String[]args)
	{
		CoronaForm1 DurgaInfo = new CoronaForm1(" Durga Soundhiya",422605,"21 oct 1999",7057002229l, 72.6d);
		DurgaInfo.printform();
		
		CoronaForm1 LaxmiInfo = new CoronaForm1 (" Laxmi Soundhiya ",422605,"30 aug 1963",7934729922l,67.3d);
		LaxmiInfo.printform();
		
	}
}
