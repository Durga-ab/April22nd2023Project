package allLogicalProgram;

public class FibonacciSeries
{
	//Logic
	//Fibonacci no. is starts with a 0, followed by a one, then by another one, and tehn by a series of
	//Steadily increasing numbers.
	//ex:0 1 1 2 3 5 8 13 21 34 55.....
 int n =20;
 int a =0;
 int b=1;
 int c;
 int i;
                   //0 1 2 3 4 5 6 7 8 9 10 
 public void a1()  //0 1 1 2 3 5 8 13 21 34
 {   
	 System.out.println("Fibonacci Series"); 
	 
 while(i<n)
 {
	 System.out.print(" " +a);
	 c=a+b; //0+1=1 //1+1=2 //1+2=3 //2+3=5  //3+5=8  //5+8=13
	 a=b;  //1      //1    // 2     //3     //5       //8
	 b=c;  //1      //2    //3      //5     //8      //13
	 i++; //1(2)    //2(3) //3(4)  //4(5)   //5(6)  //6(7)
	 
	 
 }
}
 public static void main(String[]args)
 {
	 FibonacciSeries w=new FibonacciSeries();
	 w.a1();
 }
}