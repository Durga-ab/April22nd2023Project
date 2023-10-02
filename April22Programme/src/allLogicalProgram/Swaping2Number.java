package allLogicalProgram;

public class Swaping2Number 
{
  public static void main(String[]args)
  {
	 
      int a=10;
	  int b=20;
	  
//	  // Logic1
//	  System.out.println("Before swapping values are:"+a+"  "+b);
//	  int t=a;//t=10
//	  a=b;    //a=20
//	  b=t;    //b=10
//	  System.out.println("After Swapping values are:"+a+" "+b);
//	  
	  //Logic2
	  System.out.println("Before swapping values are:"+a+"  "+b);
	  a=a+b;//10+20=30
	  b=a-b;//30-20=10
	  a=a-b;//30-10=20
	  System.out.println("After Swapping values are:"+a+" "+b);
	  
	  
	  //Logic 3
	  
	  System.out.println("Before Swapping values are:"+a+" "+b);
	  a=a*b;//10*20=200
	  b=a/b;//200/20=10
	  a=a/b;//200/10=20
	  System.out.println("After Swapping values are:"+a+" "+b);
  }
}
