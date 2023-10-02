package allLogicalProgram;

public class ArmStrongNumber 
{
	//Logic
	//An Armstrong number is one whose sum of digits to the power three equals the number itself
	//this no is a +ve 'n'th digits no.that is equal to tha sum of the 'n'th power of their digits
	//Ex:371=3*3*3+7*7*7+1*1*1=371      1634=1*1*1*1+6*6*6*6+3*3*3*3+4*4*4*4=1634
	//153,370,371,407,1634,8208,9474,54748,92727,93084,548834.....
 int n=153;
 int a;
 int b=0;      
 int c;
 
 public void a1()         //
 {    n=a;
	 while(a>0)
	 {
		 c=a%10;         //370%10=0      //37%10=7          //3%10=3
		 b=b+(c*c*c);    //0+(0*0*0)=0   //0+(7*7*7)=343    //343+(3*3*3)=370   
		 a=a/10;         //370/10=37     //37/10=3           //3/10=0
	 }
	 if(n==b)
	 {
		 System.out.println("This is armstrong number");
	 }
	 else
	 {
		 System.out.println("not Armstrong number");
	 }
 }
 public static void main (String[]args)
 {
	 ArmStrongNumber s = new ArmStrongNumber();
	 s.a1();
 }
}
