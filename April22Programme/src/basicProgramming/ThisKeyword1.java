package basicProgramming;

public class ThisKeyword1 
{
 String Name;
 int Mobno;
 
 
 ThisKeyword1()
 {
	Name = "Nisha";
	Mobno = 422605;
	
	
 }
 
 ThisKeyword1(String Name,int Mobno)
 {
	 this.Name = Name;
		this.Mobno = Mobno;
		
	 
 }
 public void a1()
 {
	 System.out.println(" Name = " +Name);
	 System.out.println("Mobile No = " + Mobno);
 }
 public static void main(String[]args)
 {
	 ThisKeyword1 abc = new ThisKeyword1();
	 abc.a1();
	 ThisKeyword1 xyz = new ThisKeyword1("Durga",234234);
	 xyz.a1();
 }
}
