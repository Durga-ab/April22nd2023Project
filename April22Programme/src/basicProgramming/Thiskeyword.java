package basicProgramming;

public class Thiskeyword
{
 byte a = 121;
 char b = 'a';
 int c = 31242;
 
  public void a1()
  {
	  byte a = 120;
	  char b = 'd';
	  int c = 3122;
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(this.a);
	  System.out.println(this.b);
	  System.out.println(this.c);
	  
  }
  
  public static void main(String[]args)
  {
	  Thiskeyword abc = new Thiskeyword();
	  abc.a1();
  }
}
