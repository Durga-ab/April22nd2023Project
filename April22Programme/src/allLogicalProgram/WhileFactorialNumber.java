package allLogicalProgram;

public class WhileFactorialNumber 
{
  public void a1()
  {
	  int factor=1;
	  int number=5;
	  int i=1;                        //1*1=1
	                                  //1*2=2
	  while(i<=number)                //2*3=6
	  {                               //6*4=24
		 factor=factor*i;             //24*5=120.....answer
		 System.out.println("Factorial number:" +factor);
		 i++;
	  }
  }
  public static void main(String[]args)
  {
	  WhileFactorialNumber s = new WhileFactorialNumber();
	  s.a1();
  }
}
