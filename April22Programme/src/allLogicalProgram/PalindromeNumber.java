package allLogicalProgram;



public class PalindromeNumber 
{   //Logic
 //A Palindrome number ia a number that remains the same when its digits are reversed/reflectional Symmetry
	//11,22.33....99,101,121,131.....191,202,313,373,383,727,757,787,797,919,929,10301,10501,10601,1131...
 int n;
 int a= n;
 int b=0;
 int c;
 
 public void a1()
 {
	 
	 
	 while(a>0)
	 {              //212
		 c=a%10;   //212%10=2   //21%10=1      //2%10=2
		 b=b*10+c; //0*10+2=2   //2*10+1=21    //21*10+2=212
		 a=a/10;   //212/10=21  //21/10=2      //2/10=0..
		
	 }
	 if(b==n)
	 {
		 System.out.println("This is Palindrome Number:" + n);
	 }
	 else
	 {
		 System.out.println("This is not Palindrome Number:" + n);
	 }
 
	
	
 }
 
 public static void main(String[]args)
 {
	 PalindromeNumber s = new PalindromeNumber();
	 s.a1();
 }
}
