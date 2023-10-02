package basicProgramming;

public class StdJavaProgram 
{  //Declaration
	
  String name;
  long mobno;
  String email;
  byte age;
   
  //Initialization + Usage
  public void a1()
  {
	  name = "Durga Soundhiya";
	  mobno = 7057002229l;
	  email = "durgasoundhiya55555@gmail.com";
	  age = 23;
	  System.out.println("...Personal Information.......");
	  System.out.println("1) Name =" + name);
	  System.out.println("2) Mobile Number =" + mobno);
	  System.out.println("3) Age = + age");
	  System.out.println(".......Thank You.......");
  }
  public void a2 ()
{
	  name = "Ashutosh Bhujbal";   // Initialization
	  mobno = 7709631644l;
	  email = "ashubhujbal8177gmail.com";
	  age = 29;
	  System.out.println("...Personal Information......."); //Usage
	  System.out.println("1) Name =" + name);
	  System.out.println("2) Mobile Number =" + mobno);
	  System.out.println("3) Age = "+ age);
	  System.out.println(".......Thank You.......");  
}
  public static void main(String[]args)
  {
	  StdJavaProgram abc = new StdJavaProgram();
	  abc.a1();
	  abc.a2();
  }
}
