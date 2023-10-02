package allLogicalProgram;

public class CountOfEvenAndOddNumber 
{
  public static void main(String[]args)
  {
	  int number=1234;   ////56784321=odd no=4,even no=4
	  
	  int evenNumber=0;
	  int oddNumber=0;
	  
	  while(number>0)
	  {
		 int reminder= number%10; //1234%10=4   //123%10=3  //12%10=2  //1%10=1
		 if(reminder%2==0)  //4%2=2  3%2=  2%2=0  1%2=
		 {
			 evenNumber++;  //1 //2
		 }
		 else
		 {
			 oddNumber++;  //1//2
		 }
		 number=number/10;//1234/10=123  //123/10=12  12/10=1
	  }
	  System.out.println("Even Number:"+evenNumber);
	  System.out.println("Odd Number:"+oddNumber);
  }
}
