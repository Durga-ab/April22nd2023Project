package allLogicalProgram;

public class TableOf3
{
 int i=3;
 
 public void a1()
 {
	 while(i<=30)
	 {
		 System.out.println(i);
		 i+=3;//Assigning Operator
	 }
 }
 public static void main(String[]args)
 {
	 TableOf3 a = new TableOf3();
	 a.a1();
 }
}
