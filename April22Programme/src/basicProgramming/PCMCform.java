package basicProgramming;

public class PCMCform 
{
  String Name;
  String Address;
  int age;
  String Email;
  float Percentage;
  
  PCMCform(String Name1,String Address1,int Age1,String Email1 , float Percentage1)
  {
	 Name = Name1;
	 Address = Address1;
	 age = Age1;
	 Email = Email1;
	 Percentage = Percentage1;
  }
  
  public void a1()
  {
	  System.out.println("....Government Form....");
	  System.out.println(" FullName = " + Name);
	  System.out.println("Address = "+ Address);
	  System.out.println("Age = " + age);
	  System.out.println("Email = " + Email);
	  System.out.println("Percentage = " + Percentage);
	  System.out.println("....Congratulation Details Confirmed....");
  }
  
  public static void main(String [] args)
  {
	  PCMCform abc = new PCMCform ("Durga Soundhiya" , " Pune" , 30 , "jnfifjeiofjlwkdewoi" , 73.2f);
	  abc.a1();
	  PCMCform xyz = new PCMCform ("Nisha Karpe","Sangamner" , 36 , "ihfiehfiehf" , 78.3f);
	  xyz.a1();
  }
}
