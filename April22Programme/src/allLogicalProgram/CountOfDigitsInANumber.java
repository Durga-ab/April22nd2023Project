package allLogicalProgram;

public class CountOfDigitsInANumber 
{
 public static void main(String[]args)
 {
	 int num=123456;
	 int count=0;
	 
	 while(num>0)
	 {
		 num=num/10;//123456/10=12345  eliminate last digit & every iteration and emidiatly count value
		 count++;
		 
	 }
	 System.out.println("no of Digits:"+count);
 }
}
